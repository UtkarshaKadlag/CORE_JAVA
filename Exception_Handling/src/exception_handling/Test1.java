package exception_handling;

public class Test1 
{

	public static void main(String[] args) 
	{
		try 
		{
			String[] names= {"abc","def","xyz"};
			System.out.println(names[20]);
			int a=10;
			int b=4;
			System.out.println("Division : "+(a/b));
			System.out.println("int val : "+Integer.parseInt("1234"));
			String s=null;
			System.out.println(s.length());
			System.out.println("End of try block.....");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch block for ArrayIndexOutOfBoundsException ");
			System.out.println(1);
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("inside catch block for NullPointerException or ArithmeticException");
			System.out.println(2);
		}
		
		catch(Exception e)
		{
			System.out.println("Inside catch block of Exception e");
			System.out.println("in catch-all");
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println(e);
			System.out.println();
			e.printStackTrace();	
		}
		System.out.println("Main continues.....");
	}

}
