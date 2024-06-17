package com.app.Tester;

import com.app.CoreClasses.PetCategory;
import com.app.CoreClasses.Orders;
import com.app.CoreClasses.Pets;
import com.app.CoreClasses.Status;
import com.app.CustomException.AuthenticationException;
import com.app.CustomException.AuthorizationException;
import com.app.CustomException.OutOfStockException;
import com.app.CustomException.PetStore;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import static com.app.Utils.PetUtils.addnewPet;
import static com.app.Utils.PetUtils.ChckAuthorizationLogin;
import static com.app.Utils.PetUtils.checkAuthentication;
import static com.app.Utils.PetUtils.checkAutherization;
import static com.app.Utils.PetUtils.checkPetIdUpdate;
import static com.app.Utils.PetUtils.getOrderById;
import static com.app.Utils.PetUtils.UpdateOrderStatusByOrderId;
import static com.app.Utils.PetUtils.Userlogin;
import static com.app.Utils.PetUtils.addNewOrder;

public class PetTester 
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			List<Pets> pets=new ArrayList<Pets>();
			List<Orders> orders=new ArrayList<Orders>();
			String currentuser=null;
			Map<String,String>user=new HashMap<>();
			
			user.put("admin", "admin");
			user.put("customer", "customer");
			
			boolean exit=false;
			while(!exit)
			{
				try 
				{
					System.out.println("---------------------------------------PET STORE APPLICATION---------------------------------------");
					System.out.println("1.Add new Pet \n2.Update Pet details \n3.Display all available pets \n4.Order a Pet \n5.Check order status by Order Id \n6.Update order status \n7.Exit");
					System.out.println("Enter Your Choice : ");
					
					switch(sc.nextInt())
					{
					case 1: System.out.println("Enter your username and password : ");
							currentuser=Userlogin(sc.next(), sc.next(), user);
							break;
							
					case 2: checkAuthentication(currentuser);
							checkAutherization(currentuser);
							System.out.println("===================================ADD NEW PET===================================");
							System.out.println("Enter :petId, name, category, unitPrice, stocks");
							Pets p=addnewPet(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt());
							pets.add(p);
							System.out.println("===================================NEW PET ADDED===================================");
							System.out.println(p);
							break;
							
					case 3: checkAuthentication(currentuser);
							checkAutherization(currentuser);
							System.out.println("===================================UPDATE PET INFORMATION===================================");
							System.out.println("Enter : petId, name, category, unitPrice, stocks : ");
							System.out.println(checkPetIdUpdate(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), pets));
							break;
							
					case 4: System.out.println("===================================ALL PET INFORMATION===================================");
					 		for(Pets a : pets)
					 		{
					 			System.out.println(a);
					 		}
					 		break;
					 		
					case 5: checkAuthentication(currentuser);
							checkAutherization(currentuser);
							System.out.println("Enter Id, Quantiity");
							Orders o=addNewOrder(sc.nextInt(), sc.nextInt());
							orders.add(o);
							System.out.println("===================================ORDER ADDED===================================");
							break;
							
					case 6: checkAuthentication(currentuser);
							checkAutherization(currentuser);
							System.out.println("Enter id to check order status : ");
							String orderStatus=getOrderById(sc.nextInt(), orders);
							System.out.println("Order Status : "+orderStatus);	
							break;
							
					case 7: checkAuthentication(currentuser);
							checkAutherization(currentuser);
							System.out.println("Enter orderId and new order status : ");
							System.out.println(UpdateOrderStatusByOrderId(sc.nextInt(), sc.next(), orders));
							for(Orders a: orders)
							{
								System.out.println(a);
							}
							break;
							
					case 0 : break;
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
