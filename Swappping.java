package com.dev;

import java.util.Scanner;

public class Swappping {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter The x number:");
		int x=s.nextInt();
		System.out.print("Enter The y number:");
		int y=s.nextInt();
		System.out.println("Before swap x="+x+"\n"+""+"Before swap y="+y);
		x=x+y;
		y=x-y;
		x=x-y; 
		System.out.println("After swap x="+x+ " " +"After swap y="+y);
		
		
	}
}
