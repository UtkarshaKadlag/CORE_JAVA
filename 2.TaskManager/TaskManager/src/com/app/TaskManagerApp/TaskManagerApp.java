package com.app.TaskManagerApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.app.TaskException.TaskException;
import com.app.TaskManager.Status;
import com.app.TaskManager.TaskManager;
import static com.app.TaskUtility.TaskUtils.addTask;
import static com.app.TaskUtility.TaskUtils.deleteTask;
import static com.app.TaskUtility.TaskUtils.UpdateTask;
import static com.app.TaskUtility.TaskUtils.DisplayAllPendingTasks;
import static com.app.TaskUtility.TaskUtils.TodaysPendingTasks;
import com.app.CustomOrdering.CustomOrdering;


@SuppressWarnings("unused")
public class TaskManagerApp 
{

	public static void main(String[] args) 
	{
		try(Scanner sc =new Scanner(System.in))
		{
			List<TaskManager>task_list=new ArrayList<TaskManager>();
			boolean exit=false;
			
			while(!exit)
			{
				try 
				{
					System.out.println("------------------------MAIN MENU------------------------");
					System.out.println("1.Add a Task \n2.Delete a Task \n3.Update TaskStatus \n4.Display all Pending Tasks \n5.Display pending Tasks for Today \n6.Display All Tasks Sotred By Date \n");
					System.out.println("Enter Your Choice : ");
					
					switch(sc.nextInt())
					{
						case 1: System.out.println("Enter Following Task Details to Add a Task: TaskId, Task_Name, Description, Task_Date, Task_Status, Active");
								task_list.add(addTask(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextBoolean()));
								System.out.println(task_list);
								System.out.println("Task Added Successfully!!");
								break;
								
						case 2: System.out.println("Enter TaskId to delete the task : ");
								System.out.println(deleteTask(sc.nextInt(), task_list));
								break;
								
						case 3:  System.out.println("Enter the TaskId and Updated Status you want to Update : ");
						 		 System.out.println(UpdateTask(sc.nextInt(), sc.next(), task_list));
								 break;
						
						case 4: System.out.println("pending tasks : "+DisplayAllPendingTasks(task_list));
						 		break;
						 		
						case 5: System.out.println("Enter Today's Date to see Today's Pending tasks : "+TodaysPendingTasks(sc.next(), task_list));
								break;
								
						case 6: System.out.println("Task Sorted By Date : ");
								Collections.sort(task_list,new CustomOrdering());
								System.out.println(task_list);
								break;
					}
				}
				catch(Exception e)
				{
					sc.nextLine();
					e.printStackTrace();
				}
			}
		}

	}

}
