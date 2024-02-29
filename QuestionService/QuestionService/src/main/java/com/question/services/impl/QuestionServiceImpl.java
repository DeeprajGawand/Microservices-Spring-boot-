package com.question.services.impl;

import com.question.entities.Question;
import com.question.respositories.QuestionRepositories;
import com.question.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepositories questionRepositories;

    @Override
    public Question create(Question question) {
        return questionRepositories.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepositories.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepositories.findById(id).orElseThrow(() -> new RuntimeException("id not found"));
    }

    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepositories.findByQuizId(quizId);
    }
}
