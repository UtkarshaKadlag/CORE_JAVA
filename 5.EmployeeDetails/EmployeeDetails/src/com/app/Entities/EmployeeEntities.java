package com.app.Entities;

import java.time.LocalDate;
import java.util.Objects;

import com.app.Entities.Application;

@SuppressWarnings("unused")
public class EmployeeEntities 
{
	private int id;
	private String Name;
	private LocalDate joiningDate;
	private String PhoneNum;
	private String AadhaarNum;
	private static int count;
	private Application type;
	
	public EmployeeEntities(Application type, String name, LocalDate joiningDate, String phoneNum, String aadhaarNum) 
	{
		super();
		this.type=type;
		this.id=++count;
		Name = name;
		this.joiningDate = joiningDate;
		PhoneNum = phoneNum;
		AadhaarNum = aadhaarNum;
	}
	
	public EmployeeEntities(String aadhaarNum) 
	{
		super();
		AadhaarNum = aadhaarNum;
	}


	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public LocalDate getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getPhoneNum() {
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

	public String getAadhaarNum() {
		return AadhaarNum;
	}

	public void setAadhaarNum(String aadhaarNum) {
		AadhaarNum = aadhaarNum;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		EmployeeEntities.count = count;
	}
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Application getType() {
		return type;
	}

	public void setType(Application type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(AadhaarNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntities other = (EmployeeEntities) obj;
		return Objects.equals(AadhaarNum, other.AadhaarNum);
	}

	@Override
	public String toString() {
		return "EmployeeEntities [Name=" + Name + ", joiningDate=" + joiningDate + ", PhoneNum=" + PhoneNum
				+ ", AadhaarNum=" + AadhaarNum + "]";
	}
	
	
	
	
}
