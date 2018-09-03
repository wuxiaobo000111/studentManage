package com.bobo.springboot.student.dao.permission.model;

import lombok.Data;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Data
public class User {
    /** */
    private Integer id;

    /** */
    private String username;

    /** */
    private String password;

    /** */
    private Integer pictureUrl;
}