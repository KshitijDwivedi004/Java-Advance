package com.durgesh.jdbc.main;


public class Main {
	public static void main(String[] args) {
		
		first f1 = new first();
		f1.connect();
//		f1.createTable();    create table
		
//			insert data
//		f1.insertData("kshitij", "Nagod");
//		f1.insertData("Adarsh", "Satna");
//		f1.insertData("Bhaskar", "Kachnar");
//		f1.insertData();
		
//		INSERTING IMAGE
		
		f1.dynamicImageInsert();
	}

}
