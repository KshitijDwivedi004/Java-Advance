package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class stateOfObject {

//	@SuppressWarnings("deprecation")
//	@SuppressWarnings("deprecation")
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		practial session
	//		1- Transient state
	//		2- Persistence state
	//		3- detached state
	//		4- removed state
		
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		Certification cert1= new Certification();
		cert1.setCertificationName("Maven certification");
		cert1.setDuration("1 month");
		cert1.setId(2922);
		
		Student std = new Student();
		std.setId(01034);
		std.setCity("Satna");
		std.setName("Shivam");
		std.setCerti(cert1);
		
		
		Session session=factory.openSession();
		Transaction tx= session.beginTransaction();
		
		session.save(std);
		session.save(cert1);
		
		
		tx.commit();
		
		
		session.close();
		factory.close();
		
		

	}

}