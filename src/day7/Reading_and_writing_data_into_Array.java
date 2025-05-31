package day7;

import java.util.Arrays;
import java.util.Scanner;

public class Reading_and_writing_data_into_Array {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) { 
			
			int a[]= new int [6];
			
			for(int i=0; i<a.length; i++)
			{
			System.out.println("Enter the value: ");
			a[i]=sc.nextInt();
			}
			System.out.println("Printing an array elements.....");
			System.out.println(Arrays.toString(a));
		}
		

	}

}
