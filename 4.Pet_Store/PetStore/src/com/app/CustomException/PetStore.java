package com.app.CustomException;

import com.app.CustomException.OutOfStockException;
import com.app.CoreClasses.Orders;
import com.app.CoreClasses.PetCategory;
import com.app.CoreClasses.Pets;
import com.app.CoreClasses.Status;
import com.app.CustomException.AuthenticationException;
import com.app.CustomException.AuthorizationException;

import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class PetStore 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			List<Orders>order=new ArrayList<Orders>();
			List<Pets>pet=new ArrayList<Pets>();
			
			boolean exit=false;
			while(!exit)
			{
				try 
				{
					System.out.println("Enter Your Choice : ");
					switch(sc.nextInt())
					{
						case 1:
								break;
					}
				}
				catch(Exception e)
				{
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}
	}

}
