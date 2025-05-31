package Assignment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_Assignment {

	public static void main(String[] args) {


		String a = "you Are#Suhasi";
		
		//Upper Case
		System.out.println(a.toUpperCase());
		
		//Lower Case
		System.out.println(a.toLowerCase());
		
		//Capitalize the first letter
		System.out.println(a.replace("y","Y"));
		
		//Length of String
		System.out.println(a.length());
		
		//Check if string contains substring
		System.out.println(a.contains("you"));
		
		//Replace a character in a string
		System.out.println(a.replace("you", "we"));
		
		//Check if string start or end with substring
		System.out.println(a.startsWith("you"));
		System.out.println(a.endsWith("Suhasi"));
		
		//Split a String
		String [] s=a.split("#");
		//System.out.println(a[1]);
		
		
		
	}

}
