package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.hibernate.entity.Address;



public class App {
	public static void main(String[] args) throws IOException {
		
		//>>>>>> Method 1 >>>>>>>>>>>
		
//		Configuration cfg = new Configuration();
//		cfg.configure("hibernate.cfg.xml");
//		SessionFactory factory = cfg.buildSessionFactory();

		
		//>>>>>> Method 2 >>>>>>>>>>>
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();		

		/***
		
//		save student data into tables using getters and setters::::::::::::::::::::::::::
		
		StudentData std = new StudentData();
		std.setId(124);
		std.setName("vikas");
		std.setCity("shujalpur");
		std.setSchool("excellence");
		
		***/
//	    save address :::::::::::::::::::::::::::::::
		
		Address add= new Address();
		add.setStreet("kajipura");
		add.setCity("shujalpur");
		add.setOpen(true);
		add.setAddedDate(new Date());
		add.setX(1233);
		
//		Reading image
		FileInputStream fs = new FileInputStream("src/main/java/name.jpg");
		byte[] data = new byte[fs.available()];
		fs.read(data);
		add.setImage(data);
		

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		session.save(std);
		session.save(add);
		
		transaction.commit();
		session.close();
		
//		Check fectory close or not
//		System.out.println("factory status = "+factory.isClosed());
		
	
//__________:::::::::::::______________:::::::::::::_________________::::::::::::___________________:::::::::::::::::	
		
		
		
		
		
	}
}
