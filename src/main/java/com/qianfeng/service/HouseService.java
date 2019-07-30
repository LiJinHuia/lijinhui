package com.qianfeng.service;

import com.qianfeng.pojo.House;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface HouseService {
    // 查询所有字典数据
    public List<House> findAll(int star, int size);

    public List<House> findByRegion(int rid);

    public List<House> findByPid(int pid);

    public List<House> findByFid(int fid);

    public List<House> findByAid(int aid);

    public List<House> findByHid(int hid);

    public House findById(int id);

    public List<House> queryByRent();

    public List<House> queryByRtime();
}
