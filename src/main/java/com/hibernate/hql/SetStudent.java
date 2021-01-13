package com.hibernate.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SetStudent {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
//		Set Data in student 
		Student std = new Student(143, "vijya", "pune", 11);
//		save
		session.save(std);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
