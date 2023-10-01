package com.durgesh.jdbc.main;
import java.util.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class first {

		void connect() {
		// TODO Auto-generated method stub
		try {
			
		String url= "jdbc:mysql://localhost:3306/db";
		String userName = "root";
		String password="123456";
		
		Connection conn = DriverManager.getConnection(url,userName,password);
		
		if(conn.isClosed()) {
			System.out.println("connection is closed");
		}
		System.out.println("Connected SuccessFully...");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}
		
		void createTable() {
			String url= "jdbc:mysql://localhost:3306/db";
			String userName = "root";
			String password="123456";
			
			try {
				Connection conn = DriverManager.getConnection(url,userName,password);
				
				
				String q="create table teachers(tID int(20) primary key auto_increment ,tName varchar(20),tCity varchar(20))";
				Statement stmt = conn.createStatement();
				
				stmt.executeUpdate(q);
				
				System.out.println("table created in database");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		void insertData() {
			String url= "jdbc:mysql://localhost:3306/db";
			String userName = "root";
			String password="123456";
			
			try {
				Connection conn = DriverManager.getConnection(url,userName,password);
				String q="insert into teachers(tName,tCity) values(?,?)";
				
//				create statement
				
				PreparedStatement psmt= conn.prepareStatement(q);
				
//				dynamic input
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String name;
				try {
					System.out.println("Enter Your name");
					name = br.readLine();
					System.out.println("Enter your City");
					String city = br.readLine();
					
//				set values
					psmt.setString(1, name);
					psmt.setString(2, city);
					
					psmt.executeUpdate();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
				System.out.println("Data inserted into Table..");
				
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		void insertImage() {
			
			try {
				String url= "jdbc:mysql://localhost:3306/db";
				String userName = "root";
				String password="123456";
				Connection conn = DriverManager.getConnection(url,userName,password);
				
				String q="insert into images(pic) values(?)";
				PreparedStatement pstm= conn.prepareStatement(q);
				FileInputStream fis = new FileInputStream("C:\\Users\\Kshitij Dwivedi\\OneDrive\\Pictures\\KD.jpeg");
				pstm.setBinaryStream(1, fis,fis.available());
				pstm.executeUpdate();
			
				System.out.println("image inserted....");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		void dynamicImageInsert() {
			try {
				String url= "jdbc:mysql://localhost:3306/db";
				String userName = "root";
				String password="123456";
				Connection conn = DriverManager.getConnection(url,userName,password);
				
				String q="insert into images(pic) values(?)";
				PreparedStatement pstm= conn.prepareStatement(q);
				
				JFileChooser jfc = new JFileChooser();
				jfc.showOpenDialog(null);
				
				File file =jfc.getSelectedFile();
				FileInputStream fis = new FileInputStream(file);
				
				pstm.setBinaryStream(1, fis,fis.available());
				pstm.executeUpdate();
				
				JOptionPane.showMessageDialog(null,"success");
			
				System.out.println("image inserted....");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}	
		}
		
		
		
}