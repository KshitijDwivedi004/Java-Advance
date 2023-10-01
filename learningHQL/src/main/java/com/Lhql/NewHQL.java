package com.Lhql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.states.Student;


public class NewHQL {
	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session=factory.openSession();
//		HQL SYNTAX
		
//		String query="from Student";
//		String query="from Student where city = 'Satna'";
		String query="from Student where city = :x";
		@SuppressWarnings("deprecation")
		
		Query q=session.createQuery(query);
		
		
		q.setParameter("x", "Satna");
		
//		single - unique
//		multiple- list
		List<Student> list=q.list();
		
		for(Student s: list) {
			System.out.println(s.getName() + " : " + s.getCerti().getCertificationName());
			
		}
		
		
		
		
		
		
		session.close();
		factory.close();
		
		
	}
}
