package com.ugur.StudentsRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import com.ugur.StudentsRegistrationSystem.model.Teacher;

public interface TeacherService {


    void addTeacher(Teacher teacher);
    
    List<Teacher> getAll();
    
    Optional<Teacher> getById(long teacher_id);
    
    void deleteById(long teacher_id);
    
    void updateById(Teacher teacherObj, long teacher_id);
}
