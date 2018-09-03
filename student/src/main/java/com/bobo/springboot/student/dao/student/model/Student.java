package com.bobo.springboot.student.dao.student.model;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Data
public class Student {
    /** 主键Id*/
    private Integer id;

    /** 学生学号*/
    private String number;

    /** 学生姓名*/
    private String name;

    /** 学生年龄*/
    private Integer age;

    /** 身份证号码
*/
    private String idcardNo;

    /** 学生出生年月日*/
    private Date birth;

    /** 学生地址
*/
    private String address;

    /** 学生性别*/
    private Byte gender;

    /** 学生图片信息*/
    private String picture;
}