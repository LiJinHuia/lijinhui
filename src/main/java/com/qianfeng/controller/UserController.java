package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.User;
import com.qianfeng.service.UserService;
import com.qianfeng.utils.JsonUtils;
import com.sun.deploy.net.HttpRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonBean uploadFile(User user, HttpServletRequest request) {
        JsonBean bean = null;
        User user1 = new User();
        // 1 创建DiskFileItemFactory对象
        DiskFileItemFactory itemFactory = new DiskFileItemFactory();
        // 2 根据工厂对象创建ServletFileUpload对象
        ServletFileUpload fileUpload = new ServletFileUpload(itemFactory);

        // 3判断是否multipart/form-data
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        if (ServletFileUpload.isMultipartContent(multipartRequest)) {
            try {
                // 通过请求对象获取提交的数据，转为FileItem列表
                List<FileItem> parseRequest = fileUpload.parseRequest(multipartRequest);
                // 遍历列表
                for (FileItem fileItem : parseRequest) {
                    // 判断是否是普通的提交数据
                    if (fileItem.isFormField()) {
                        BeanUtils.copyProperties(user1, user);
                    } else {
                        // 文件数据操作
                        //设置服务器上保存文件的目录
                        String path = "D:/upload";

                        // 如果目录不存在，创建
                        File file = new File(path);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        // 获取上传文件的文件名
                        String name = fileItem.getName();

                        // 全球唯一id
                        //System.out.println(UUID.randomUUID());
                        String uuid = UUID.randomUUID().toString().replace("-", "");
                        // 生成一个新的文件名
                        name = uuid + "-" + name;
                        // 保存文件
                        File fileInfo = new File(path, name);
                        fileItem.write(fileInfo);
                        // 清除缓存数据
                        fileItem.delete();

                        // 设置图片路径
                        user1.setIcon(name);
                    }
                }


            } catch (FileUploadException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                bean = JsonUtils.createJsonBean(0, e.getMessage());
            }
        }

        // 向数据库添加数据
        try {
            userService.updateUser(user);
            bean = JsonUtils.createJsonBean(1, null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }
        return bean;
    }

    @RequestMapping("/update1.do")
    @ResponseBody
    public JsonBean uploadFile(User user) {

        JsonBean bean = null;
        try {
            userService.updateUser(user);
            bean = JsonUtils.createJsonBean(1, null);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }
        return bean;
    }
}

