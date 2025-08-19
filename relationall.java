package com.dev;

import java.util.Scanner;

public class relationall {
	public static void main(String[] args)
	{
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Float value a:");
		a= obj.nextInt();
		System.out.println("Enter the Float value b:");
		b= obj.nextInt();
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		obj.close();
	}
}
