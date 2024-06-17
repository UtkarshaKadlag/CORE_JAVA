package com.app.validation;

import java.time.LocalDate;
import java.util.List;

import com.app.Entities.EmployeeEntities;
import com.app.Entities.Application;

import com.app.EmployeeException.EmployeeException;

public class Validation 
{
	public static EmployeeEntities checkValidation(String fte,String name,String joiningDate, String phoneNum,String addharNum, List<EmployeeEntities> list) throws EmployeeException
	{
		Application ftee=Application.valueOf(fte);
		LocalDate date=LocalDate.parse(joiningDate);
		checkPhone(phoneNum);
		return new EmployeeEntities(ftee,name,date,phoneNum, addharNum);
	}
	
	public static EmployeeEntities searchEmployee(int id, List<EmployeeEntities> list)
	{
		for(EmployeeEntities e : list)
		{
			if(e.getId()==id)
			{
				return e;
			}
		}
		throw new EmployeeException("Employee Not Found!!!");
	}
	
	public static EmployeeEntities searchByAdhaar(String adhharNum, List<EmployeeEntities> list) throws EmployeeException
	{
		for(EmployeeEntities e : list)
		{
			if(e.getAadhaarNum().equals(adhharNum))
			{
				return e;
			}
		}
		throw new EmployeeException("Employee not Found!!!");
	}
	
	public static void checkPhone(String pnum) throws EmployeeException
	{
		String regrex="^[0-9]*$";
		if(!pnum.matches(regrex) && pnum.length()!=10)
		{
			throw new EmployeeException("Adhaar number is not validate!!");
		}
	}
	
	public static void checkAdhaar(String adhaar) throws EmployeeException
	{
		String regrex="^[0-9]\\S+$";
		if(!adhaar.matches(regrex) && adhaar.length()!=10)
		{
			throw new EmployeeException("Adhaar number is not available!!!");
		}
	}	
}
