package com.bobo.springboot.student.dao.permission.model;

import java.util.Date;
import lombok.Data;

/**
* Created by Mybatis Generator 2018/09/03
*/
@Data
public class Menu {
    /** */
    private Integer id;

    /** */
    private String url;

    /** */
    private Date createTime;

    /** */
    private String icon;

    /** */
    private String name;
}