package com.kushal.quiz.service;

import com.kushal.quiz.DAO.questionDao;
import com.kushal.quiz.model.programming_questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class questionService {
    @Autowired
    questionDao questionDao;
    public ResponseEntity<List<programming_questions>> getAllQuestions(){
        try {
            return new ResponseEntity<>(questionDao.findAll(), HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(questionDao.findAll(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<programming_questions>> findByCategory(String category) {
        try {
            return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.OK);
        }
        catch (Exception e){
            System.out.println(e);
        }
        return new ResponseEntity<>(questionDao.findByCategory(category), HttpStatus.BAD_GATEWAY);
    }

    public ResponseEntity<String> saveData(programming_questions question) {
        try {
            questionDao.save(question);
            return new ResponseEntity<>("Success", HttpStatus.ACCEPTED);
        }
        catch (Exception e){e.printStackTrace();}
        return new ResponseEntity<>("Success", HttpStatus.BAD_REQUEST);
    }
}
