package com.app.TaskUtility;

import com.app.TaskManager.TaskManager;
import com.app.TaskManager.Status;
import com.app.TaskException.TaskException;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

@SuppressWarnings("unused")
public class TaskUtils 
{
	public static TaskManager addTask(int taskId, String taskName, String description, String Taskdate, String taskstatus, boolean active)
	{
		LocalDate taskDate=LocalDate.parse(Taskdate);
		Status TaskStatus=Status.valueOf(taskstatus.toUpperCase());
		return new TaskManager(taskId, taskName, description, taskDate, TaskStatus, active);
	}
	
	public static String deleteTask(int taskId, List<TaskManager>task)
	{
		TaskManager taskid= new TaskManager(taskId);
		
		int index=task.indexOf(taskid);
		TaskManager deletetask=task.get(index);
		task.remove(deletetask);
		
		return "Task Removed Successfully with TaskId : "+taskId;
	}
	
	public static String UpdateTask(int TaskId, String TaskStatus, List<TaskManager>task)
	{
		TaskManager taskid=new TaskManager(TaskId);
		Status taskstatus=Status.valueOf(TaskStatus.toUpperCase());
		int i=task.indexOf(taskid);
		System.out.println(i);
		TaskManager statusupdate=task.get(i);
		statusupdate.setStatus(taskstatus);
		
		return "Task_Status Updated Successfully to : "+taskstatus;
	}
	
	public static List<TaskManager> DisplayAllPendingTasks(List<TaskManager> task)
	{
		List<TaskManager> pendingtasks=new ArrayList<TaskManager>();
		Status p=Status.PENDING;
		for(TaskManager a : task)
		{
			if(a.getStatus()==p)
			{
				pendingtasks.add(a);
				System.out.println("Task added");
			}
		}
		return pendingtasks;
	}
	
	public static List<TaskManager> TodaysPendingTasks(String date,List<TaskManager> task)
	{
		LocalDate taskdate=LocalDate.parse(date);
		Status p=Status.PENDING;
		List<TaskManager> tptask=new ArrayList<TaskManager>();
		
		for(TaskManager a : task)
		{
			if(a.getStatus()==p && taskdate.equals(LocalDate.now()))
			{
				tptask.add(a);
			}
		}
		return tptask;
	}
}
