package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Address;
import com.hibernate.entity.StudentData;



public class FetchData {

	public static void main(String[] args) {

		// get of load

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// Get student : id
		StudentData studentData = (StudentData) session.get(StudentData.class, 124);
		System.out.println(studentData);

//		// Load Student : id
        StudentData studentData2 =session.load(StudentData.class, 125);
        System.out.println(studentData2);
		
//		Get Data of address
        Address ad = (Address)session.get(Address.class,1);
        System.out.println(ad.getCity()+" "+ad.getStreet());
        
		session.close();
		factory.close();

	}

}
