package customer;
import customer.Customer;
import customer.Service_Plan;

import java.time.LocalDate;
import java.util.List;

import customer.CustomException;

public class CustomerValidations 
{
	public static void ChckForDup(String email, List<Customer>custlist)throws CustomException
	{
		if(custlist.contains(email))
			throw new CustomException("Duplicate Email Entry!!!");
	}	
	
	public static Service_Plan parseandValidatePlanandCharges(double amount, String plan) throws CustomException
	{
		
		Service_Plan plans=Service_Plan.valueOf(plan.toUpperCase());
		if(plans.getAmount()==amount)
			return plans;
		throw new CustomException("The amount does not match the plan, please try again!!!");
	}
	
	
	public static Customer ValidateAllInputs(String fname, String lname, String email, String password, double amt, String dob,String plans, List<Customer>custlist) throws CustomException
	{
		ChckForDup(email,custlist);
		LocalDate birthDate=LocalDate.parse(dob);
		Service_Plan serviceplan = parseandValidatePlanandCharges(amt, plans);
		return new Customer(fname,lname,email,password,amt,birthDate,serviceplan);
	}
	
	public static Customer authenticateAccount(String email, String password, List<Customer>custlist) throws CustomException
	{
		Customer cust=new Customer(email);
		int index = custlist.indexOf(cust);
					if(index==-1)
						throw new CustomException("Email Id not found...Please Try Again!!!");
					Customer customer=custlist.get(index);
					if(customer.getPassword().equals(password))
						return customer;
					throw new CustomException("Invalid Password...Please Try Again!!!");
	}
	
	public static Customer Unsubscribeaccount(String email, String password, List<Customer>custlist) throws CustomException
	{
		Customer cust=new Customer(email);
		int index = custlist.indexOf(cust);
					if(index==-1)
						throw new CustomException("Email Id not found...Please Try Again!!!");
					Customer customer=custlist.get(index);
					
					if(customer.getPassword().equals(password))
						return customer;
					throw new CustomException("Invalid Password...Please Try Again!!!");
	}
	
}
