package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;



public class TestUserMapper {
    @Test
    public void test_getUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user = mapper.queryUserByID(1);
        System.out.println(user);

        //Map<String, Object> map = new HashMap<>();
        //map.put("id", 1);
        //map.put("name", "狂神2");
        //map.put("pwd", "888888");
        //mapper.updateUser(map);

        sqlSession.clearCache();//手动清理一级缓存

        System.out.println("==================================================");
        User user2 = mapper.queryUserByID(1);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession.close();

    }

    @Test
    public void test_getUsers2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);

        User user = mapper.queryUserByID(1);
        System.out.println(user);

        sqlSession.close();
        System.out.println("==================================================");
        User user2 = mapper2.queryUserByID(1);
        System.out.println(user2);
        System.out.println(user == user2);

        sqlSession2.close();

    }
}
