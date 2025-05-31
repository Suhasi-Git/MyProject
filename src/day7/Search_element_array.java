package day7;

public class Search_element_array {

	public static void main(String[] args) {
		
		//Search an element in an array (linear search)
		
		int a[]= {200,300,100,500,600};
		int num = 00;
		boolean status=false;
		
		for(int i=0; i<a.length; i++)
		{
		    if(a[i]==num)
		    {
		     System.out.println("Element found");
		     status=true;
		     break;
		    }
		}
		if (status==false)
		{
        System.out.println("Element not found");
		}
	} 

}
