package com.project.codeeditor.controller;

import com.project.codeeditor.model.CodeSnippet;
import com.project.codeeditor.service.CodeSnippetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/code-snippets")
public class CodeSnippetController {
    @Autowired
    private CodeSnippetService codeSnippetService;

    @PostMapping
    public CodeSnippet createCodeSnippet(@RequestBody CodeSnippet codeSnippet) {
        return codeSnippetService.createCodeSnippet(codeSnippet);
    }

    @GetMapping
    public List<CodeSnippet> getCodeSnippetsByProblemId(@RequestParam UUID problemId) {
        return codeSnippetService.getCodeSnippetsByProblemId(problemId);
    }
}
