package day7;

import java.util.Scanner;

public class Taking_multiple_inputs_from_keyboards {

	public static void main(String[] args) {
	
	    try (Scanner sc = new Scanner(System.in)) {
	    	
			System.out.println("Enter the first number: ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the second number: ");
			int num2 = sc.nextInt();
			
			System.out.println("The sum is: " +(num1+num2));
			
			
			//Taking two number and subtract
			
			System.out.println("Enter number 1: " );
			int a=sc.nextInt();
			
			System.out.println("Enter number 2: ");
			int b=sc.nextInt();
			
			System.out.println("The Subtraction is: " +(a-b));

			
			//Take two number and multiply
							
			System.out.println("Enter the number 1: ");
			int p=sc.nextInt();
			
			System.out.println("Enter Number 2: ");
			int q=sc.nextInt();
			
			System.out.println("The Multiplication is: " +(p*q));

			
			//Take two number and divide

			System.out.println("Enter 1st Number: ");
			int x=sc.nextInt();
			
			System.out.println("Enter 2nd Number: ");
			int y=sc.nextInt();
			
			System.out.println("If they divide: " +(y/x));
		}
		
		//Taking 2 input from user and add

	}

}
