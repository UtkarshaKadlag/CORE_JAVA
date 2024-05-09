package exception_handling;

public class Test4 {

	public static void main(String[] args) 
	{
		try 
		{
			testMe("2345");
			System.out.println("End of try block in main!!!");
		}
		catch(Exception e)
		{
			System.out.println("In catch all block of Main...");
			System.out.println(e);
		}
		finally
		{
			System.out.println("In main's finally block....");
		}
		System.out.println("MAIN OVER!!!!");
	}
	static void testMe(String s)throws 	InterruptedException
	{
		System.out.println("in testMe method....");
		try 
		{
			System.out.println("In try block of method....");
			Thread.sleep(10000);
			boolean flag=true;
			if(flag)
				return;
			System.out.println("end of try block of method....");
		}
		finally
		{
			System.out.println("In finally black of method...");
		}
		System.out.println("END OF METHOD!!!");
	}

}
