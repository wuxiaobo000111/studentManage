package com.bobo.springboot.student.dao.permission.mapper;

import com.bobo.springboot.student.dao.permission.model.Role;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}