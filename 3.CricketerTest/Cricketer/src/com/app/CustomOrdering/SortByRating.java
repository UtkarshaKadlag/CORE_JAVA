package com.app.CustomOrdering;

import java.util.Comparator;
import com.app.Cricketer.Cricketer;

public class SortByRating implements Comparator<Cricketer>
{
	@Override
	public int compare(Cricketer c1, Cricketer c2)
	{
		return ((Integer)c1.getRating()).compareTo((Integer)c2.getRating());
	}
}
