package com.dev;

public class Factorial {
	public static void main(String[] args) {
		int i=1;
		int fact=1;
		int num=4;
		while(i<=num) {
			
			fact*=i;
			i++;
		}
		System.out.println(fact);
	}
}
