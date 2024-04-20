package com.sorting;
import java.util.Scanner;
public class selection_sort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		int[] arr;
		arr=new int[5];
		
		System.out.println("Enter the elements of array : ");
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Element : ");
			arr[i]=in.nextInt();
		}
		
		System.out.println("Elements of Array :");
		for(int i=0;i<5;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=i+1; j<5; j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("\n Sorted Array : ");
		for(int i=0; i<5; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
