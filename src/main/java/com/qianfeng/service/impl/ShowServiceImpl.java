package com.qianfeng.service.impl;

import com.qianfeng.dao.ShowMapper;
import com.qianfeng.pojo.Show;
import com.qianfeng.service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowServiceImpl implements ShowService {

    @Autowired
    private ShowMapper showDao;

    @Override
    public List<Show> findAll() {
        List<Show> list = null;
        try {
            list = showDao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }
}
