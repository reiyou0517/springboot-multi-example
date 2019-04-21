package com.xiaopengwei.springboot.jpa.service.impl;import com.xiaopengwei.springboot.jpa.entity.UserLogin;import com.xiaopengwei.springboot.jpa.repository.UserLoginRepository;import com.xiaopengwei.springboot.jpa.service.IUserLoginService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.stereotype.Service;import java.util.List;/** * <p> * 用户详情业务逻辑层实现 * </p> * * @author XiaoPengwei.com * @since 2019-04-18 */@Servicepublic class UserLoginServiceImpl implements IUserLoginService {    @Autowired    UserLoginRepository userLoginRepository;    @Override    public List<UserLogin> findAll() {        return userLoginRepository.findAll();    }    @Override    public String getUserNameById(int id) {        return userLoginRepository.getOne(id).getUserName();    }}