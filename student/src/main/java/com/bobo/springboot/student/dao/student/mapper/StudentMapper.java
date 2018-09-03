package com.bobo.springboot.student.dao.student.mapper;

import com.bobo.springboot.student.dao.student.model.Student;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Mapper
public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}