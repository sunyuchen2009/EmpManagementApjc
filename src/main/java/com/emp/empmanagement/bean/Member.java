package com.emp.empmanagement.bean;

import java.io.Serializable;

/**
 * (Member)实体类
 *
 * @author makejava
 * @since 2022-05-21 14:39:58
 */
public class Member implements Serializable {
    private static final long serialVersionUID = 488560802577294430L;
    
    private Integer id;
    
    private String name;
    
    private Integer age;
    
    private String gender;
    
    private String tel;
    
    private String adress;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}