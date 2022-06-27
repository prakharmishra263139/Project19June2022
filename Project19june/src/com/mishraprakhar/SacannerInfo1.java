package com.mishraprakhar;
import java.util.*;

public class SacannerInfo1 {
	public static void main(String args[])
	{
		Scanner MyInfo1 = new Scanner(System.in);
		
		Scanner MyInfo2 = new Scanner(System.in);
		
		Scanner MyInfo3 = new Scanner(System.in);
		
		System.out.println("Enter the name ");
		
		String name = MyInfo1.nextLine();
		
		System.out.println("Enter the age");
		
		int InfoAge = MyInfo2.nextInt();
		
		System.out.println("Enter the salary");
		double SalaryInfo = MyInfo3.nextDouble();
		
		System.out.println("Enter the Name" +"- " + name);
		System.out.println("Enter the Age" + "- " +InfoAge);
		System.out.println("Enter the salary"+"- "+ SalaryInfo);
		
		MyInfo1.close();
		MyInfo2.close();
		MyInfo3.close();
			
	}

}
