package com.project.codeeditor.service;

import com.project.codeeditor.model.Problem;
import com.project.codeeditor.repository.ProblemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProblemService {
    @Autowired
    private ProblemRepository problemRepository;

    public Problem createProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    public Problem getProblemById(UUID id) {
        return problemRepository.findById(id).orElse(null);
    }
}
