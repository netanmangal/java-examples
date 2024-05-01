package com.nm.firstspring.service;

import com.nm.firstspring.entity.Question;
import com.nm.firstspring.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public void saveQuestion(Question ques) {
        questionRepository.save(ques);
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public Optional<Question> findById(Long id) {
        return questionRepository.findById(id);
    }

    public void deleteById(Long id) {
        questionRepository.deleteById(id);
    }

    public void updateById(Long id, Question ques) {
        if (questionRepository.findById(id).isPresent()) {
            questionRepository.save(ques);
        }
    }
}
