package com.kuang.dao;

import com.kuang.pojo.Blog;
import com.kuang.utils.IDutils;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

/**
 * @author chenpi
 * @create 2022-08-29 21:41
 */
public class BlogMapperTest {

    @Test
    public void addBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Blog blog = new Blog();
        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis如此简单");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Java如此简单");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring如此简单");
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("微服务如此简单");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void queryBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("title", "Java如此简单");
        map.put("author", "狂神说");

        List<Blog> blogs = mapper.queryBlog(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void queryBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("title", "Java如此简单");
        map.put("author", "狂神说");
        map.put("views", 9999);

        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("id", "9fc991f8b74649e18c8a5d1cc8e38b78");
        map.put("title", "Mybatis如此简单2");
        map.put("author", "狂神说2");

        mapper.updateBlog(map);

        sqlSession.close();
    }

    @Test
    public void queryBlogForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        Map<String, Object> map = new HashMap<>();
        List<String> ids = new ArrayList<>();
        ids.add("896cde822ba64ffd9bf51ec82a9e43a5");
        ids.add("9fc991f8b74649e18c8a5d1cc8e38b78");
        ids.add("467187afec33456486fe978420bf7d05");

        map.put("ids", ids);

        for (Blog blog : mapper.queryBlogForeach(map)) {
            System.out.println(blog);
        }

        sqlSession.close();
    }
}
