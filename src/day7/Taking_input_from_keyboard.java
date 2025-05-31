package day7;

import java.util.Scanner;

public class Taking_input_from_keyboard {

	public static void main(String[] args) {
		
		//int num=20; ---> Hard Coded Value

		try (Scanner sc = new Scanner (System.in))  
		{
			System.out.println("Enter a number: ");
			
			int a = sc.nextInt();
			
			System.out.println("The number is: " +a);
			
			//print decimal value
			
			System.out.println("Enter the decimal value: ");
			
			double b = sc.nextDouble();
			
			System.out.println("The value is: " +b);
			
			//print the string value
			
			System.out.println("Enter the string value: ");
			
			String c = sc.next();
			
			System.out.println("The entered string is: " +c);
		}
		
		
		

		
	}

}
