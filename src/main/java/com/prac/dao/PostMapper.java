package com.prac.dao;

import com.prac.domain.posts.Posts;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostMapper {

    @Select("select * from posts")
    public List<Posts> findAll();

    @Select("select * from posts where id=#{id}")
    public Posts findById(int id);

    @Insert("insert into posts(name, content) values(#{name}, #{content})")
    public void insert(Posts post);

    @Update("update posts set content=#{content} where id=#{id}")
    public void update(Posts post);

    @Delete("delete from posts where id=#{id}")
    public void delete(int id);
}
