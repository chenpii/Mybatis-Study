package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenpi
 * @create 2022-08-21 11:47
 */
public class UserMapperTest {

    @Test
    public void test_getUserLike() {


        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserLike("%李%");

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

    @Test
    public void test_getUserList() {

        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {

            //第二步：执行SQL
            //方式一：getMapper
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = mapper.getUserList();


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

    @Test
    public void test_getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(mapper.getUserById(1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void test_getUserById2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        try {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            HashMap<String, Object> map = new HashMap<>();
            map.put("id", 2);
            map.put("name", "赵五");

            System.out.println(mapper.getUserById2(map));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }

    //增删改需提交事务
    @Test
    public void test_addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(4, "赵五", "888888"));

        if (res > 0) {
            System.out.println("插入成功！");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<>();

        map.put("userId", 4);
        map.put("userName", "赵五");
        map.put("userPwd", "888888");

        int res = mapper.addUser2(map);

        if (res > 0) {
            System.out.println("插入成功！");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.updateUser(new User(4, "赵四", "1111111"));

        if (res > 0) {
            System.out.println("修改成功！");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_delUerById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.delUerById(4);

        if (res > 0) {
            System.out.println("删除成功！");
        }

        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }
}
