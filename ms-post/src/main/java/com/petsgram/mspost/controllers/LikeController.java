package com.petsgram.mspost.controllers;

import com.petsgram.mspost.repositories.LikeRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LikeController {
    private final LikeRepository likeRepository;

    public LikeController(LikeRepository likeRepository) {
        this.likeRepository = likeRepository;
    }


}
