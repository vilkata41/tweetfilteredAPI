package com.example.tweetfilteredAPI.post;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class PostController {

    private final PostService pservice;

    @Autowired
    public PostController(PostService pservice) {this.pservice = pservice;}

    @RequestMapping(path = "/api/tweetfilteredV1/all")
    @GetMapping
    public List<Post> getPosts(){return pservice.getPosts();}

    @RequestMapping(path = "/api/tweetfilteredV1/recent")
    @GetMapping
    public Post getPost(){return pservice.getRecent();}
}
