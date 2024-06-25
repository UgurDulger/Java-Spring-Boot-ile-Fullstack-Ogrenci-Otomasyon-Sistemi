package com.ugur.StudentsRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import com.ugur.StudentsRegistrationSystem.model.Lesson;


public interface LessonService {


    void addLesson(Lesson lesson);
    
    List<Lesson> getAll();
    
    Optional<Lesson> getById(long lesson_id);
    
    void deleteById(long lesson_id);
    
    void updateById(Lesson lessonObj, long lesson_id);
	
}
