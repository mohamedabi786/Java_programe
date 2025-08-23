package com.test;

import java.util.Scanner;

public class Test1 {
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			//Student Grade check:
//			System.out.println("Enter the mark:");
//			int mark=s.nextInt();
//			if(mark>=90 && mark <=100)
//			{
//				System.out.println("Your Grade Is A");
//			}
//			else if(mark>=80 && mark <=89)
//			{
//				System.out.println("Your Grade Is B");
//			}
//			else if(mark>=70 && mark<=79)
//			{
//				System.out.println("Your Grade Is C");
//			}
//			else if(mark>=60 && mark<=69)
//			{
//				System.out.println("Your Grade Is D");
//			}
//			else if(mark<60)
//			{
//				System.out.println("Fail");
//			}
//			else {
//				System.out.println("Enter Crt mark");
//			}
//			//menu:
//			do {
//				System.out.println("\n..MENU..");
//				System.out.println("1.print Hello");
//				System.out.println("2.print World");
//				System.out.println("3.exit");
//				System.out.println("Enter Your choice:");
//				int ch=s.nextInt();
//				
//				if(ch==1) {
//					System.out.println("Hello");
//				}
//				else if(ch==2)
//				{
//					System.out.println("Hello World");
//				}
//				else if(ch==3)
//					
//				{
//					System.out.println("you want exit");
//					char con=s.next().charAt(0);
//					if(con=='y' || con=='Y')
//					{
//						System.out.println("Bye bye");
//						break;
//					}
//					else {
//						System.out.println("Continuee");
//					}
//				}
//			}while(true);
//			square of number:
//			int n1;
//			do {
//				System.out.println("Enter a number:");
//				n1 =s.nextInt();
//				if(n1>=0)
//				{
//					System.out.println("The Square of Number is:"+n1*n1);
//				}
//				else {
//					System.out.println("The number is negative");
//				}
//			}while(n1>=0);
			//TYPE OF INPUT CHECK
//			System.out.println("Enter a Character:");
//			char ch=s.next().charAt(0);
//			 if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//		            System.out.println(ch + " is an Alphabet.");
//		        } 
//		        else if (ch >= '0' && ch <= '9') {
//		            System.out.println(ch + " is a Digit.");
//		        } 
//		        else {
//		            System.out.println(ch + " is a Special Character.");
//		        }
			//Electricity Bill
//			System.out.print("Enter units consumed: ");
//	        int units = s.nextInt();
//	        double bill = 0;
//
//	        if (units <= 100) {
//	            bill = units * 1.5;
//	        } 
//	        else if (units <= 200) {
//	            bill = (100 * 1.5) + ((units - 100) * 2.5);
//	        } 
//	        else {
//	            bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4);
//	        }
//
//	        System.out.println("Electricity Bill = ₹" + bill);
			//Multiplication Table
//	           System.out.print("Enter a number: ");
//	        int num = s.nextInt();
//
//	        System.out.println("Multiplication Table of " + num + ":");
//	        for (int i = 1; i <= 10; i++) {
//	            System.out.println(num + " x " + i + " = " + (num * i));
//	        }
//			  System.out.print("Enter a string: ");
//		        String str = s.nextLine();
//		        //Count Vowels in a String
//		        int count = 0;
//		        str = str.toLowerCase(); 
//		        for (int i = 0; i < str.length(); i++) {
//		            char ch = str.charAt(i);
//		            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//		                count++;
//		            }
//		        }
//
//		        System.out.println("Number of vowels in the string: " + count);
		        //ATM MENU
//				int b=0;
//				do {
//		            System.out.println("\n..MENU..");
//		            System.out.println("1. Check Balance");
//		            System.out.println("2. Deposit");
//		            System.out.println("3. Withdraw");
//		            System.out.println("4. Exit");
//
//		            System.out.print("Enter Your Choice: ");
//		            int ch = s.nextInt();
//
//		            if (ch == 1) {
//		                System.out.println("Your Balance: ₹" + b);
//		            } 
//		            else if (ch == 2) {
//		                System.out.print("Enter Deposit Amount: ");
//		                int d = s.nextInt();
//		                b = b + d;
//		                System.out.println("₹" + d + " Deposited Successfully!");
//		            } 
//		            else if (ch == 3) {
//		                System.out.print("Enter Withdraw Amount: ");
//		                int w = s.nextInt();
//		                if (w <= b) {
//		                    b = b - w;
//		                    System.out.println("₹" + w + " Withdrawn Successfully!");
//		                } else {
//		                    System.out.println("Insufficient Balance!");
//		                }
//		            } 
//		            else if (ch == 4) {
//		                System.out.println("Bye Bye ");
//		                break;   
//		            } 
//		            else {
//		                System.out.println("Invalid Choice! Please try again.");
//		            }
//
//		        } while (true);
			//prime number
//			 System.out.print("Enter a number: ");
//		        int num = s.nextInt();
//
//		        int sum = 0;
//
//		      
//		        for (int i = 1; i <= num / 2; i++) {
//		            if (num % i == 0) {
//		                sum += i;
//		            }
//		        }
//
//		        // Check if the number is perfect
//		        if (sum == num && num != 0) {
//		            System.out.println(num + " is a Perfect Number.");
//		        } else {
//		            System.out.println(num + " is NOT a Perfect Number.");
//		        }
			//Feature of java8
//			Lambda Expressions – Introduced functional programming with shorter, cleaner code.
//
//			Streams API – Process collections using filter, map, reduce operations in a functional style.
//
//			Default & Static Methods in Interfaces – Interfaces can now have method implementations.
//
//			New Date & Time API (java.time) – Modern and easy-to-use replacement for Date and Calendar.
//
//			Optional Class – Helps avoid NullPointerException by handling missing values safely.

		       

}
}
