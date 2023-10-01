package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.sql.Date;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.descriptor.java.LocalDateJavaType;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello Your Project Has Started..." );
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
//        System.out.println(factory);
//        f
//        System.out.println(factory.isClosed());
        
//        creating Student
        
        
//        student std = new student();
//        std.setId(110);
//        std.setName("Kshitij");
//        std.setCity("Bhopal");
//        
//        System.out.println(std);
        
//      creating object of Address class
        Address ad=new Address();
        ad.setStreet("Virat Nagar");
        ad.setCity("Satna");
        ad.setAddedDate(new Date());
        ad.setX(1234.12288);
        ad.setOpen(true);
        
        try {
			FileInputStream fiS= new FileInputStream("src/main/java/kd sign2.jpeg");
			byte []data =new byte[fiS.available()];
			fiS.read(data);
			ad.setImage(data);
			fiS.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
        
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        
//        session.save(std);
        session.save(ad);
        
        tx.commit();
        
        session.close();
//        System.out.println(ad);
        System.out.println("Done....");
 
        
    }
}
