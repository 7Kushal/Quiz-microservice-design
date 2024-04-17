package com.kushal.quiz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class programming_questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String category;
    private String difficulty_level;
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String right_answer;

}
