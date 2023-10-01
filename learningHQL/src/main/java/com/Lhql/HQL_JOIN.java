package com.Lhql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class HQL_JOIN {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
//		*********** join query
		Session session =factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query q=session.createQuery("select q.question , q.questionId, a.answer from Questions as q INNER JOIN q.answers as a");
		
		List<Object []> list=q.list();
		
		for(Object[] std : list) {
			System.out.println(Arrays.toString(std));
		}
		
		
		tx.commit();
		
		session.close();
		factory.close();

	}

}
