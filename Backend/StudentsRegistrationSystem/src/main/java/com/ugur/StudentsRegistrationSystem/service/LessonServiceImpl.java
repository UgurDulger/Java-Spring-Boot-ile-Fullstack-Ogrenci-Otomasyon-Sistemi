package com.ugur.StudentsRegistrationSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ugur.StudentsRegistrationSystem.model.Lesson;
import com.ugur.StudentsRegistrationSystem.repository.LessonRepository;


@Service
public class LessonServiceImpl implements LessonService {

	@Autowired
    LessonRepository lessonRepository;
	
	
	@Override
	public void addLesson(Lesson lesson) {
		lessonRepository.save(lesson);

	}

	@Override
	public List<Lesson> getAll() {
		return lessonRepository.findAll();
	}

	@Override
	public Optional<Lesson> getById(long lesson_id) {
		return lessonRepository.findById(lesson_id);
	}

	@Override
	public void deleteById(long lesson_id) {
		lessonRepository.deleteById(lesson_id);

	}

	@Override
	public void updateById(Lesson lessonObj, long lesson_id) {
		Lesson lesson =lessonRepository.getById(lesson_id);
		lesson.setName(lessonObj.getName());
		lesson.setLesson_time(lessonObj.getLesson_time());
		lesson.setLocation(lessonObj.getLocation());
		lesson.setCredit(lessonObj.getCredit());
		lessonRepository.save(lessonObj);

	}

}
