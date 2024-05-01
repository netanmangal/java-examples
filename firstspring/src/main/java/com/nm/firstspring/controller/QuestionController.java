package com.nm.firstspring.controller;

import com.nm.firstspring.controller.entity.Question;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/ques")
public class QuestionController {
    private final HashMap<Long, Question> questionList = new HashMap<Long, Question>();

    @GetMapping("/getAll")
    public List<Question> GetAllQuestionList() {
        return new ArrayList<>(questionList.values());
    }

    @PostMapping
    public String AddQuestion(@RequestBody Question ques) {
        questionList.put(ques.getId(), ques);
        return "Added new question.";
    }

    @GetMapping("/id/{qid}")
    public Question getQuestionById(@PathVariable Long qid) {
        return questionList.get(qid);
    }

    @DeleteMapping("/id/{qid}")
    public String deleteQuestionById(@PathVariable Long qid) {
        questionList.remove(qid);
        return "Question deleted.";
    }

    @PutMapping("/id/{qid}")
    public String updateQuestionById(@PathVariable Long qid, @RequestBody Question ques) {
        questionList.put(qid, ques);
        return "Question updated.";
    }
}
