package customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import customer.CustomException;
import customer.CustomerValidations;
import customer.Service_Plan;

public class CustomerApplication 
{

	public static void main(String[] args) 
	{
		
	try(Scanner in=new Scanner(System.in))
	{
		boolean exit=false;
		
		List<Customer>customerlist=new ArrayList<>();
		
		while(!exit)
		try 
		{	
			System.out.println("WELCOME TO CUSTOM APPLICATON!!!!");
			System.out.println("1.SignUp  2.LogIn  3.Update Password  4.Unsubscribe  5.Exit");
			System.out.println("Enter Your Choice : ");
		
			switch(in.nextInt())
			{
				case 1: System.out.println("Enter your Details : first name, last name, email, password, registration amount, Date Of Birth, Service Plan : ");
						Customer customer=CustomerValidations.ValidateAllInputs(in.next(), in.next(), in.next(), in.next(), in.nextDouble(), in.next(), in.next(), customerlist);
						customerlist.add(customer);
						System.out.println("SignUp succcessfull...");
						break;
			
				case 2: System.out.println("Enter your Email _Id and password:");
				 		customer=CustomerValidations.authenticateAccount(in.next(), in.next(), customerlist);
				 		System.out.println("LogIn Successful!!!");
				 		break;
				 		
				case 3: System.out.println("Enter your Email_Id and password : ");
						customer=CustomerValidations.authenticateAccount(in.next(), in.next(), customerlist);
						customer.setPassword(in.next());
						System.out.println("Password Changes Successfully!!!!");
						break;
						
				case 4: System.out.println("Enter Your Email_Id to Unsubscribe : ");
				 		customer=CustomerValidations.Unsubscribeaccount(in.next(), in.next(), customerlist);
				 		System.out.println("Successfully Unsubscribed your account : "+customer.getFname()+" "+customer.getLname());
						break;
						
				case 5: exit=true;
						break;
						
			}
		}
		catch(Exception e)
		{
			in.nextLine();
			System.out.println(e);
		}
	}
		
	}

}
