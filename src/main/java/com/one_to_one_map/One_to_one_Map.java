package com.one_to_one_map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One_to_one_Map {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();

		// Creating question object q1
		Question q1 = new Question();
		q1.setQuestionId(111);
		q1.setQuestion("What is java");

		// Creating Answer object a1
		Answer a1 = new Answer();
		a1.setAnswerId(222);
		a1.setAnswer("Java is a programming language");
        a1.setQuestion(q1);
        
        q1.setAnswer(a1);
		
		// Creating question object q2
		Question q2 = new Question();
		q2.setQuestionId(123);
		q2.setQuestion("What is Hibernate");

		// Creating Answer object a2
		Answer a2 = new Answer();
		a2.setAnswerId(33);
		a2.setAnswer("Hibernate is an java framework that simplify the java development to intract with database");
        a2.setQuestion(q2);
		
		q2.setAnswer(a2);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

//		save object 1
		session.save(q1);
		session.save(a1);
		
//		save object 2
		session.save(q2);
		session.save(a2);

		tx.commit();
		session.close();

	}

}
