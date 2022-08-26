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
    public void getUsers() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //底层主要使用反射
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        for (User user : mapper.getUsers()) {
            System.out.println(user);
        }

        sqlSession.close();
    }
}
