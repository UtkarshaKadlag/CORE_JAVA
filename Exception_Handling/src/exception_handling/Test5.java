//FINALLY IS NOT EXCUTED ONLY IF SYSTEM IS TERINATED OR EXITED AND IT DOES NOT GO BACK TO MAIN//

package exception_handling;

public class Test5 
{

	public static void main(String[] args) 
	{
		try 
		{
			testMe("2345");
			System.out.println("End of try block of main...");
		}
		catch(Exception e)
		{
			System.out.println("In main's catch-all block...");
		}
		finally
		{
			System.out.println("In main's finally block...");
		}
		System.out.println("Main Over!!!!");
	}
	static void testMe(String s) throws InterruptedException
	{
		System.out.println("In testMe method....");
		try 
		{
			System.out.println("Parsed int value :"+Integer.parseInt(s));
			Thread.sleep(10000);
			boolean flag=true;
			if(flag)
				System.exit(0);
			System.out.println("End of try block of testMe");
		}
		finally
		{
			System.out.println("In finally block of method...");
		}
		System.out.println("END OF METHOD!!!");
	}	

}
