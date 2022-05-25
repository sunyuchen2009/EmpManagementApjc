package com.emp.empmanagement.bean;

import java.io.Serializable;

/**
 * (Grade)实体类
 *
 * @author makejava
 * @since 2022-05-21 14:39:57
 */
public class Grade implements Serializable {
    private static final long serialVersionUID = 640146997583438367L;
    
    private Integer id;
    
    private String name;
    
    private String courseName;
    
    private Integer grade;


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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courseName='" + courseName + '\'' +
                ", grade=" + grade +
                '}';
    }
}