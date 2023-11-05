package com;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
	{
		//upcasting
		bank b= new bankimpl(5000.0);


		Scanner sc=new Scanner(System.in);

		while(true)
		{
			System.out.println("enter the choice:");
			System.out.println("1.deposit\n2.withdraw \n3.checkbalance");
			int choice= sc.nextInt();

			//menu driven program
			switch(choice)
			{
			case 1: System.out.println("enter the amount to be deposited");
			int amt=sc.nextInt();
			b.deposit(amt);
			break;

			case 2:System.out.println("enter the amout to be  withdrawn"); 
			int amt1=sc.nextInt();
			b.withdraw(amt1);
			break;

			case 3: System.out.println("balance is:"+b.checkbalance());


			case 4:System.out.println("thank you");
			System.exit(0);

			
			default:
				try
				{
					throw new INvalidChoiceException("INVALID CHOICE");
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
				
			}



		}




	}



}

