package com.hibernate.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Pagination {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String query = "from Student";
		Query createQuery = session.createQuery(query);
		
		createQuery.setFirstResult(7);     // no fo when we find 
		createQuery.setMaxResults(3);      // no of row 
		
		List<Student> list = createQuery.getResultList();
		
		for(Student student : list)
		{
			System.out.println(student);
		}
		
		
		session.close();
        factory.close();
		
	}

}
