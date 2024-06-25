package com.ugur.StudentsRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugur.StudentsRegistrationSystem.model.Teacher;
import com.ugur.StudentsRegistrationSystem.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService {

	@Autowired
    TeacherRepository teacherRepository;

    @Override
    public void addTeacher(Teacher teacher){
    	teacherRepository.save(teacher);
    }

    @Override
    public List<Teacher> getAll(){
        return teacherRepository.findAll();
    }

    @Override
    public Optional<Teacher> getById(long teacher_id){
        return teacherRepository.findById(teacher_id);
    }

    @Override
    public void deleteById(long teacher_id){
    	teacherRepository.deleteById(teacher_id);
    }

    @Override
    public void updateById(Teacher teacherObj, long teacher_id){
    	Teacher teacher =teacherRepository.getById(teacher_id);
    	teacher.setName(teacherObj.getName());
    	teacher.setSurname(teacherObj.getSurname());
    	teacher.setDepartment(teacherObj.getDepartment());
    	teacher.setGender(teacherObj.getGender());
    	teacher.setTeacher_lesson(teacherObj.getTeacher_lesson());
        teacherRepository.save(teacher);
    }
}
