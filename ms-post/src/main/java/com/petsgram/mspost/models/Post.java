package com.petsgram.mspost.models;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private String id;
    private String username;
    private String description;
    private LocalDateTime date;
    private Image image;
    private List<Like> likes;
    private List<Comment> comments;

    public Post(String id, String username, String description, LocalDateTime date, Image images,
                List<Like> likes, List<Comment> comments) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.date = date;
        this.image = images;
        this.likes = likes;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Like> getLikes() {
        return likes;
    }

    public void setLikes(List<Like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
