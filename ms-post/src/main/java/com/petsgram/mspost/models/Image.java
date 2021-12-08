package com.petsgram.mspost.models;

import java.util.UUID;

public class Image {
    private String url;

    private String id;

    public Image(String url) {
        this.url = url;
        this.id = UUID.randomUUID().toString();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
