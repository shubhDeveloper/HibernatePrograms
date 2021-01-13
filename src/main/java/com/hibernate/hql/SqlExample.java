package com.hibernate.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SqlExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		String sqlQuery = "select * from student"; //sql query
		NativeQuery query = session.createSQLQuery(sqlQuery);
		
		List<Object[]> list = query.list();
		
		for(Object[] ob : list)
		{
			System.out.println(ob[3]);
		}
		
		session.close();
		factory.close();

	}

}
