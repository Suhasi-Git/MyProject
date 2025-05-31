package day19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Declaration
		//HashSet <String> myset = new HashSet <String> ();    //Parent class Object
	                                                                   //OR
		//Set mset = new Set();                                //Child class Object
		HashSet myset = new HashSet();                         //Heterogeneous data
		
		//Adding elements in Hashset
		myset.add(100);
		myset.add(10.5);
		myset.add("Suhasi");
		myset.add('A');
		myset.add(null);
		myset.add(null);
		myset.add(100);
		myset.add(true);
		
		System.out.println("My hashset data is: "+myset);
		
		//Length of HashSet
		myset.size();
		System.out.println(myset.size());
		
		//Removing specific elements             //pass value not index
		myset.remove(null);
		System.out.println("After removing hashset data is: "+myset);
		
		//Inserting elements - Not Possible (Index is not available/present)
		
		//Access Specific Element - Not Possible (Index is not available/present)
		
		//Convert HashSet ---> ArrayList
		ArrayList AL = new ArrayList(myset);
		System.out.println(AL);
		
		System.out.println(AL.get(1));
		
		//Reading all elements using looping statements
		for (Object X: myset)
		{
			System.out.println(X);
		}
		
		//Clearing all elements from HashSet
		myset.clear();
		System.out.println(myset);
		
		//Checking HashSet is empty or not
		myset.isEmpty();
		System.out.println(myset.isEmpty());
		
		
				
		
		
		
		
		
		

	}

}
