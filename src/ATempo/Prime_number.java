package ATempo;

import java.util.Scanner;

public class Prime_number {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		
		
		if (num%num==0)
		{
			System.out.println("This is Prime number");
		}
		else
		{
			System.out.println("This number is not a number");
		}
		
		
		
		
		
	}

}
