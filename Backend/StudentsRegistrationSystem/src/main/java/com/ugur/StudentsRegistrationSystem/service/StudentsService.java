package com.ugur.StudentsRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import com.ugur.StudentsRegistrationSystem.model.Students;


public interface StudentsService {

    void addStudents(Students students);
    
    List<Students> getAll();
    
    Optional<Students> getById(long students_id);
    
    void deleteById(long students_id);
    
    void updateById(Students studentsObj, long students_id);
}
