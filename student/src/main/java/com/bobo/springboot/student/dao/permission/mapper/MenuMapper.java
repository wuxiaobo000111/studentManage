package com.bobo.springboot.student.dao.permission.mapper;

import com.bobo.springboot.student.dao.permission.model.Menu;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Mapper
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}