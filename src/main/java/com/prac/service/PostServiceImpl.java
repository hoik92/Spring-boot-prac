package com.prac.service;

import com.prac.dao.PostMapper;
import com.prac.domain.posts.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMapper;

    @Override
    public List<Posts> findAll() {
        return postMapper.findAll();
    }

    @Override
    public Posts findById(int id) {
        return postMapper.findById(id);
    }

    @Override
    public void insert(Posts post) {
        postMapper.insert(post);
    }

    @Override
    public void update(Posts post) {
        postMapper.update(post);
    }

    @Override
    public void delete(int id) {
        postMapper.delete(id);
    }
}
