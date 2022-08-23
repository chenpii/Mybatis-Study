package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


/**
 * @author chenpi
 * @create 2022-08-21 11:47
 */
public class UserMapperTest {

    @Test
    public void test_getUserById() {

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);

        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();

    }

}
