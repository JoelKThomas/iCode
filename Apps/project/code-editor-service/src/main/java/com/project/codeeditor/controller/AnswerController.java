package com.project.codeeditor.controller;

import com.project.codeeditor.model.Answer;
import com.project.codeeditor.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {
    @Autowired
    private AnswerService answerService;

    @PostMapping
    public Answer createAnswer(@RequestBody Answer answer) {
        return answerService.createAnswer(answer);
    }

    @GetMapping
    public List<Answer> getAnswersByProblemId(@RequestParam UUID problemId) {
        return answerService.getAnswersByProblemId(problemId);
    }
}
