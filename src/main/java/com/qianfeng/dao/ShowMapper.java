package com.qianfeng.dao;

import com.qianfeng.pojo.Show;

import java.util.List;

public interface ShowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Show record);

    int insertSelective(Show record);

    Show selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Show record);

    int updateByPrimaryKey(Show record);

    // 绑定多条件查询时的所有条件展示
    List<Show> findAll();

}