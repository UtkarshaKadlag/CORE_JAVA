package com.app.tester;

import com.app.StyleWithPen.Material;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.StyleWithPen.Brand;
import com.app.StyleWithPen.StyleWithPen;
import static com.app.utils.StyleWithPenUtils.addPens;
import static com.app.utils.StyleWithPenUtils.updateStock;
import static com.app.utils.StyleWithPenUtils.CalculateDiscount;
import static com.app.utils.StyleWithPenUtils.RemovePen;

public class PensApplication
{

	public static void main(String[] args) 
	{
		try(Scanner sc=new Scanner(System.in))
		{
			
			List<StyleWithPen> pen_list=new ArrayList<>();
			boolean exit=false;
			
			try
			{
				while(!exit)
				{
					System.out.println("-------------------MAIN MENU-------------------");
					System.out.println("1.Add new Pens \n2.Update stock of aPen \n3.Set discount of 20% for all the pens which are not at all sold in last 3 montns \n4.Remove Pens which arenever sold once listed in 9 months");
					System.out.println("Enter Your Choice : ");
					int choice=sc.nextInt();
					
					switch(choice)
					{
					case 1: System.out.println("Enter Pen details to add : id,brandname,color,inkcolor,material, stock, stock update date, stock listing date,price, discounts");
							StyleWithPen item=addPens(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(), sc.next(), sc.nextDouble(), sc.nextFloat());
							pen_list.add(item);
							for(StyleWithPen p : pen_list)
							{
								System.out.println(p);
							}
							break;
							
					case 2: System.out.println("Enter the penid and stock amount to update : ");
					 		StyleWithPen updateitem=updateStock(sc.nextInt(),sc.nextDouble(),pen_list);
					 		System.out.println(updateitem);
					 		break;
					 		
					case 3: List<StyleWithPen> updatediscount=CalculateDiscount(pen_list);
							for(StyleWithPen a : pen_list)
							{
								System.out.println(a);
							}
							break;
							
					case 4: System.out.println(RemovePen(pen_list));
							break;
							
					case 5: System.out.println("----------------EXIT----------------");
							exit=true;
							break;
					}
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
