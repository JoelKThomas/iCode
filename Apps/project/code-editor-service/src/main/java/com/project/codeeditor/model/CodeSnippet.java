package com.project.codeeditor.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "code_snippets")
public class CodeSnippet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(columnDefinition = "TEXT")
    private String content;

    private String language;

    @ManyToOne
    @JoinColumn(name = "problem_id", nullable = true)
    private Problem problem;  // Optional association

    // Getters and Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }
}
