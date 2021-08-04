package com.example.tweetfilteredAPI.post;

import java.util.List;

public class Post {

    private Long id;
    private String name;
    private String text;
    private List<String> media;

    public Post() {
    }

    public Post(Long id, String name, String text, List<String> media) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.media = media;
    }

    public Post(String name, String text, List<String> media) {
        this.name = name;
        this.text = text;
        this.media = media;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getMedia() {
        return media;
    }

    public void setMedia(List<String> media) {
        this.media = media;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", media=" + media +
                '}';
    }
}
