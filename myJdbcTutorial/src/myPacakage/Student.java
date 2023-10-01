package myPacakage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Student{

	// TODO Auto-generated method stub
//	driver load
//	con etablish 
//	statement - query
//	execute query
//	con close
	
	public void createDatabase() {
//	driver load
	try {
		String url = "jdbc:mysql://localhost:3306/";
		String userName="root";
		String password="123456";
		
//		con etablish 
		Connection conn=DriverManager.getConnection(url,userName,password);
		Statement stm = conn.createStatement();
		
//		statement - query
		String query = "create database newDB";
//		execute query
		boolean bl=stm.execute(query);
		
		System.out.println("DataBase created Successfully = "+ bl);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	

}

	public void createTable() {
		try {
			String url = "jdbc:mysql://localhost:3306/codingwalla";
//			String db=" codingwalla";
			String userName="root";
			String password="123456";
			
//			con etablish 
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			
//			statement - query
			String query = "create table student(sid int(5),sName varchar(30),sEmail varchar(200))";
//			execute query
			stm.execute(query);
			
			System.out.println("Created Table Successfully !");
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
	}
	
	public void createData() {
		try {
			String url = "jdbc:mysql://localhost:3306/codingwalla";
//			String db=" codingwalla";
			String userName="root";
			String password="123456";
			
//			con etablish 
			Connection conn=DriverManager.getConnection(url,userName,password);
//			statement - query
			String query = "INSERT into student(sid,sName,sEmail) VALUES(?,?,?)";

			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,10);
			pstm.setString(2,"Shivam");
			pstm.setString(3, "shivamRaj11@gmail.com");
//			execute query
			pstm.execute();
			
			System.out.println("Data inserted Successfully !");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void readData() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/codingwalla";
//			String db=" codingwalla";
			String userName="root";
			String password="123456";
			
//			con etablish 
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			String query= "select * from student";
			
			
//			execute query
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("id ="+rs.getInt(1));
				System.out.println("Name ="+rs.getString(2));
				System.out.println("Email ="+rs.getString(3));
				System.out.println("****");
			}
			
			System.out.println("Data Read Successfully !");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void updateData() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/codingwalla";
//			String db=" codingwalla";
			String userName="root";
			String password="123456";
			
//			con etablish 
			Connection conn=DriverManager.getConnection(url,userName,password);
//			statement - query
			String query = "update student set sid = ? where Sname = ? ";

			PreparedStatement pstm = conn.prepareStatement(query);
			pstm.setInt(1,11);
			pstm.setString(2,"Shivam");
//			execute query
			pstm.execute();
			
			System.out.println("Data Updated Successfully !");
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteData() {
		// TODO Auto-generated method stub
		try {
			String url = "jdbc:mysql://localhost:3306/codingwalla";
//			String db=" codingwalla";
			String userName="root";
			String password="123456";
			
//			con etablish 
			Connection conn=DriverManager.getConnection(url,userName,password);
			Statement stm = conn.createStatement();
			
//			statement - query
			String query = "delete from student where Sid=11 ;";
//			execute query
			stm.execute(query);
			
			System.out.println("Data Deleted Successfully !");
			System.out.println();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	}
