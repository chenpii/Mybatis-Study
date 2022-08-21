package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-08-21 11:47
 */
public class UserDaoTest {
    @Test
    public void test() {

        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {

            //第二步：执行SQL
            //方式一：getMapper
            UserDao userDao = sqlSession.getMapper(UserDao.class);
            List<User> userList = userDao.getUserList();


            //方式二：不推荐
            //List<User> userList = sqlSession.selectList("com.kuang.dao.UserDao.getUserList");

            for (User user : userList) {
                System.out.println(user);
            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            //关闭SqlSession
            sqlSession.close();
        }

    }
}
