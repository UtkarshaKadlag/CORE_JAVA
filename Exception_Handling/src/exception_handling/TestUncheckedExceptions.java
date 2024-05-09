//WHEN AN EXCEPTION IS CAUGHT IT DOES NOT CONTINUE IN TRY BLOCK BUT IT DOES CONTINUE EXECUTION OF MAIN///

package exception_handling;

public class TestUncheckedExceptions 
{

	public static void main(String[] args) 
	{
		try
		{
			String[] names= {"abc","def","xyz"};
			System.out.println(names[2]);
			int a=10;
			int b=4;
			System.out.println("Divide : "+(a/b));
			System.out.println("Parsed int value : "+Integer.parseInt("1234"));
			String s=null;
			System.out.println(s.length());
			System.out.println("End of try block in main....");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(1);
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println("ArithmeticException or NullPointerException");
		}
		catch(Exception e)
		{
			System.out.println("In catch all Exception block...");
		}
		System.out.println("Main Continues....");
	}

}
