package com.qianfeng.dao;

import com.qianfeng.pojo.Company;
import org.apache.ibatis.annotations.Select;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);

    @Select("select * from t_company")
    Company selectAll();
}