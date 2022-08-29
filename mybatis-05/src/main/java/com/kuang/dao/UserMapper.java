package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-08-21 11:35
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    // 方法存在多个参数，所有的参数前面必须加上@Param
    @Select("select * from user where id = #{id} ")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name = #{name},pwd = #{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{uid}")
    int delUser(@Param("uid") int id);

}
