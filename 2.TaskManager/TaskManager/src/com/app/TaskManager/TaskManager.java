package com.app.TaskManager;

import java.time.LocalDate;
import java.util.Objects;

import com.app.TaskManager.Status;

@SuppressWarnings("unused")
public class TaskManager 
{
	private static int id_generator=1;
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private Status status;
	private boolean active;
	
	public TaskManager(int taskId,String taskName, String description, LocalDate taskDate, Status status, boolean active) 
	{
		super();
		this.taskId=id_generator++;
		this.taskName = taskName;
		this.description = description;
		this.taskDate = taskDate;
		this.status = status;
		this.active = active;		
	}
	
	public TaskManager(int taskId) 
	{
		super();
		this.taskId = taskId;
	}

	public int getTaskId() 
	{
		return taskId;
	}

	public void setTaskId(int taskId) 
	{
		this.taskId = taskId;
	}

	public String getTaskName() 
	{
		return taskName;
	}

	public void setTaskName(String taskName) 
	{
		this.taskName = taskName;
	}

	public String getDescription() 
	{
		return description;
	}

	public void setDescription(String description) 
	{
		this.description = description;
	}

	public LocalDate getTaskDate() 
	{
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) 
	{
		this.taskDate = taskDate;
	}

	public Status getStatus() 
	{
		return status;
	}

	public void setStatus(Status status) 
	{
		this.status = status;
	}

	public boolean isActive() 
	{
		return active;
	}

	public void setActive(boolean active) 
	{
		this.active = active;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(taskId);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskManager other = (TaskManager) obj;
		return taskId == other.taskId;
	}

	@Override
	public String toString() 
	{
		return "TaskManager [taskId=" + taskId + 
				" taskName=" + taskName + 
				" description=" + description + 
				" taskDate=" + taskDate + 
				" status=" + status + 
				" active=" + active + "]";
	}
	
	
	
}
