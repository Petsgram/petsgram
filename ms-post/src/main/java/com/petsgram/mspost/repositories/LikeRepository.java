package com.petsgram.mspost.repositories;

import com.petsgram.mspost.models.Like;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LikeRepository extends MongoRepository<Like, String> {}
