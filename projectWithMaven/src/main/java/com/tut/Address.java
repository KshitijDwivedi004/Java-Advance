package com.tut;

import java.sql.Date;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name = "Student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Address_ID")
	private int addressID;
	
	@Column(length = 50,name = "Street")
	private String street;
	
	@Column(length = 100,name = "City")
	private String city;
	
	@Column(name = "Is_Open")
	private boolean isOpen;
	
//	@Transient
	private double x;
	
	
	@Column(name = "Added_Date")
	@Temporal(TemporalType.DATE)
	private java.util.Date addedDate;
	
	
	@Lob
	@Column(length = 1000)
	private byte[] image;
	
	public Address(int addressID, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressID = addressID;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAddressID() {
		return addressID;
	}
	public void setAddressID(int addressID) {
		this.addressID = addressID;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public java.util.Date getAddedDate() {
		return addedDate;
	}
	public void setAddedDate(java.util.Date date) {
		this.addedDate = date;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "addressID : " + addressID + ", street :" + street + ", city : " + city + ", isOpen : " + isOpen
				+ ", x : " + x + ", addedDate : " + addedDate + ", image : " + Arrays.toString(image);
	}
	
	
}
