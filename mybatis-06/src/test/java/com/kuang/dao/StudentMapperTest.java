package com.kuang.dao;

import com.kuang.pojo.Student;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

public class StudentMapperTest {
    static Logger logger = Logger.getLogger(StudentMapperTest.class);

    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent()) {
            logger.info(student);
        }

        sqlSession.close();
    }
    @Test
    public void getStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.getStudent2()) {
            logger.info(student);
        }

        sqlSession.close();
    }
}
