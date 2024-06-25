package com.ugur.StudentsRegistrationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ugur.StudentsRegistrationSystem.model.Lesson;


public interface LessonRepository extends JpaRepository<Lesson, Long> {

}
