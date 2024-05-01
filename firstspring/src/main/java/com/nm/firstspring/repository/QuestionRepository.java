package com.nm.firstspring.repository;

import com.nm.firstspring.entity.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, Long> {
}
