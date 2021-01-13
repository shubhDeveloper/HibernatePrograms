package com.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_to_Many_map {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		create company object
		Company com1 = new Company();
		com1.setCompanyId(112233);
		com1.setCompanyName("lux cozy");
		
//		create employee object 1
		Employee e1 = new Employee();
		e1.setEmpId(127);
		e1.setEmpName("nana");
		e1.setCompany(com1);
		
//		create employee object 2
		Employee e2 = new Employee();
		e2.setEmpId(128);
		e2.setEmpName("rakesh");
		e2.setCompany(com1);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		
		com1.setEmployees(list);	
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		Save....
		session.save(com1);
		session.save(e1);
		session.save(e2);
		
		tx.commit();
		session.close();
			
	}

}
