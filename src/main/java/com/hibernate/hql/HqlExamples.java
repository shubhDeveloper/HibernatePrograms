package com.hibernate.hql;

import java.text.Normalizer.Form;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import net.bytebuddy.asm.Advice.Enter;

public class HqlExamples {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
//		Create query
		
//		String query = "from Student";  //Get all student
//		String query = "from Student where id = 123";   //Get Student by id
//		String query = "from Student where student_city = 'shujalpur' ";
		
//		String query = "from Student where student_city = :x "; // Enter x value
		
		String query = "from Student as l where l.stdCity = :x and l.stdName = :i";
		
		Query creaQuery = session.createQuery(query);
		
//		creaQuery.setParameter("x", "shujalpur");   //setting value of x
		creaQuery.setParameter("x", "shujalpur");
		creaQuery.setParameter("i", "shubham panchal");
		
		List<Student> list = creaQuery.list();
		
		for(Student s : list)
		{
//			System.out.println("Student name is "+s.getStdName()+"\nStudent city is "+s.getStdClass());
		}
		
		session.close();
		factory.close();

	}

}
