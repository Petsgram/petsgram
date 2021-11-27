package com.petsgram.mspost.repositories;

import com.petsgram.mspost.models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
    Iterable<Post> findByOrderByDateDesc();


}
