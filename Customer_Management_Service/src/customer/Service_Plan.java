package customer;

public enum Service_Plan 
{
	GOLD(1000),SILVER(2000),DIMOND(5000),PLATINUM(10000);
	
	private double amount;
	
	private Service_Plan(double amount) 
	{
		this.amount=amount;
	}

	public double getAmount() 
	{
		return amount;
	}

	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
	
}
