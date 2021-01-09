package com.many_to_many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Projects_detail")
public class Projects {
	
	@Id
	@Column(name = "project_id")
    private int pId;
	
	@Column(name = "project_name")
    private String pName;
	
	@ManyToMany(mappedBy = "projects")
	List<Employees> employees;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}


	public List<Employees> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employees> employees) {
		this.employees = employees;
	}

	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
