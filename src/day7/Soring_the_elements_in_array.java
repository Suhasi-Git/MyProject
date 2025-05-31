package day7;

import java.util.Arrays;

public class Soring_the_elements_in_array {

	public static void main(String[] args) {
		
		int a[]= {10,20,40,40,40,30,60,50};
		
		System.out.println("Before Storting....");
		System.out.println(Arrays.toString(a));  //[10, 20, 40, 30, 60, 50]
		
		Arrays.sort(a);
		
		System.out.println("After Sorting....");
		System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50, 60]

	}

}
