package com.qianfeng.controller;

import com.qianfeng.common.JsonBean;
import com.qianfeng.pojo.Company;
import com.qianfeng.service.CompanyService;
import com.qianfeng.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @RequestMapping("/company.do")
    @ResponseBody
    public JsonBean findAll() {
        JsonBean bean = null;
        Company company = null;
        try {
            company = companyService.findAll();
            bean = JsonUtils.createJsonBean(1, company);
        } catch (Exception e) {
            e.printStackTrace();
            bean = JsonUtils.createJsonBean(0, e.getMessage());
        }
        return bean;
    }
}
