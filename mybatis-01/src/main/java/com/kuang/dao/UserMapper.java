package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserMapper {

    List<User> getUserLike(String name);

    //查询全部用户
    List<User> getUserList();

    //根据ID查用户
    User getUserById(int id);

    User getUserById2(Map<String, Object> map);

    //新增用户
    int addUser(User user);

    //万能的Map
    int addUser2(Map<String, Object> map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int delUerById(int id);
}
