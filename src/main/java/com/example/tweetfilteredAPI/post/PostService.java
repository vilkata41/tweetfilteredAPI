package com.example.tweetfilteredAPI.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    TwitterInfo ti = new TwitterInfo();
    public List<Post> getPosts(){
        return ti.getPosts();
    }

    public Post getRecent(){
        return ti.getRecent();
    }
}
