package com.Lhql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;
import com.states.Student;


public class HQL_2 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		
		Session session= factory.openSession();
		Transaction txs = session.beginTransaction();
		
		
//		---------delete query--------
//		Query<Student> q= session.createQuery("delete from Student s where s.city=:c");
//		q.setParameter("c","Satna");
//		int r=q.executeUpdate();
//		System.out.println("deleted : "+r);
//		
		
//		===========  update query
		
		
		Query<Student> q=session.createQuery("update Student set city = :c where name = :n");
		q.setParameter("c","Bondy");
		q.setParameter("n","killiyan");
		int u=q.executeUpdate();
		System.out.println(u + " data updated ");
		
		txs.commit();
		
		
		
		
		
		session.close();
		factory.close();

	}

}
