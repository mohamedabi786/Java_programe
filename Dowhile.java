package com.dev;

import java.util.Scanner;

public class Dowhile {
	public static void main(String[] args)
	{
		Scanner n=new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("\n MENU");
			System.out.println("1.hello");
			System.out.println("2.date");
			System.out.println("3.exit");
			System.out.println("Enter your choice:");
			choice=n.nextInt();
			if(choice==1)
			{
				System.out.println("hello");
			}
			else if(choice==2)
			{
				System.out.println("date"+java.time.LocalDateTime.now());
			}
			else if(choice==3)
			{
				System.out.println("You want Exit:");
				char con=n.next().charAt(0);
				if(con =='y' || con =='Y')
				{
					System.out.println("bye");
					break;
				}
				else {
					System.out.println("Continue..");
				}
				
			}
		}while(true);
		n.close();
	}
}
