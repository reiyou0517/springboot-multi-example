package com.xiaopengwei.springboot.rabbitmq.entity;import java.io.Serializable;/** * <p> * 实体类 * </p> * * @author XiaoPengwei.com * @since 2019-04-20 */public class User implements Serializable {    private String name;    private String pass;    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public String getPass() {        return pass;    }    public void setPass(String pass) {        this.pass = pass;    }    @Override    public String toString() {        return "User{" +                "name='" + name + '\'' +                ", pass='" + pass + '\'' +                '}';    }}