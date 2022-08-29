package com.kuang.dao;

import com.kuang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author chenpi
 * @create 2022-08-29 20:34
 */
public interface TeacherMapper {

    //获取老师
    List<Teacher> getTeacherList();

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    //获取指定老师下的所有学生及老师的信息
    Teacher getTeacher2(@Param("tid") int id);

}
