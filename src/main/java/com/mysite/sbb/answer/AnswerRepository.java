package com.mysite.sbb.answer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer, Integer> {
//    Answer findByAnswer(String answer);
//    Answer findByAnswerAndContent(String answer, String content);
    List<Answer> findByContentLike(String content);
    Page<Answer> findAll(Pageable pageableA);
}
