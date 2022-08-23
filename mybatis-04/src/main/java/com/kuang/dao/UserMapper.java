package com.kuang.dao;

import com.kuang.pojo.User;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserMapper {

    //根据ID查用户
    User getUserById(int id);

}
