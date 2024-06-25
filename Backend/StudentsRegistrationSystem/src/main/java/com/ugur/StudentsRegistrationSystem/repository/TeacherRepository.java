package com.ugur.StudentsRegistrationSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ugur.StudentsRegistrationSystem.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
