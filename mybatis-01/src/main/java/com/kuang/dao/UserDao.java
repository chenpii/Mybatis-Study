package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserDao {
    List<User> getUserList();
}
