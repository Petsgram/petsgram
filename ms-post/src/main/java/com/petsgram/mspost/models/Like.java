package com.petsgram.mspost.models;

import java.time.LocalDateTime;

public class Like {
    private String id;
    private String idPost;
    private String idUser;
    private LocalDateTime like_date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdPost() {
        return idPost;
    }

    public void setIdPost(String idPost) {
        this.idPost = idPost;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public LocalDateTime getLike_date() {
        return like_date;
    }

    public void setLike_date(LocalDateTime like_date) {
        this.like_date = like_date;
    }
}
