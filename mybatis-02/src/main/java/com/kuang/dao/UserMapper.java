package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserMapper {

    //查询全部用户
    List<User> getUserList();

    //根据ID查用户
    User getUserById(int id);

    //新增用户
    int addUser(User user);

    //修改用户
    int updateUser(User user);

    //删除用户
    int delUerById(int id);
}
