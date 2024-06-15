package com.app.Utility;
import com.app.CustomException.CustomException;
import com.app.CustomOrdering.SortByRating;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.app.Cricketer.Cricketer;
import com.app.ValidationRules.ValidationRules;

@SuppressWarnings("unused")
public class CricketerUtils 
{
	public static String UpdateRating(String email,int rating,Map<String,Cricketer>map)
	{
		Cricketer mail=map.get(email);
		if(mail!=null)
		{
			mail.setRating(rating);
			return "Rating Successfully Updated to "+rating;
		}
		
		throw new CustomException("Crickter not found!!!");
	}
	
	public static Cricketer SearchByName(String name, Map<String,Cricketer>map) throws CustomException
	{
		List<Cricketer> clist=new LinkedList<>(map.values());
		for(Cricketer a : clist)
		{
			if(a.getName().equalsIgnoreCase(name))
			{
				return a;
			}
		}
		throw new CustomException("Cricketer not found!!!");
	}
	
	public static List<Cricketer> SortByRatings(Map<String,Cricketer> map)
	{
		List<Cricketer> clist=new LinkedList<Cricketer>(map.values());
		Collections.sort(clist,new SortByRating());
		return clist;
	}
}
