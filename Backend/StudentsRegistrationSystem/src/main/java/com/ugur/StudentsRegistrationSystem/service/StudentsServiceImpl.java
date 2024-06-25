package com.ugur.StudentsRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugur.StudentsRegistrationSystem.model.Students;
import com.ugur.StudentsRegistrationSystem.repository.StudentsRepository;

@Service
public class StudentsServiceImpl implements StudentsService{

	@Autowired
    StudentsRepository studentsRepository;
	
	@Override
	public void addStudents(Students students) {
		studentsRepository.save(students);
		
	}

	@Override
	public List<Students> getAll() {
		return studentsRepository.findAll();
	}

	@Override
	public Optional<Students> getById(long students_id) {
		return studentsRepository.findById(students_id);
	}

	@Override
	public void deleteById(long students_id) {
		studentsRepository.deleteById(students_id);
		
	}

	@Override
	public void updateById(Students studentsObj, long students_id) {
		Students students =studentsRepository.getById(students_id);
		students.setName(studentsObj.getName());
		students.setSurname(studentsObj.getSurname());
		students.setSchool_no(studentsObj.getSchool_no());
		students.setGender(studentsObj.getGender());
		students.setStudent_lesson(studentsObj.getStudent_lesson());
		studentsRepository.save(students);
		
	}

}
