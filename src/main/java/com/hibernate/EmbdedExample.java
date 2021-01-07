package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Certificate;
import com.hibernate.entity.StudentData;

public class EmbdedExample {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		StudentData std = new StudentData();
		std.setId(12345);
		std.setName("shubham");
		std.setSchool("SSVM");
		std.setCity("indore");
		
		Certificate certi = new Certificate();
		certi.setCourseId(1234);
		certi.setCourseName("B-Tech");
		
		std.setCerti(certi);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(std);
		
		tx.commit();
		session.close();
	
	}

}
