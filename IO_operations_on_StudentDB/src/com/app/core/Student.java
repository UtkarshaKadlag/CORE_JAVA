package com.app.core;
import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable
{
	private String rollno;
	private String name;
	private LocalDate dob;
	private Address address;
	private double Gpa;
	private Subject subject;
	
	public Student(String rollno, String name, LocalDate dob, Address address, double Gpa, Subject subject)
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.dob=dob;
		this.address=address;
		this.Gpa=Gpa;
		this.subject=subject;
	}
	
	public Student(String rollno, String name, LocalDate dob, Subject subject, double Gpa) 
	{
		super();
		this.rollno=rollno;
		this.name=name;
		this.dob=dob;
		this.subject=subject;
		this.Gpa=Gpa;
	}

	public String getRollno() 
	{
		return rollno;
	}



	public void setRollno(String rollno) 
	{
		this.rollno = rollno;
	}



	public String getName() 
	{
		return name;
	}



	public void setName(String name) 
	{
		this.name = name;
	}



	public LocalDate getDob() 
	{
		return dob;
	}



	public void setDob(LocalDate dob) 
	{
		this.dob = dob;
	}



	public Address getAddress() 
	{
		return address;
	}



	public void assignAddress(Address a) 
	{
		address = a;
	}



	public double getGpa() 
	{
		return Gpa;
	}



	public void setGpa(double gpa) 
	{
		Gpa = gpa;
	}



	public Subject getSubject() 
	{
		return subject;
	}



	public void setSubject(Subject subject) 
	{
		this.subject = subject;
	}



	@Override
	public String toString()
	{
		return "Student [ Rollno : "+this.rollno+" Name : "+this.name+" Date Of Birth : "+this.dob+
				" Address : "+this.address+" GPA : "+this.Gpa+" Subject : "+this.subject;
	}
	
	
	
	
}
