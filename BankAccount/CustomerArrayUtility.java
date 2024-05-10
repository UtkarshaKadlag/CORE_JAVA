package com.arrayofcontainmentobjects;

import java.util.Scanner;

public class CustomerArrayUtility {

	public static void acceptCustomerDetails(Customer[] arr)
	{
		Scanner in=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the cust id:");
			String custid=in.next();
			System.out.println("Enter the name:");
			String name=in.next();
			System.out.println("Enter the accno:");
			String accno=in.next();
			System.out.println("Enter the bal:");
			double bal=in.nextDouble();
			System.out.println("Enter 1. SAVING 2. RECURING 3. CURRENT");
			int acode=in.nextInt();
			AccountType accType=null;
			switch(acode)
			{
			case 1:
				accType=AccountType.SAVING;
				break;
			case 2:
				accType=AccountType.RECURRING;
				break;
			case 3:
				accType=AccountType.CURRENT;
				break;
			}

			arr[i]=new Customer(custid, name, new Account(accno,bal,accType));
		}
	}

	public static void displayCustDetails(Customer[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}


