package com.petsgram.mspost.models;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Like {
    @Id
    private String id;
    private String postId;
    private String petId;
    private LocalDateTime like_date;
   


    public Like(String id, String postId, String petId, LocalDateTime like_date) {
        this.id = id;
        this.postId = postId;
        this.petId = petId;
        this.like_date = like_date;
        
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public LocalDateTime getLike_date() {
        return like_date;
    }

    public void setLike_date(LocalDateTime like_date) {
        this.like_date = like_date;
    }

    
}
