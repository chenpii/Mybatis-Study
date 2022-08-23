package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;


/**
 * @author chenpi
 * @create 2022-08-21 11:47
 */
public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);

    @Test
    public void test_getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        logger.info("测试，进入了test_getUserById方法成功！");

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);

        System.out.println(user);

        //关闭SqlSession
        sqlSession.close();

    }

    @Test
    public void testLog4j() {
        logger.info("info:进入了testLog4j方法");
        logger.debug("debug:进入了testLog4j方法");
        logger.error("error:进入了testLog4j方法");
    }

}
