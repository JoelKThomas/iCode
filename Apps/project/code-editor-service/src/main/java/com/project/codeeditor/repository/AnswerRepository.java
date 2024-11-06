package com.project.codeeditor.repository;

import com.project.codeeditor.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;

public interface AnswerRepository extends JpaRepository<Answer, UUID> {
    List<Answer> findByProblemId(UUID problemId);
}
