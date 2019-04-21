package com.xiaopengwei.springboot.jdbc.controller;import com.xiaopengwei.springboot.jdbc.entity.UserLogin;import com.xiaopengwei.springboot.jdbc.service.IUserLoginService;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;import java.util.List;import java.util.Map;/** * <p> * 用户登录注册 * </p> * * @author XiaoPengwei.com * @since 2019-04-19 */@RestController@RequestMapping("/user")public class UserLoginController {    @Autowired    IUserLoginService userLoginServiceImpl;    /**     * 添加用户     *     * @return int     * @author XiaoPengwei.com     */    @GetMapping("/add")    public int addUser() {        UserLogin userLogin = new UserLogin();        userLogin.setId(12);        userLogin.setEmail("xpwi@qq.com");        userLogin.setPassword("123456");        userLogin.setPhone("12345678900");        return userLoginServiceImpl.insert(userLogin);    }    /**     * 查询所有用户     *     * @return java.lang.String     * @author XiaoPengwei.com     */    @GetMapping("/list")    public List<Map<String, Object>> getUserNameById() {        return userLoginServiceImpl.findUserList();    }}