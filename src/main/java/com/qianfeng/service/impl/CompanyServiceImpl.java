package com.qianfeng.service.impl;

import com.qianfeng.dao.CompanyMapper;
import com.qianfeng.pojo.Company;
import com.qianfeng.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyDao;

    @Override
    public Company findAll() {
        Company company = null;
        try {
            company = companyDao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return company;
    }
}
