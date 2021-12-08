package com.petsgram.mspost.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;

import com.petsgram.mspost.exceptions.PostNotFoundException;
import com.petsgram.mspost.models.Comment;
import com.petsgram.mspost.models.Post;
import com.petsgram.mspost.repositories.CommentRepository;
import com.petsgram.mspost.repositories.PostRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    public CommentController(CommentRepository commentRepository, PostRepository postRepository) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;  
    }

    @PostMapping("/posts/comment")
    public Comment postComment(@RequestBody Comment comment) {
        Post post = postRepository.findById(comment.getId_post()).orElse(null);
        if (post == null) throw new PostNotFoundException("Post not found");
        if (post.getComments() == null) post.setComments(new ArrayList<>());
        comment.setDate(LocalDateTime.now());
        Comment commentSaved = commentRepository.save(comment);
        post.addComment(commentSaved);
        postRepository.save(post);
        return commentSaved;
    }

}
