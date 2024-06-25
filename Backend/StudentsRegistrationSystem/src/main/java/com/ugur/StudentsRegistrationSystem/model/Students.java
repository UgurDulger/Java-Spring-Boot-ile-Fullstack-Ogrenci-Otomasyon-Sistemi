package com.ugur.StudentsRegistrationSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_students")
public class Students {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "students_id")
	private int students_id;

	@Column
	private String name ;
	
	@Column
	private String surname;
	
	@Column
	private String school_no;
	
	@Column
	private String gender;
	
	@Column
	private String student_lesson;
	
	public Students() {
	    
	}

	@Override
	public String toString() {
		return "Students [students_id=" + students_id + ", name=" + name + ", surname=" + surname + ", school_no=" + school_no
				+ ", gender=" + gender +", student_lesson=" + student_lesson + "]";
	}
	public Students(int students_id, String name, String surname, String school_no, String gender,String student_lesson) {
		super();
		this.students_id = students_id;
		this.name = name;
		this.surname = surname;
		this.school_no = school_no;
		this.gender = gender;
		this.student_lesson = student_lesson;
	}
	
	public int getStudents_id() {
		return students_id;
	}
	public void setStudents_id(int students_id) {
		this.students_id = students_id;
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
	public String getSchool_no() {
		return school_no;
	}
	public void setSchool_no(String school_no) {
		this.school_no = school_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStudent_lesson() {
		return student_lesson;
	}
	public void setStudent_lesson(String student_lesson) {
		this.student_lesson = student_lesson;
	}

	
	

	

}