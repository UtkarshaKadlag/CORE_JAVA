package employee_HashCode_Both;

import java.util.HashSet;

public class Tester_Employee 
{

	public static void main(String[] args) 
	{
		Employee e1=new Employee("rnd-001", "a1 b1", 10000);
		Employee e2=new Employee("rnd-012", "a2 b2", 10000);
		Employee e3=new Employee("rnd-001", "a3 b3", 10000);
		Employee e4=new Employee("BBBB", "a4 b4", 10000);
		Employee e5=new Employee("AaBB", "a5 b5", 10000);
		Employee e6=new Employee("AaAa", "a6 b6", 10000);
		Employee e7=new Employee("AaAa", "a6 b6", 10000);
		
		
		HashSet<Employee>empset=new HashSet<>();
		
		System.out.println("Added : "+empset.add(e1));
		System.out.println("Added : "+empset.add(e2));
		System.out.println("Added : "+empset.add(e3));
		System.out.println("Added : "+empset.add(e4));
		System.out.println("Added : "+empset.add(e5));
		System.out.println("Added : "+empset.add(e6));
		
		System.out.println("Size : "+empset.size());
		
		for(Employee e : empset)
			System.out.println(e);
		System.out.println("rnd-001".hashCode()+" "+"AaAa".hashCode());
	}

}
