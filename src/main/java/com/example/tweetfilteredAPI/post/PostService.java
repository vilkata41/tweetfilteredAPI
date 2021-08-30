package com.example.tweetfilteredAPI.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/*
This class acts as a service layer for the API. It reaches for the getPosts method in the TwitterInfo class and delivers it
to the controller layer of the API.
 */
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
