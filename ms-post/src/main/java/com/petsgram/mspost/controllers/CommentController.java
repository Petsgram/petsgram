package com.petsgram.mspost.controllers;

import com.petsgram.mspost.repositories.CommentRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    private final CommentRepository commentRepository;

    public CommentController(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
}
