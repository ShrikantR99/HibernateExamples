package com.Hibernate.ex3.HibernateProject3;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
	int rollno;
	String name;
	int age;
	
	@OneToOne
	Bike bike;

	public Student() {
		
	}

	public Student(int rollno, String name, int age, Bike bike) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.bike = bike;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
		

}
