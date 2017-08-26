package com.amazon.java.branching;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Check for a Prime Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int temp;
		boolean check = true;

		for(int i=2; i<=number/2; i++)
		{
			temp = number%i;
			if(temp==0)

			{
				check = false;

				break;
			}
		}

		if(check)

			System.out.println("It is a prime number");

		else
			System.out.println("it is not a prime number");
		sc.close();
	}

}


