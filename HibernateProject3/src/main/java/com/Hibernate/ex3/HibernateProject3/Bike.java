package com.Hibernate.ex3.HibernateProject3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Bike 
{
	@Id
	int bikeid;
	String brand;
	String color;
	
	@OneToOne
	Student st;

	public Bike() {
		
	}

	public Bike(int bikeid, String brand, String color, Student st) {
		super();
		this.bikeid = bikeid;
		this.brand = brand;
		this.color = color;
		this.st = st;
	}

	public int getBikeid() {
		return bikeid;
	}

	public void setBikeid(int bikeid) {
		this.bikeid = bikeid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Student getSt() {
		return st;
	}

	public void setSt(Student st) {
		this.st = st;
	}
	
	
}
