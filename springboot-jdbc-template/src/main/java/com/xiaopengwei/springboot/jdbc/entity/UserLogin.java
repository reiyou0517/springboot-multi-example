package com.xiaopengwei.springboot.jdbc.entity;import java.util.Date;/** * <p> * 实体类 * </p> * * @author XiaoPengwei.com * @since 2019-04-19 */public class UserLogin {    private int id;    private String userName;    private String password;    private String email;    private String phone;    private Date registerTime;    public int getId() {        return id;    }    public void setId(int id) {        this.id = id;    }    public String getUserName() {        return userName;    }    public void setUserName(String userName) {        this.userName = userName;    }    public String getPassword() {        return password;    }    public void setPassword(String password) {        this.password = password;    }    public String getEmail() {        return email;    }    public void setEmail(String email) {        this.email = email;    }    public String getPhone() {        return phone;    }    public void setPhone(String phone) {        this.phone = phone;    }    public Date getRegisterTime() {        return registerTime;    }    public void setRegisterTime(Date registerTime) {        this.registerTime = registerTime;    }}