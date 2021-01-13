package com.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AdvanceHQL {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		//Delete Student from database

		/*****
		String query = "delete from Student as s where s.stdCity = :c";		
		Query q1 = session.createQuery(query);
		q1.setParameter("c", "shujalpur");
		int update = q1.executeUpdate();  //use when we update or delete data from table
		System.out.println("deleted "+update);
		*****/
		
		//Update Student from database
		/****
		String queryString = "update Student set stdCity=:c where stdId=:i";
		Query query = session.createQuery(queryString);
		query.setParameter("c", "shujalpur");
		query.setParameter("i", 128);
		int update = query.executeUpdate();
		System.out.println(update);
		****/
		
//		Join column query
		String query = "select c.companyId ,c.companyName ,e.empName from Company as c  INNER JOIN c.employees as e";
		Query query2  = session.createQuery(query);
		List<Object[]> list = query2.getResultList();
		
		for(Object[] arr : list)
		{
			System.out.println(Arrays.toString(arr)); 
		}
		
		tx.commit();
		session.close();
		factory.close();

	}

}
