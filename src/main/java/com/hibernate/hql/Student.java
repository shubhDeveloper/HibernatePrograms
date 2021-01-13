package com.hibernate.hql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@Column(name = "student_id")
	private int stdId;
	
	@Column(name = "student_name")
	private String stdName;
	
	@Column(name = "student_city")
	private String stdCity;
	
	@Column(name = "student_class")
	private int stdClass;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdCity() {
		return stdCity;
	}

	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}

	public int getStdClass() {
		return stdClass;
	}

	public void setStdClass(int stdClass) {
		this.stdClass = stdClass;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stdId, String stdName, String stdCity, int stdClass) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdCity = stdCity;
		this.stdClass = stdClass;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdCity=" + stdCity + ", stdClass=" + stdClass
				+ "]";
	}

}
