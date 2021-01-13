package com.one_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchDatas {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Company company = session.get(Company.class, 11001);
		
		System.out.println(company.getCompanyId());
		System.out.println(company.getCompanyName());
//		Lazy Loading
//		System.out.println(company.getEmployees().size());
		
//	    Employee e1 = session.get(Employee.class, 11001);
		Object object = company.getEmployees();
		System.out.println(object.toString());
		
		
		tx.commit();
		session.close();
	}

}
