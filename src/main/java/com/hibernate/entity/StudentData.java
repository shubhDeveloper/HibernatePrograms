package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class StudentData {

	@Id
	public int id;
	public String name;
	public String city;
	public String school;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	

	public StudentData(int id, String name, String city, String school) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.school = school;
	}

	public StudentData() {
		super();
	}

	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", city=" + city + ", school=" + school + "]";
	}

}
