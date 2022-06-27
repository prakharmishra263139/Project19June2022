package com.mishraprakhar;

import java.util.Scanner;

public class MaxAndMin {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		n = sc.nextInt();
		
		int array[] = new int[n];
		
	    System.out.println("Enter the elements of an array");
		
		int min;
		int max;
		
		for(int i = 0 ; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		min = array[0];
		max = array[0];
		
		for(int i=1;i<n;i++)
		{
			if(min>array[i])
				
			{
				min = array[i];
			}
			
			if(max<array[i])
			{
				max = array[i];
			}
		}
		System.out.println("Min : " + min);
		System.out.println("Max : " + max);
		sc.close();
		
	}


}
