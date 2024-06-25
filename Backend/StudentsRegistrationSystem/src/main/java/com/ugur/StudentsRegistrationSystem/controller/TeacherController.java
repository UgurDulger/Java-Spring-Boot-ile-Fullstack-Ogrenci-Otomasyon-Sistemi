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


import com.ugur.StudentsRegistrationSystem.model.Teacher;
import com.ugur.StudentsRegistrationSystem.service.TeacherService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TeacherController {

	@Autowired
    TeacherService teacherService;

	//Burası öğretmenleri kaydettiğim yer
    @PostMapping("/teacher/save")
    public ResponseEntity<?> addteacher(@RequestBody Teacher teacher){
        try {
            teacherService.addTeacher(teacher);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası bütün öğretmenleri listelediğim yer
    @GetMapping("/teacher/getAll")
    public ResponseEntity<List<Teacher>> getAll(){
        try {
            List<Teacher> teacherList = teacherService.getAll();
            return new ResponseEntity<>(teacherList,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğretmen çağırabildiğim yer
    @GetMapping("/teacher/getById/{id}")
    public ResponseEntity<Optional<Teacher>> getById(@PathVariable("id") long id){
        try{
            Optional<Teacher> teacher = teacherService.getById(id);
            return new ResponseEntity<>(teacher,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğretmen sildiğim yer
    @DeleteMapping("/teacher/deleteById/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") long id){
        try{
        	teacherService.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğretenin bilgilerini güncellediğim yer
    @PutMapping("/teacher/updateById/{id}")
    public ResponseEntity<?> updateById(@RequestBody Teacher teacher, @PathVariable("id") long id){
        try{
            teacherService.updateById(teacher, id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
