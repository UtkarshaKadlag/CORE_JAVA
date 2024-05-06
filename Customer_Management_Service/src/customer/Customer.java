package customer;

import java.time.LocalDate;

public class Customer 
{
	static private int id_generator;
	private int customer_id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double reg_amount;
	private LocalDate dob;
	private Service_Plan plans;

	public Customer(String fname, String lname, String email,String password, double reg_amount, LocalDate dob,Service_Plan plans)
	{
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		this.reg_amount=reg_amount;
		this.dob=dob;
		this.plans=plans;
		this.customer_id=++id_generator;
	}
	public Customer(String fname, String lname, String email,String password, double reg_amount, String dob,String plans)
	{
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		this.reg_amount=reg_amount;
		//this.dob=dob;
		//this.plans=plans;
		this.customer_id=++id_generator;
	}
	public Customer(String email)
	{
		this.email=email;
	}
	
	public int getCustomer_id() 
	{
		return customer_id;
	}
	public void setCustomer_id(int customer_id) 
	{
		this.customer_id = customer_id;
	}
	public String getFname() 
	{
		return fname;
	}
	public void setFname(String fname) 
	{
		this.fname = fname;
	}
	public String getLname() 
	{
		return lname;
	}
	public void setLname(String lname) 
	{
		this.lname = lname;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPassword() 
	{
		return password;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}
	public double getReg_amount() 
	{
		return reg_amount;
	}
	public void setReg_amount(double reg_amount) 
	{
		this.reg_amount = reg_amount;
	}
	public LocalDate getDob() 
	{
		return dob;
	}
	public void setDob(LocalDate dob) 
	{
		this.dob = dob;
	}
	public Service_Plan getPlans() 
	{
		return plans;
	}
	public void setPlans(Service_Plan plans) 
	{
		this.plans = plans;
	}
	
	
	
	@Override
	public String toString()
	{
		return "Customer Details : Customer Id : "+this.customer_id+
				" Name : "+this.fname+
				" Last Name : "+this.lname+
				" Email : "+this.email+
				" Password : "+this.password+
				" reg_amount : "+this.reg_amount+
				" Date of Birth : "+this.dob+
				" Service_plan : "+this.plans;		
	}

	
	
	@Override
	public boolean equals(Object o) 
	{
		if(o instanceof Customer)
			return this.email.equals(((Customer) o).email);
		return false;
	}
	
}
