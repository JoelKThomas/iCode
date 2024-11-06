package com.project.codeeditor.repository;

import com.project.codeeditor.model.CodeSnippet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface CodeSnippetRepository extends JpaRepository<CodeSnippet, UUID> {
    List<CodeSnippet> findByProblemId(UUID problemId);
}
