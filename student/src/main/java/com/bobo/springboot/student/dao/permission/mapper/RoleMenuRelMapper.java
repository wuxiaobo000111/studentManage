package com.bobo.springboot.student.dao.permission.mapper;

import com.bobo.springboot.student.dao.permission.model.RoleMenuRel;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Mapper
public interface RoleMenuRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenuRel record);

    int insertSelective(RoleMenuRel record);

    RoleMenuRel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenuRel record);

    int updateByPrimaryKey(RoleMenuRel record);
}