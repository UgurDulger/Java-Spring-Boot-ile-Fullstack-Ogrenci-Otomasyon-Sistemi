package com.ugur.StudentsRegistrationSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ugur.StudentsRegistrationSystem.model.Students;


public interface StudentsRepository  extends JpaRepository<Students, Long>{

}

