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

import com.ugur.StudentsRegistrationSystem.model.Students;
import com.ugur.StudentsRegistrationSystem.service.StudentsService;




@RestController
@RequestMapping("/api")
@CrossOrigin
public class StudentsController {

	@Autowired
    StudentsService studentsService;

	//Burası öğretmenleri kaydettiğim yer
    @PostMapping("/students/save")
    public ResponseEntity<?> addStudents(@RequestBody Students students){
        try {
        	studentsService.addStudents(students);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(e,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası bütün öğrencileri listelediğim yer
    @GetMapping("/students/getAll")
    public ResponseEntity<List<Students>> getAll(){
        try {
            List<Students> studentsList = studentsService.getAll();
            return new ResponseEntity<>(studentsList,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğrenci çağırabildiğim yer
    @GetMapping("/students/getById/{students_id}")
    public ResponseEntity<Optional<Students>> getById(@PathVariable("students_id") int students_id){
        try{
            Optional<Students> students = studentsService.getById(students_id);
            return new ResponseEntity<>(students,HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğrenci sildiğim yer
    @DeleteMapping("/students/deleteById/{students_id}")
    public ResponseEntity<?> deleteById(@PathVariable("students_id") int students_id){
        try{
        	studentsService.deleteById(students_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Burası id numarasına göre öğrencinin bilgilerini güncellediğim yer
    @PutMapping("/students/updateById/{students_id}")
    public ResponseEntity<?> updateById(@RequestBody Students students, @PathVariable("students_id") int students_id){
        try{
        	studentsService.updateById(students, students_id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
