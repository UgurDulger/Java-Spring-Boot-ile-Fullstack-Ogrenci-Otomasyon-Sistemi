package com.ugur.StudentsRegistrationSystem.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_lesson")
public class Lesson {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lesson_id;

	@Column
	private String name ;
	
	@Column
	private String lesson_time;
	
	@Column
	private String location;
	
	@Column
	private int credit;

	
	public Lesson() {
	    
	}

	@Override
	public String toString() {
		return "Teacher [lesson_id=" + lesson_id + ", name=" + name + ", lesson_time=" + lesson_time + ", location=" + location
				+ ", credit=" + credit +  "]";
	}
	public Lesson(int lesson_id, String name, String lesson_time, String location, int credit,String teacher) {
		this.lesson_id = lesson_id;
		this.name = name;
		this.lesson_time = lesson_time;
		this.location = location;
		this.credit = credit;
		
	}
	
	public int getLesson_id() {
		return lesson_id;
	}
	public void setLesson_id(int lesson_id) {
		this.lesson_id = lesson_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLesson_time() {
		return lesson_time;
	}
	public void setLesson_time(String lesson_time) {
		this.lesson_time = lesson_time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}

}

	

