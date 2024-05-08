package tester;
import com.app.core.Address;
import com.app.core.Student;
import com.app.core.Subject;
import java.util.Scanner;
import java.util.Map;
import java.io.IOException;
import java.util.Comparator;
import java.util.stream.Stream;

import student_utils.IOUtils;
import student_utils.StudentCollectionUtils;
import static student_utils.StudentCollectionUtils.populateList;
import static student_utils.StudentCollectionUtils.populateMap;
import static student_utils.IOUtils.readDetails;
import static student_utils.IOUtils.WriteDetails;
public class StoreStudentDetails 
{

	public static void main(String[] args) throws IOException
	{
		try(Scanner sc=new Scanner(System.in))
		{
			Map<String, Student>map= populateMap(populateList());
			System.out.println("Enter the fileName, to store the Student Details : ");
			WriteDetails(map, sc.nextLine());
			System.out.println("Data Stored Successfully!!!");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Main Over....");
	}
}
