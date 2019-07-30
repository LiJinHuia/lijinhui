package com.qianfeng.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qianfeng.dao.HouseMapper;
import com.qianfeng.pojo.House;
import com.qianfeng.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HouseServiceImpl implements HouseService {

    @Autowired
    private HouseMapper houseDao;

    @Override
    public List<House> findAll(int star, int size) {
        List<House> list = null;
        try {
            list = houseDao.findAll(star, size);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<House> findByRegion(int rid) {
        List<House> list = null;
        try {
            list = houseDao.findByRegion(rid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<House> findByPid(int pid) {
        List<House> list = null;
        try {
            list = houseDao.findByPid(pid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<House> findByFid(int fid) {
        List<House> list = null;
        try {
            list = houseDao.findByFid(fid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<House> findByAid(int aid) {
        List<House> list = null;
        try {
            list = houseDao.findByAid(aid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<House> findByHid(int hid) {
        List<House> list = null;
        try {
            list = houseDao.findByHid(hid);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public House findById(int id) {
        House house = null;
        try {
            house = houseDao.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return house;
    }

    @Override
    public List<House> queryByRent() {
        List<House> list = null;
        try {
            list = houseDao.queryRent();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }

    @Override
    public List<House> queryByRtime() {
        List<House> list = null;
        try {
            list = houseDao.queryRtime();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
        return list;
    }
}
