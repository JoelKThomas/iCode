package com.project.codeeditor.repository;

import com.project.codeeditor.model.Problem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface ProblemRepository extends JpaRepository<Problem, UUID> {
}
