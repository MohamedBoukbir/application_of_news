package com.nosql.miniprojet.repository;

import java.util.List;
import java.util.Optional;

import com.nosql.miniprojet.entity.NewsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends MongoRepository<NewsEntity, String> {
    Optional<List<NewsEntity>> findByUserId(String id);
    Optional<List<NewsEntity>> findByUserIdOrderByCreatedAtDesc(String id);
    
}
