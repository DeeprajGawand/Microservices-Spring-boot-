package com.question.respositories;

import com.question.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepositories  extends JpaRepository<Question, Long> {

    List<Question> findByQuizId(Long quizId);
}
