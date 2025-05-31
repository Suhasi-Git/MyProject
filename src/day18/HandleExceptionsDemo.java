package day18;

import java.util.Scanner;

public class HandleExceptionsDemo {

	public static void main(String[] args) {
		
		
		System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num: ");
		int num = sc.nextInt();
		
		try
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid data...");
		}
		System.out.println("Program is completed..");
		System.out.println("Program is exited...");

	}

}
