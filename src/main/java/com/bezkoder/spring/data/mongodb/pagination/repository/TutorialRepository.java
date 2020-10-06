package com.bezkoder.spring.data.mongodb.pagination.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.bezkoder.spring.data.mongodb.pagination.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  Page<Tutorial> findByPublished(boolean published, Pageable pageable);

  Page<Tutorial> findByTitleContainingIgnoreCase(String title, Pageable pageable);
}
