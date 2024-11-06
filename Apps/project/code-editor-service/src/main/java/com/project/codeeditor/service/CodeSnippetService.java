package com.project.codeeditor.service;

import com.project.codeeditor.model.CodeSnippet;
import com.project.codeeditor.repository.CodeSnippetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CodeSnippetService {
    @Autowired
    private CodeSnippetRepository codeSnippetRepository;

    public CodeSnippet createCodeSnippet(CodeSnippet codeSnippet) {
        return codeSnippetRepository.save(codeSnippet);
    }

    public List<CodeSnippet> getCodeSnippetsByProblemId(UUID problemId) {
        return codeSnippetRepository.findByProblemId(problemId);
    }
}
