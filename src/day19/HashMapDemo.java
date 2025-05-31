package day19;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		 
		//Declaration
		//HashMap hm = new HashMap();
		//Map mymap = new Map();
		
		HashMap <Integer,String> HM = new HashMap <Integer,String> ();
		
		//Adding Pair in HashMap        //Duplicate IDs - Not Allowed, Duplicate values - Allowed
		HM.put(101, "Suhasi");
		HM.put(102, "Kiya");
		HM.put(103, "Akshay");
		HM.put(104, "Priti");
		HM.put(105, "Suhasi");
		HM.put(102, "Roshan");
		
		System.out.println("HashMap is: "+HM);  //{101=Suhasi, 102=Roshan, 103=Akshay, 104=Priti, 105=Suhasi}
		
		//Size of HashMap
		HM.size();
		System.out.println("Size of HashMap is: "+HM.size());  //5
		
		//Remove the pair
		HM.remove(103);
		System.out.println("After removing the Pair : "+HM); //{101=Suhasi, 102=Roshan, 104=Priti, 105=Suhasi}
		
		//Access value of key
		HM.get(102);
		System.out.println("The value of 102 is: "+HM.get(102));    //Roshan
		
		//Get all keys from HashMap
		HM.keySet();
		System.out.println("All keys are: "+HM.keySet());
		
		//Get all values from HashMap
		HM.values();
		System.out.println("All values are"+HM.values());
		
		//Get all keys along with the values
		HM.entrySet();
		System.out.println("All keys alobng with the values: "+HM.entrySet());
		
		//Reading data from HashMap
		
		for(int k:HM.keySet())
		{
		    System.out.println(k+" "+HM.get(k));	
		}
		
		//Clear data
		HM.clear();
		System.out.println("Is Clear ? "+HM.isEmpty());
		

	}

}
