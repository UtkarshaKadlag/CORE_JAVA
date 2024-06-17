package com.app.tester;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.Entities.EmployeeEntities;
import com.app.Entities.Application;
import static com.app.validation.Validation.checkAdhaar;
import static com.app.validation.Validation.checkPhone;
import static com.app.validation.Validation.checkValidation;
import static com.app.validation.Validation.searchByAdhaar;
import static com.app.validation.Validation.searchEmployee;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			List<EmployeeEntities> list = new ArrayList<EmployeeEntities>();
			boolean exit=false;
			
			while(!exit)
			{
				System.out.println(" MENU ");
				System.out.println("1.Add full time employee\r\n" + "2.Add part time employee\r\n"
						+ "3.Delete an employee by Emp Id\r\n" + "4.Search employee details by Aadhaar number\r\n"
						+ "5.Display all employee details\r\n"
						+ "6.Display all employee details sorted by date of joining\r\n" + "0.Exit\r\n");
				
				int choice=sc.nextInt();
				
				try 
				{
					switch(choice)
					{
					case 1: System.out.println("1.name 2.joiningDate 3.phoneNumber 4.aadharNumber");
							EmployeeEntities e= checkValidation(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), list);
							list.add(e);
							System.out.println("Employee Added!!!!");
							break;
							
					case 2: System.out.println();
					
					case 3:
						System.out.println("enter employee ID :");
						e = searchEmployee(sc.nextInt(), list);
						list.remove(e);
						System.out.println("employee data deleted");
						break;

					case 4:
						System.out.println("enter aadhar number : ");
						e = searchByAdhaar(sc.next(), list);
						System.out.println("employee found :");
						System.out.println(e);

						break;

					case 5:
						System.out.println("list of all employee as per joining date: ");
						list.stream().forEach(l -> System.out.println(l));
						break;

					case 6:
						Comparator c = new Comparator();
						Collections.sort(list, c);
						list.stream().forEach(l -> System.out.println(l));
						break;

					case 0:
						System.out.println("Exit from Application");
						exit = true;
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}
							
				}
}
