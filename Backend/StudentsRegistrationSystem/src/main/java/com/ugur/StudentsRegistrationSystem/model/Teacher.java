package com.ugur.StudentsRegistrationSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_teacher")
public class Teacher {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int teacher_id;

	@Column
	private String name ;
	
	@Column
	private String surname;
	
	@Column
	private String department;
	
	@Column
	private String gender;
	
	@Column
	private String teacher_lesson;
	
	public Teacher() {
	    
	}

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", name=" + name + ", surname=" + surname + ", department=" + department
				+ ", gender=" + gender + ", teacher_lesson=" + teacher_lesson +"]";
	}
	public Teacher(int teacher_id, String name, String surname, String department, String gender,String teacher_lesson) {
		super();
		this.teacher_id = teacher_id;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.gender = gender;
		this.teacher_lesson = teacher_lesson ;
	}
	
	public int getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTeacher_lesson() {
		return teacher_lesson;
	}
	public void setTeacher_lesson(String teacher_lesson) {
		this.teacher_lesson = teacher_lesson;
	}

	

}
