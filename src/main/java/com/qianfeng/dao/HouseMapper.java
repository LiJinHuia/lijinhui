package com.qianfeng.dao;

import com.qianfeng.pojo.House;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HouseMapper {
    int deleteByPrimaryKey(Integer hid);

    int insert(House record);

    int insertSelective(House record);

    // 根据房子的编号查询房子信息
    House selectByPrimaryKey(Integer hid);

    int updateByPrimaryKeySelective(House record);

    int updateByPrimaryKey(House record);

    // 展示所有房源的信息
    @Select("select * from t_house limit #{star}, #{size}")
    List<House> findAll(@Param("star") int star, @Param("size") int size);

    @Select("select * from t_house where rid=#{rid}")
    List<House> findByRegion(int rid);

    @Select("select * from t_house where pid=#{pid}")
    List<House> findByPid(int pid);

    @Select("select * from t_house where fid=#{fid}")
    List<House> findByFid(int fid);

    @Select("select * from t_house where aid=#{aid}")
    List<House> findByAid(int aid);

    @Select("select * from t_house where hxid=#{hid}")
    List<House> findByHid(int hid);

    @Select("select * from t_house order by rent DESC")
    List<House> queryRent();

    @Select("select * from t_house order by rtime DESC")
    List<House> queryRtime();
}