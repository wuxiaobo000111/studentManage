package com.bobo.springboot.student.dao.student.model;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Data
public class Teacher {
    /** 主键id*/
    private Integer id;

    /** 姓名*/
    private String name;

    /** 工号
*/
    private String number;

    /** 联系电话
*/
    private String phone;
}