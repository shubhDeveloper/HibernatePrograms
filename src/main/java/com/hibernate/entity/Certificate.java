package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certificate {

	@Column(name = "Cource_Id")
	public int courseId;
	@Column(name = "Cource_Name")
	public String courseName;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Certificate(int courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

}
