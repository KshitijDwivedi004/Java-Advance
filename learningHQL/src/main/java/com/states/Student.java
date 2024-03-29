package com.states;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//@Table(name = "students")
public class Student {
	@Id
	private int id;
	private String name;
	private String city;
	
	@Embedded
	private Certification certi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certification getCerti() {
		return certi;
	}

	public void setCerti(Certification certi) {
		this.certi = certi;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, String city, Certification certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}
	
	
	

}
