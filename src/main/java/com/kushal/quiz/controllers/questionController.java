package com.kushal.quiz.controllers;

import com.kushal.quiz.model.programming_questions;
import com.kushal.quiz.service.questionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("questions")
public class questionController {
    @Autowired
    questionService questionService;
    @GetMapping("allquestions")
    public ResponseEntity<List<programming_questions>> questions(){
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<programming_questions>> catQuestion(@PathVariable String category){
        return questionService.findByCategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addData(@RequestBody programming_questions question){
        return questionService.saveData(question);
    }
}
