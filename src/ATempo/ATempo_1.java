package ATempo;

import java.util.Scanner;

public class ATempo_1 {

	public static void main(String[] args) {
		
			
//Write a program that takes two integers as input and performs all basic arithmetic 
//operations(addition, subtraction, multiplication, division, and modulus) on them.
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			//System.out.print("Enter a number: ");
	        //int number = scanner.nextInt();
	
//1. Print numbers from 1 to 10
			
		/*	for (int i=1; i<=10; i++)
			{
				System.out.println(i);
			}
		*/
			
//2. Print the even numbers from 1 to 20
			
		/*	for (int i=2; i<=20; i+=2)
			{
				System.out.println(i);
			}
		*/
			
//3. Sum all numbers from 1 to 100	
			
		/*	int sum=0;
			for (int i=1; i<=100; i+=1)
			{
				sum+=i;
			}
			System.out.println("Sum is: "+sum);
		
		*/
			
//4. Print the multiplication table for 5
			
		/*	int value;
			for (int i=1; i<=10; i++)
			{
				value=i*5;
				System.out.println("5 x " +i + " ="+value);
				}
		*/
			
//5. Print numbers from 10 down to 1
			
		/*	for (int i=10; i>=1; i--)
			{
				System.out.println(i);
			}
		*/
			
//6. Print all odd numbers between 1 and 20
			
		/*	for (int i=1; i<=20; i+=2)
			{
				System.out.println(i);
			}
		*/
			
//7. Find the factorial of a number (e.g., 5!)			
		/*	int fact=1;
			for (int i=1; i<=5; i++)
			{
				fact*=i;
			}
			System.out.println("Factorial of 5 is: " +fact);
		*/
			
//8. Print the sum of all even numbers between 1 and 50
			
		/*	int sum=0;
			for (int i =2; i<=50; i++)
			{
				if(i%2==0)
				{
				sum+=i;
				}
			}
			System.out.println("sum of even number is: "+sum);
		*/
			
//9. Print the Fibonacci sequence up to the 10th term
			
		/*	int a=0;
			int b=1;
			int value;
			System.out.println(a+" "+b+ " ");
			
			for (int i=3; i<=10; i++)
			{
             value=a+b;
             System.out.println(value+" ");
             a=b;
             b=value;
			 }
		*/
			
//10. Print all numbers divisible by 3 between 1 and 30
			
			
		/*	for (int i=1; i<=30; i++)
			{
				if (i%3 == 0) {
				System.out.println(i);
				}
			}
		*/
			
//11. Print the squares of numbers from 1 to 10	
		/*	int square;
			for(int i=1; i<=10; i++) 
			{
				square=i*i;
				System.out.println("Square of "+i+" = "+square);
			}
		*/	
			
//12. Print all numbers divisible by both 3 and 5 between 1 and 100	
			
		/*	for(int i=1; i<=100; i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println(i);
				}
			}
		*/
		

		}
			
	}

}
