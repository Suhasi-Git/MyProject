package day7;

import java.util.Arrays;

public class Sorting_String {

	public static void main(String[] args) {
		
		//Sorting or Character Type Array
		
		char s[]= {'P','A','S','D','L','M','T','R'};
		
		System.out.println("Before sorting..." +Arrays.toString(s));
		
		Arrays.sort(s);
		
		System.out.println("After sorting...." +Arrays.toString(s));

		
		//Sorting of String Type Array
		
		String p[]= {"ABC", "PQR", "DEF", "XYZ", "UVW", "MNO"};
		
		System.out.println("Before sorting" +Arrays.toString(p));
		
		Arrays.sort(p);
		
		System.out.println("After Sorting" +Arrays.toString(p));
		
	}

}
