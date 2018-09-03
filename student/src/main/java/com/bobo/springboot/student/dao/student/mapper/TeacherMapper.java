package com.bobo.springboot.student.dao.student.mapper;

import com.bobo.springboot.student.dao.student.model.Teacher;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Mapper
public interface TeacherMapper {
    int insert(Teacher record);

    int insertSelective(Teacher record);
}