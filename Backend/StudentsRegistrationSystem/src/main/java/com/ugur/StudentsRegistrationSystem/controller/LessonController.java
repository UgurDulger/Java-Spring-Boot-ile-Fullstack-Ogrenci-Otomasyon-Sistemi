package com.ugur.StudentsRegistrationSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ugur.StudentsRegistrationSystem.model.Lesson;
import com.ugur.StudentsRegistrationSystem.service.LessonService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class LessonController {

	@Autowired
    LessonService lessonService;

	//Burası öğretmenleri kaydettiğim yer
    @PostMapping("/lesson/save")
    public ResponseEntity<?> addLesson(@RequestBody Lesson lesson){
        try {
        	lessonService.addLesson(lesson);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası bütün öğretmenleri listelediğim yer
    @GetMapping("/lesson/getAll")
    public ResponseEntity<List<Lesson>> getAll(){
        try {
            List<Lesson> lessonList = lessonService.getAll();
            return new ResponseEntity<>(lessonList,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğretmen çağırabildiğim yer
    @GetMapping("/lesson/getById/{lesson_id}")
    public ResponseEntity<Optional<Lesson>> getById(@PathVariable("lesson_id") long lesson_id){
        try{
            Optional<Lesson> lesson = lessonService.getById(lesson_id);
            return new ResponseEntity<>(lesson,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğretmen sildiğim yer
    @DeleteMapping("/lesson/deleteById/{lesson_id}")
    public ResponseEntity<?> deleteById(@PathVariable("lesson_id") long lesson_id){
        try{
        	lessonService.deleteById(lesson_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğretenin bilgilerini güncellediğim yer
    @PutMapping("/lesson/updateById/{lesson_id}")
    public ResponseEntity<?> updateById(@RequestBody Lesson lesson, @PathVariable("lesson_id") long lesson_id){
        try{
        	lessonService.updateById(lesson, lesson_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}