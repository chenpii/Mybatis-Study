package com.kuang.dao;

import com.kuang.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author chenpi
 * @create 2022-08-29 21:39
 */
public interface BlogMapper {

    //插入数据
    int addBlog(Blog blog);

    //查询博客
    List<Blog> queryBlog(Map map);

    List<Blog> queryBlogChoose(Map map);

    //更新博客
    int updateBlog(Map map);
}
