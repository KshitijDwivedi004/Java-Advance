package com.map;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
//		creating question
		Questions q1 = new Questions();
		q1.setQuestionId(1212);
		q1.setQuestion("What is Java ?");
		
		Questions q2 = new Questions();
		q2.setQuestionId(1010);
		q2.setQuestion("What is Collections ?");
		
		
//		crating answer;
		Answers ans1= new Answers();
		ans1.setAnswerId(343);
		ans1.setAnswer("Java is a programming Language.");
		ans1.setQuestion(q1);
		
		
		Answers ans2= new Answers();
		ans2.setAnswerId(344);
		ans2.setAnswer("With the help of java we can create a software");
		ans2.setQuestion(q1);
		
		Answers ans3= new Answers();
		ans3.setAnswer("Java has different type of frameworks.");
		ans3.setAnswerId(345);
		ans3.setQuestion(q1);
		
		Answers ans4= new Answers();
		ans4.setAnswer("Collections is a java framework");
		ans4.setAnswerId(350);
		ans4.setQuestion(q2);
		
		
		List<Answers> list1 = new ArrayList<Answers>();
		list1.add(ans1);
		list1.add(ans2);
		list1.add(ans3);
		
		List<Answers> list2 = new ArrayList<Answers>();
		list2.add(ans4);
//		
		q1.setAnswers(list1);
		q2.setAnswers(list2);
		
		
		Session s = factory.openSession();
		Transaction trns = s.beginTransaction();
		
		Questions questions=s.get(Questions.class, 1212);
		System.out.println(questions.getQuestion());
		System.out.println(questions.getQuestionId());
		System.out.println(questions.getAnswers().size());
//		
//		System.out.println(questions.getQuestion());
//		
//		
		for(Answers a: q1.getAnswers()) {
			System.out.println(a.getAnswer());
		}
		
//		
//		s.save(q1);
//		s.save(ans1);
//		s.save(ans2);
//		s.save(ans3);
//		s.save(q2);
//		s.save(ans4);
		
		
		
		trns.commit();
		
//		Question question=(Question)s.get(Question.class,1212);
//		System.out.println(question.getQuestion());
//		System.out.println(question.getAnswer().getAnswer() );
//		
		s.close();
		factory.close();
		
		
		

	}

}
