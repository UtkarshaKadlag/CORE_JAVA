package tester;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

import com.app.core.Student;
import com.app.core.Address;
import com.app.core.Subject;

import static student_utils.StudentCollectionUtils.populateList;
import static student_utils.StudentCollectionUtils.populateMap;

import static student_utils.IOUtils.readDetails;
import static student_utils.IOUtils.WriteDetails;


public class RestoreStudentDetails 
{

	public static void main(String[] args) throws ClassNotFoundException,IOException
	{
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter fileName, to restore Student Details : ");
			Map<String, Student> map=readDetails(sc.nextLine());
			System.out.println("Student Details : ");
			map.forEach((k,v)->System.out.println(v));	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Main Over...");
	}

}
