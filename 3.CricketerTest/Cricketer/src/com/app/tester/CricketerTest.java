package com.app.tester;

import static com.app.ValidationRules.ValidationRules.acceptCricketer;
import com.app.Cricketer.Cricketer;
import com.app.CustomException.CustomException;
import com.app.Utility.CricketerUtils;
import com.app.ValidationRules.ValidationRules;
import static com.app.Utility.CricketerUtils.UpdateRating;
import static com.app.Utility.CricketerUtils.SearchByName;
import static com.app.Utility.CricketerUtils.SortByRatings;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("unused")
public class CricketerTest 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<String,Cricketer>map=new HashMap<String, Cricketer>();
			boolean exit=false;
			
			while(!exit)
			{
				try
				{
					System.out.println("--------------------------MAIN MENU--------------------------");
					System.out.println("1.Accept minimum 5 Cricketers in the collection \n2.Modify Cricketer's rating \n3.Search Cricketer by name \n4.Display all Cricketers added in collection \n5.Display All Cricketers in sorted form by rating.");
					System.out.println("Enter Your Choice : ");
					
					switch(sc.nextInt())
					{
					case 1: System.out.println("Enter atleast 5 cricketers as : name, age, email_id, Phone, rating");
							Cricketer addnames=ValidationRules.acceptCricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), map);
							map.put(addnames.getEmail_id(), addnames);
							System.out.println("Successfully Added!!!");
							break;
							
					case 2: System.out.println("Enter Cricketer email and rating for update : ");
					 		System.out.println(UpdateRating(sc.next(), sc.nextInt(), map));
					 		break;
					 		
					case 3: System.out.println("Enter Cricketer name to search : ");
					 		Cricketer name=SearchByName(sc.next(), map);
					 		System.out.println(name);
					 		break;
					 		
					case 4: System.out.println("Cricketer's in list : ");
					 		for(Cricketer c : map.values())
					 		{
					 			System.out.println(c);
					 		}
					 		break;
					 		
					case 5: List<Cricketer> sortedList=SortByRatings(map);
							for(Cricketer c : sortedList)
							{
								System.out.println(c);
							}
							break;
							
					case 6: System.out.println("----------------------EXIT----------------------");
					 		exit=true;
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
