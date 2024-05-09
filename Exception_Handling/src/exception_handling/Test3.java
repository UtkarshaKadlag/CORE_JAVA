//EXECUSION OF TRY CATCH AND FINALLY IF IT DOESN'T CATCH ANY EXCEPTION AND FLOWS THOROUGHLLY//

package exception_handling;

public class Test3 {

	public static void main(String[] args) 
	{
		try 
		{
			testMe("2345");
			System.out.println("End try block of Main...");
		}
		catch(Exception e)
		{
			System.out.println("In catch block of main....");
			System.out.println(e);
		}
		finally 
		{
			System.out.println("In Main's Finally Block...");
		}
		
		System.out.println("END OF MAIN!!!!");
	}
	
	static void testMe(String s) throws InterruptedException
	{
		System.out.println("In testMe.....");
		try 
		{
			System.out.println("Parsed int value :"+Integer.parseInt(s));
			Thread.sleep(1000);
			System.out.println("I end of try block of Method....");
		}
		finally
		{
			System.out.println("In finally block of Method....");
		}
		System.out.println("END OF METHOD!!!!");
	}
}
