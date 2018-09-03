package com.bobo.springboot.student.dao.permission.mapper;

import com.bobo.springboot.student.dao.permission.model.UserRoleRel;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Mapper
public interface UserRoleRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRoleRel record);

    int insertSelective(UserRoleRel record);

    UserRoleRel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRoleRel record);

    int updateByPrimaryKey(UserRoleRel record);
}