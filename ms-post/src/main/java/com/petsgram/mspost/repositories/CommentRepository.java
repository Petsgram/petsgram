package com.petsgram.mspost.repositories;

import com.petsgram.mspost.models.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {}
