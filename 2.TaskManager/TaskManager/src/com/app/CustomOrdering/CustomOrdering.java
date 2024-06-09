package com.app.CustomOrdering;
import java.util.Comparator;

import com.app.TaskManager.TaskManager;
public class CustomOrdering implements Comparator<TaskManager>
{
	@Override
	public int compare(TaskManager t1, TaskManager t2)
	{
		return t1.getTaskDate().compareTo(t2.getTaskDate());
	}
	
}
