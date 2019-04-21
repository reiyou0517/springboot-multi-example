package com.xiaopengwei.springboot.multi.sources.mapper;

import com.xiaopengwei.springboot.multi.sources.entity.UserInfo;

import java.util.List;

public interface UserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    int insert(UserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    UserInfo selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    List<UserInfo> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_info
     *
     * @mbggenerated Fri May 27 01:50:31 CST 2016
     */
    int updateByPrimaryKey(UserInfo record);
}