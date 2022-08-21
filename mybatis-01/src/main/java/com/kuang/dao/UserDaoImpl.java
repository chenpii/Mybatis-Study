package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-08-21 11:40
 */
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> getUserList() {
        //执行sql语句
        String sql = "select * from mybatis.user;";
        //结果集 ResultSet
        return null;
    }
}
