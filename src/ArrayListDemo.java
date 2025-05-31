import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaration
		//ArrayList mylist = new ArrayList();       //Heterogeneous data with ArrayList class  
		//List mlist = new ArrayList();             //List class
		//ArrayList<int>ml = new ArrayList<int>();  //now allow primitive type of data
		
		//Heterogeneous data
		ArrayList mylist = new ArrayList();
		
		//Homogeneous data
		//ArrayList<Integer> arrlist = new ArrayList<Integer>();  //allow only Integer type of data
				
		
		//Adding data into the ArrayList
		mylist.add(10);	
		mylist.add(10.5);
		mylist.add("Suhasi");
		mylist.add('A');
		mylist.add(100);
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		mylist.add(100);
		
		//Printing data from ArrayList
		System.out.println("Printing data from arraylist: "+mylist);     //9
		
		//Size of ArrayList
		System.out.println("The size of arraylist is: "+mylist.size());	
		
		//Remove specific/some element from ArrayList
		mylist.remove(4);
		System.out.println("After removing duplicate data from arraylist: "+mylist);
		
		mylist.remove(6);
		System.out.println("After removing duplicate data from arraylist: "+mylist); 
		
		//Insert element in the ArrayList
		mylist.add(3,"java");
		System.out.println("After inserting data in arraylist: "+mylist); 
		
		//Modify element in ArrayList (Modify/Replace/Change)
		mylist.set(3, "python");
		System.out.println("After modifying data in arraylist: "+mylist);
		
		//Access Specific element from ArrayList
		mylist.get(2);
		System.out.println("Accessing specific data in arraylist: "+mylist.get(2));  //Suhasi
		
		
		//Reading all elements from ArrayList
		
		//1) Using for loop - Normal
		for(int i=0; i<mylist.size(); i++)
		{
			System.out.println(mylist.get(i));
		}
		
		//2) Using for loop - Object
		for(Object x: mylist)
		{
			System.out.println(x);
		}
		
		//3) Using Iterator
		Iterator it = mylist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Checking ArrayList is empty or not
		mylist.isEmpty();
		System.out.println("Is arraylist empty? "+mylist.isEmpty());     //false
		
		//Remove multiple data from ArrayList
		ArrayList mylist2 = new ArrayList();
		
		mylist2.add(true);
		mylist2.add(null);
		mylist2.add(10.5);
		
		mylist.removeAll(mylist2);
		
		System.out.println("After removing multiple elements: "+mylist);
		
		//Remove all the elements from the ArrayList
		mylist.clear();
		
		System.out.println("Print Array list: "+mylist);
		System.out.println("Is arraylist empty? "+mylist.isEmpty());     //true
		
		
		
		
		
		
		
	}

}
