package com.prac.service;

import com.prac.domain.posts.Posts;

import java.util.List;

public interface PostService {

    public List<Posts> findAll();
    public Posts findById(int id);
    public void insert(Posts post);
    public void update(Posts post);
    public void delete(int id);
}
