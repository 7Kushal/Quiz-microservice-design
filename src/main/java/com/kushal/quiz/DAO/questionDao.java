package com.kushal.quiz.DAO;

import com.kushal.quiz.model.programming_questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface questionDao extends JpaRepository<programming_questions,Integer> {
    List<programming_questions> findByCategory(String category);
}
