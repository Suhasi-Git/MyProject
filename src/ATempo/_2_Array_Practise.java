package ATempo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _2_Array_Practise {

	public static void main(String[] args) {
		
		
		//Find sum of an Array
		
	/*	int a[]= {1,2,3,4,5};
		int sum=0;
		
		for (int i=0; i<=a.length; i++)
		{
			sum+=i;
			
		}
		System.out.println("Sum is: " +sum);
	*/
		
		//Print even odd number from array
		
	/*	int a[]= {1,2,3,4,5,6,7};
		int evencount=0;
		int oddcount=0;
		
		for (int i=1; i<=a.length; i++)
		{
			if (i%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("Even number: "+evencount);
		System.out.println("Odd Number: "+oddcount);
	*/
		
		//Searching element in an array
	/*	
		int a[]= {10,20,30,40,10,50,70,10,20,30,10};
		int search_element = 10;
		boolean status=false;
		int count=0;
		
		for(int i=1; i<a.length; i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element found");
				status=true;
				break;
			}	
		
		}
		if(status==false)
		{
		System.out.println("Element Not Found");
		}
		
		for(int j=0;j<a.length;j++)
		{	
		if (a[j]==search_element)
		  {
			count++;
		  }
		}
		System.out.println("Count is: "+count);
	*/	
		
		//to print array as it is
		
	/*	int a[]	= {10,200,130,540,50,11};
		
		System.out.println(Arrays.toString(a));
		
		//to sort data from array
		
		System.out.println("Before sorting: "+Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println("After Sorting: " +Arrays.toString(a));
	*/	
		
		//reverse an array
		
	/*	int a[]= {10,20,30,40,50};
		
		System.out.println("Before reverse: "+Arrays.toString(a));
		
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.println((a[i]));	
		}
	*/
		
		//Find missing number in an array
		
		int a[]= {2,3,4,6,7};
        int sum1=0;
		int sum2=0;
		int missingnum=0;
        
		Arrays.sort(a);
		
		System.out.println("After Sorting: "+Arrays.toString(a));
		
		System.out.println(a.length);
		
		for (int i=0; i<a.length; i++)
		{
			sum1+=a[i];
		}
		System.out.println("Original sum is: "+sum1);
	
		for (int j=2; j<=a.length+2; j++)   
		{
		   sum2=sum2+j;
		}
		System.out.println("Next sum is: "+sum2);
		
		missingnum=sum2-sum1;
		
		System.out.println("Missing number is: "+missingnum);
		
	
		
		
		
		
		
	}

}
