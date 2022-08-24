package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();
}
