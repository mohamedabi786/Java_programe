package com.dev;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args)
	{
//		System.out.println("ODD OR EVEN");
		Scanner num = new Scanner(System.in);
//		System.out.println("Enter a Number:");
//		int number=num.nextInt();
//		if(number%2==0)
//		{
//			System.out.println("This Number is Even Number");
//			
//		}
//		else {
//			System.out.println("This Number is Odd NUmber");
//		}
//		num.close();
//		System.out.println("Postive or negative");
//		Scanner num = new Scanner(System.in);
//		System.out.println("Enter a Number:");
//		int number=num.nextInt();
//		if(number>=0)
//		{
//			System.out.println("This Number is Postive");
//		}
//		else {
//			System.out.println("This Number is Negative");
//		}
		System.out.println("Leap year or not");
		System.out.println("Enter the year:");
		long year=num.nextLong();
		if(year % 400 == 0 || year % 4==0 && year %100!= 0 )
		{
			System.out.println("The number is leap year");
		}
		else {
			System.out.println("The number is  not leap year");
		}
		
		
		
	}

}
