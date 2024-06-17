package com.app.validation;

import com.app.Entities.EmployeeEntities;

public class Comparator implements java.util.Comparator<EmployeeEntities>
{
	@Override
	public int compare(EmployeeEntities e1, EmployeeEntities e2)
	{
		return e1.getJoiningDate().compareTo(e2.getJoiningDate());
	}
}
