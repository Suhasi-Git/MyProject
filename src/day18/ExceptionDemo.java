package day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");
		
		Scanner sc = new Scanner(System.in);
		
		
//1]		//Arithmetic Exception
		System.out.println("Enter a number: ");  //num = 0
		int num = sc.nextInt();
		
		System.out.println(100/num);             //java.lang.ArithmeticException
		
		
		
//2]	//Array Index Out Of Bounds Exception
		int a[] = new int[5];
		
		System.out.println("Enter the position (0-4): ");  //pos = 5
		int pos = sc.nextInt();
		
		System.out.println("Enter the value: ");          //java.lang.ArrayIndexOutOfBoundsException
		int value = sc.nextInt();
		
		a[pos] = value;
		
		
//3]	//Number Format Exception
		System.out.println("Enter the string value: ");
		String s = sc.nextLine();                   // welcome
		
		int number = Integer.parseInt(s);           //java.lang.NumberFormatException
		System.out.println(number);
		
		
//4]	//Null Pointer Exception
		String a1 = null;                            //null
		System.out.println(a1.length());             //java.lang.NullPointerException
		
		
		System.out.println("Program is completed...");

		System.out.println("Program is exited...");
		
	}

}
