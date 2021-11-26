package com.petsgram.mspost.controllers;

import com.petsgram.mspost.exceptions.LikeAlreadyCreatedException;
import com.petsgram.mspost.exceptions.LikeNotFoundException;
import com.petsgram.mspost.exceptions.PostNotFoundException;
import com.petsgram.mspost.models.Like;
import com.petsgram.mspost.models.Post;
import com.petsgram.mspost.repositories.LikeRepository;
import com.petsgram.mspost.repositories.PostRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;

@RestController
public class LikeController {
    private final LikeRepository likeRepository;
    private final PostRepository postRepository;

    public LikeController(LikeRepository likeRepository, PostRepository postRepository) {
        this.postRepository = postRepository;
        this.likeRepository = likeRepository;
    }

    @PostMapping("/posts/like")
    public Like addLike(@RequestBody Like like) {
        Post post = postRepository.findById(like.getPostId()).orElse(null);
        if (post == null) throw new PostNotFoundException("Post not found");
        if (post.getLikes() == null) post.setLikes(new ArrayList<>());
        if (likeRepository.findByPetIdAndPostId(like.getPetId(), like.getPostId()) != null)
            throw new LikeAlreadyCreatedException("Like already created");
        like.setLike_date(LocalDateTime.now());
        Like likeSaved = likeRepository.save(like);
        post.addLike(likeSaved);
        postRepository.save(post);
        return likeSaved;
    }

    @PostMapping("/posts/unlike")
    public Like unlike(@RequestBody Like like) {
        Post post = postRepository.findById(like.getPostId()).orElse(null);
        if (post == null) throw new PostNotFoundException("Post not found");
        if (post.getLikes() == null) throw new LikeNotFoundException("Like not found");
        Like likeToDelete = likeRepository.findByPetIdAndPostId(like.getPetId(), like.getPostId());
        if (likeToDelete == null) throw new LikeNotFoundException("Like not found");
        post.removeLike(likeToDelete);
        postRepository.save(post);
        likeRepository.delete(likeToDelete);
        return likeToDelete;
    }


}
