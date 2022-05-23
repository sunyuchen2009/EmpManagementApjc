package com.emp.empmanagement.bean;

import java.io.Serializable;

/**
 * (Course)实体类
 *
 * @author makejava
 * @since 2022-05-21 14:39:57
 */
public class Course implements Serializable {
    private static final long serialVersionUID = -66621189376825456L;
    
    private Integer id;
    
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}