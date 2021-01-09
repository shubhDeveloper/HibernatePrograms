package com.many_to_many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		create Employees objects
		Employees e1 = new Employees();
		Employees e2 = new Employees();
		
		e1.seteId(123);
		e1.seteName("Shubham");
		e2.seteId(121);
		e2.seteName("Vikas");
		
//		create Project objects
		Projects p1 = new Projects();
		Projects p2 = new Projects();
		
		p1.setpId(222);
		p1.setpName("MyCart");
		p2.setpId(333);
		p2.setpName("MyBroker");
		
		List<Employees> list1 = new ArrayList<Employees>();	
		List<Projects> list2 = new ArrayList<Projects>();
		
		list1.add(e1);
		list1.add(e2);
		
		list2.add(p1);
		list2.add(p2);
		
		e1.setProjects(list2);
		p2.setEmployees(list1);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		session.close();
		
		

	}

}
