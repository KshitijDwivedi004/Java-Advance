package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fetchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		get  , load
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		student stn=session.get(student.class, 110);
		System.out.println(stn);
		
		Address ads = session.get(Address.class ,2);
		System.out.println(ads);
		
		
		
	}

}
