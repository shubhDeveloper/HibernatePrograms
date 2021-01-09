package com.one_to_many;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Company {

	@Id
	@Column(name = "Company_id")
	private int companyId;
	
	@Column(name = "company_name")
	private String companyName;
	
	@OneToMany(mappedBy = "company")
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

}
