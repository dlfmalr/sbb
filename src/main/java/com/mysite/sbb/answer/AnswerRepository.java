package com.mysite.sbb.answer;

import com.mysite.sbb.question.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
    Answer findByContent(String content);
//    Answer findByAnswerAndContent(String answer, String content);
    List<Answer> findByContentLike(String content);
    Page<Answer> findAllByQuestion(Question question, Pageable pageable);
}
