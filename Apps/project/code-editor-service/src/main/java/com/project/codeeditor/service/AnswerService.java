package com.project.codeeditor.service;

import com.project.codeeditor.model.Answer;
import com.project.codeeditor.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AnswerService {
    @Autowired
    private AnswerRepository answerRepository;

    public Answer createAnswer(Answer answer) {
        return answerRepository.save(answer);
    }

    public List<Answer> getAnswersByProblemId(UUID problemId) {
        return answerRepository.findByProblemId(problemId);
    }
}
