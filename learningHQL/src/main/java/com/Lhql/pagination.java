package com.Lhql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.map.Questions;

public class pagination {
	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=factory.openSession();
		
		Query<Questions> query = s.createQuery("from Questions");
		
//		implementing pagination 
		
		query.setFirstResult(0);
		query.setMaxResults(1);
		
		List<Questions> list = query.list();
		for(Questions st :list) {
//			System.out.println(st.getId() +" : " + st.getName()+" : " + st.getCity());
			System.out.println(st.getQuestionId() +" : " + st.getQuestion());
		}
		
		
		s.close();
		factory.close();
	}
}
