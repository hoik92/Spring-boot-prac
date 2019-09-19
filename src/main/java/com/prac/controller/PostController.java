package com.prac.controller;


import com.prac.domain.posts.Posts;
import com.prac.service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class PostController {

    private static Logger logger = LoggerFactory.getLogger(PostController.class);

    @Autowired
    PostService postService;

    @GetMapping("/post")
    public List<Posts> findAll() {
        return postService.findAll();
    }

    @GetMapping("/post/{id}")
    public Posts findById(@PathVariable("id") int id) throws Exception {
        Posts post = postService.findById(id);
        return post;
    }

    @PostMapping("/post")
    public void create(@RequestBody Posts post) throws Exception {
        postService.insert(post);
    }

    @RequestMapping(value = "/post/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) throws Exception {
        postService.delete(id);
    }

    @GetMapping("/test")
    public String test() throws Exception {
        return "hello";
    }
}
