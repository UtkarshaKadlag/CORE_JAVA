package com.app.utils;

import com.app.StyleWithPen.StyleWithPen;
import com.app.StyleWithPen.Brand;
import com.app.StyleWithPen.Material;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Period;

public class StyleWithPenUtils 
{
	public static StyleWithPen addPens(int id,String brandname,
			String color,String inkcolor,String material,double stock,String stock_update_date,String stock_listing_date,double price,float discounts)
	{
		Brand b=Brand.valueOf(brandname.toUpperCase());
		Material m=Material.valueOf(material.toUpperCase());
		LocalDate stockupdatedate=LocalDate.parse(stock_update_date);
		LocalDate stocklistingdate=LocalDate.parse(stock_listing_date);
		
		return new StyleWithPen(id,b, color,inkcolor, m,stock,stockupdatedate,stocklistingdate,price,discounts);
	}
	
	public static StyleWithPen updateStock(int penId, double stock,List<StyleWithPen>pen_list)
	{
		StyleWithPen penid=new StyleWithPen(penId);
		int index=pen_list.indexOf(penid);
		System.out.println(index);
		StyleWithPen updatestock=pen_list.get(index);
		updatestock.setStock(stock);
		
		return updatestock;
		
	}
	
	public static List<StyleWithPen> CalculateDiscount(List<StyleWithPen> pen_list)
	{
		List<StyleWithPen>pendiscount=new ArrayList<>();
		for(StyleWithPen a : pen_list)
		{
			int month=Period.between(a.getStock_listing_date(), a.getStock_update_date()).getMonths();
			if(month>=3)
			{
				a.setDiscount(20);
				pendiscount.add(a);
			}
		}
		return pendiscount;
	}
	
	public static String RemovePen(List<StyleWithPen> pen_list)
	{
		for(StyleWithPen a : pen_list)
		{
			int month=Period.between(a.getStock_listing_date(), a.getStock_update_date()).getMonths();
			if(month>=9)
			{
				StyleWithPen penid=new StyleWithPen(a.getId());
				int i=pen_list.indexOf(penid);
				pen_list.remove(i);
			}
		}
		
		return "Pen is Removed from list";
	}
}
