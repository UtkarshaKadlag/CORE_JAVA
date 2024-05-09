package exception_handling;

public class TestCheckedException 
{

	public static void main(String[] args) 
	{
		System.out.println("Before!!");
		try 
		{
			Thread.sleep(1000);	
		}
		catch(InterruptedException e)
		{
			System.out.println("ERROR!!!");
		}
		System.out.println("After!!");
	}

}
