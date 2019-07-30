package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.Show;
import com.qianfeng.service.ShowService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShowController {
    @Autowired
    private ShowService showService;

    @RequestMapping("/list1.do")
    @ResponseBody
    public JsonBean findAll() {
        JsonBean bean = null;
        List<Show> list = null;
        try {
            list = showService.findAll();
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }
        return bean;
    }
}
