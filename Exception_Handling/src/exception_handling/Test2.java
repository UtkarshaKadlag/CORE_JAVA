//SEQENTICAL EXCUSION OF TRY CATCH AND FINALLY BLOCK//
/*MAIN->testMe->BUSSINESS LOGIC->END OF METHOD'S TRY(IF DOSEN'T CATCH AN EXC.)->METHOD'S FINALLY->
END OF METHOD->BACK TO MAIN->IN MAIN'S FINALLY BLOACK->END OF MAIN'S TRY BLOCK->END OF MAIN */
package exception_handling;

public class Test2 
{

	public static void main(String[] args) 
	{
		try 
		{
			testMe("1234");
			System.out.println("End of try in main...");
		}
		catch(Exception e)
		{
			System.out.println("in main's catch-all");
			System.out.println(e);
		}
		finally //THIS BLOCK EXCUTES ALL THE TIME NO MATTER IF IT CATCHES AN EXCEPTION OR NOT//
		{
			System.out.println("In main's finally!!!!");
		}
		System.out.println("MAIN OVER...");
	}
	static void testMe(String s)
	{
		System.out.println("in testMe");
		try 
		{
			System.out.println("Parsed int value : "+Integer.parseInt(s));
			System.out.println("End of Method's try block...");
		}
		finally 
		{
			System.out.println("In Method's finally block!!!!"); 
		}
		System.out.println("END OF METHOD!!!");
	}

}
