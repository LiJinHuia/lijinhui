package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.House;
import com.qianfeng.service.HouseService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HouseController {

    @Autowired
    private HouseService houseService;

    @RequestMapping("/list.do")
    @ResponseBody
    public JsonBean findAll(int star, int limit) {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.findAll(star, limit);
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/queryRegion.do")
    @ResponseBody
    public JsonBean findByRegion(int rid) {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.findByRegion(rid);
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/queryRent.do")
    @ResponseBody
    public JsonBean findByPid(int pid) {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.findByPid(pid);
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/queryRform.do")
    @ResponseBody
    public JsonBean findByFid(int fid) {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.findByFid(fid);
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/queryArea.do")
    @ResponseBody
    public JsonBean findByAid(int aid) {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.findByAid(aid);
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/queryHtype.do")
    @ResponseBody
    public JsonBean findByid(int hid) {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.findByHid(hid);
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/house.do")
    @ResponseBody
    public JsonBean findById(int hid) {
        JsonBean bean = null;
        House house = null;
        try {
            house = houseService.findById(hid);
            bean = JsonUtils.createJsonBean(1, house);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    // 根据租金价格的降序
    @RequestMapping("/findRent.do")
    @ResponseBody
    public JsonBean findByRent() {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.queryByRent();
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }

    @RequestMapping("/queryRtime.do")
    @ResponseBody
    public JsonBean findByRtime() {
        JsonBean bean = null;
        List<House> list = null;
        try {
            list = houseService.queryByRtime();
            bean = JsonUtils.createJsonBean(1, list);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());

        }
        return bean;
    }


}
