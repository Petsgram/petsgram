package com.petsgram.mspost.controllers;

import com.petsgram.mspost.repositories.PostRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

}
