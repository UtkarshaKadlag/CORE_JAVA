package com.app.ValidationRules;


import java.util.Map;

import com.app.Cricketer.Cricketer;
import com.app.CustomException.CustomException;
public class ValidationRules 
{
	private static void ChckForDup(String email,Map<String,Cricketer> map) throws CustomException
	{
		if(map.containsKey(email))
			throw new CustomException("Email already registered!!!Please try Again!!!");
	}
	
	private static int validatePhone(String phone, Map<String, Cricketer> map)
	{
		
		if(phone.length()!=10)
			throw new CustomException("Invalid Phone_Number!!!");
		Integer Phone=Integer.parseInt(phone);
		return Phone;
	}
	
	public static Cricketer acceptCricketer(String name,int age,String email_id,String Phone,int rating,Map<String,Cricketer>map)
	{
		ChckForDup(email_id,map);
		validatePhone(Phone,map);
		return new Cricketer( name, age,email_id, Phone,rating);
	}
	
}
