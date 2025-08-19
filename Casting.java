package com.dev;

public class Casting {
		public static void main(String[] args)
		{
			int myInt=9;
			double myDouble=myInt;
			System.out.println("Value of myInt:"+myInt);
			System.out.println("Value of myDouble:"+myDouble); //automatic or widening casting
			
			double myDouble1=9.98;
			int myInt1=(int) myDouble1;
			System.out.println("Value of myDouble1:"+myDouble1);
			System.out.println("Value of myInt1:"+myInt1); //narrow casting
			
		}
}
