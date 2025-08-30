package com.dev;

import java.util.Scanner;

public class Secoundbignum {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("First num:");
		int a=s.nextInt();
		System.out.print("Secound num:");
		int b=s.nextInt();
		System.out.print("3rd num:");
		int c=s.nextInt();
		int la=0;
		int se=0;
		if(a>b && a>c)
		{
			la=a;
			if(b>c)
			{
				
				se=b;
			}
			else {
				
				se=c;
			}
		}
		
		else if(b>a && b>c)
		{
			la=b;
			if(a>c)
			{
				
				se=a;
			}
			else {
				
				se=c;
			}
		}

		else  {
			la=c;
			if(a>b)
			{
				
				se=a;
			}
			else {
				
				se=b;
			}
			
		}
		System.out.println(se);
	}
}
