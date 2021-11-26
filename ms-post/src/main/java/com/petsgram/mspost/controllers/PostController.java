package com.petsgram.mspost.controllers;

import com.petsgram.mspost.models.Post;
import com.petsgram.mspost.repositories.PostRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PostController {
    private final PostRepository postRepository;

    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @PostMapping("/posts")
    public ResponseEntity<Void> createPost(@RequestBody Post post){
        postRepository.save(post);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}

