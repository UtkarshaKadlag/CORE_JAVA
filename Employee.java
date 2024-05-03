package employee_HashCode_Both;

public class Employee 
{
	private String id;
	private String name;
	private double salary;
	
	public Employee(String id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	

	@Override
	public String toString()
	{
		return "Employee Details : Employee_Id : "+this.id+
				"Name : "+this.name+
				"Salary : "+this.salary;
	}
	
	
	
	@Override
	public boolean equals(Object o)
	{
		System.out.println("In equals of Employee");
		if(o instanceof Employee)
			return this.id.equals(((Employee)o).id);
				
		return false;
			
	}
	
	@Override
	public int hashCode()
	{
		System.out.println("in hashCode of Employee");
		return id.hashCode();
	}
}
