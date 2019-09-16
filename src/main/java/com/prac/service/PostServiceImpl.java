package com.prac.service;

import com.prac.dao.BoardMapper;
import com.prac.domain.posts.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    BoardMapper boardMapper;

    @Override
    public List<Posts> findAll() {
        return boardMapper.findAll();
    }

    @Override
    public Posts findById(int id) {
        return boardMapper.findById(id);
    }

    @Override
    public void insert(Posts post) {
        boardMapper.insert(post);
    }

    @Override
    public void update(Posts post) {
        boardMapper.update(post);
    }

    @Override
    public void delete(int id) {
        boardMapper.delete(id);
    }
}
