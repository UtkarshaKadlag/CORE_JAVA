package com.app.Utils;
import java.util.List;
import java.util.Map;

import com.app.CoreClasses.Orders;
import com.app.CoreClasses.Pets;
import com.app.CoreClasses.PetCategory;
import com.app.CoreClasses.Status;
import com.app.CustomException.AuthenticationException;
import com.app.CustomException.AuthorizationException;
import com.app.CustomException.OutOfStockException;


public class PetUtils 
{
	public static String Userlogin(String username,String password,Map<String,String>users) throws AuthorizationException
	{
		if(users.containsKey(username) && users.get(username).equals(password))
		{
			System.out.println("Successfull Login");
			return username;
		}
		
		throw new AuthenticationException("Login successfull!!!");
	}
	
	public static void checkAutherization(String currentuser) throws AuthorizationException
	{
		if(!currentuser.equals("admin"))
		{
			throw new AuthenticationException("Unauthorized User!!");
		}
	}

	public static void ChckAuthorizationLogin(String currentuser) throws AuthorizationException
	{
		if(currentuser.equals("admin"))
		{
			throw new AuthorizationException("Only Customer can Place Order!!!");
		}
	}
	
	public static void checkAuthentication(String currentuser) throws AuthenticationException
	{
		if(currentuser==null)
		{
			throw new AuthenticationException("Please Login First!!");
		}
	}
	
	public static Pets addnewPet(int id, String name, String Category, int unit_price, int stock)
	{
		PetCategory c=PetCategory.valueOf(Category.toUpperCase());
		return new Pets(id,name,c,unit_price,stock);
	}
	
	public static String checkPetIdUpdate(int petId, String petname,String Category,int unit_price,int stocks,List<Pets> pet_list)
	{
		Pets p=new Pets(petId);
		PetCategory category=PetCategory.valueOf(Category.toUpperCase());
		for(Pets c : pet_list)
		{
			if(c.equals(p))
			{
				c.setName(petname);
				c.setCategory(category);
				c.setUnitPrice(unit_price);
				c.setStocks(stocks);
				return "Pet Information Updated!!!";
			}
		}
		
		return "Invalid petId!!!!You do not perform any Updation!!!!";
	}
	
	public static Orders addNewOrder(int id, int quantity)
	{
		return new Orders(id,quantity);
	}
	
	public static String getOrderById(int id, List<Orders> order_list) throws OutOfStockException
	{
		Orders o=new Orders(id);
		for(Orders a : order_list)
		{
			if(a.equals(o))
			{
				return o.getStatus().toString();
			}
		
		}
		throw new OutOfStockException("Order Id Not Found!!!");
	}
	
	public static String UpdateOrderStatusByOrderId(int id,String status,List<Orders>order_list) throws OutOfStockException
	{
		Orders o=new Orders(id);
		for(Orders a : order_list)
		{
			if(a.equals(o))
			{
				Status s=Status.valueOf(status.toUpperCase());
				a.setStatus(s);
				return "Status is changed!!!!";
			}
		}
		throw new OutOfStockException("Oder Not Found Exception!!!");
	}
}
