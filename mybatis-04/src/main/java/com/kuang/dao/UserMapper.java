package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserMapper {

    //根据ID查用户
    User getUserById(int id);

    //分页
    List<User> getUserLimit(Map<String, Integer> map);
}
