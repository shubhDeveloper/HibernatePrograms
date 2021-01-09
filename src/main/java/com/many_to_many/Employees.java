package com.many_to_many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Employee_details")
public class Employees {

	@Id
	@Column(name = "Employee_id")
	private int eId;
	
	@Column(name = "Employee_name")
	private String eName;
	
	@ManyToMany
	private List<Projects> projects;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

}
