package com.petsgram.mspost.repositories;

import java.util.List;

import com.petsgram.mspost.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
    Iterable<Post> findByOrderByDateDesc();
    List<Post> findByUsername(String username);
    List<Post> findByUsernameOrderByDateDesc(String username);
}
