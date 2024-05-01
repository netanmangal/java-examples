package com.nm.firstspring.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.nm.firstspring.entity.Question;
import com.nm.firstspring.service.QuestionService;

@RestController
@RequestMapping("/ques")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/getAll")
    public List<Question> GetAllQuestionList() {
        return questionService.getAllQuestions();
    }

    @PostMapping
    public String AddQuestion(@RequestBody Question ques) {
        questionService.saveQuestion(ques);
        return "Added new question.";
    }

    @GetMapping("/id/{qid}")
    public Question getQuestionById(@PathVariable Long qid) {
        return questionService.findById(qid).orElse(null);
    }

    @DeleteMapping("/id/{qid}")
    public String deleteQuestionById(@PathVariable Long qid) {
        questionService.deleteById(qid);
        return "Question deleted.";
    }

    @PutMapping("/id/{qid}")
    public String updateQuestionById(@PathVariable Long qid, @RequestBody Question ques) {
        questionService.updateById(qid, ques);
        return "Question updated.";
    }
}
