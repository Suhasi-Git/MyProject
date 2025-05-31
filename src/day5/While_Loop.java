package day5;

public class While_Loop {

	public static void main(String[] args) {
	
	/*while loop - Syntax: initialization (should be number)
		                   while(condition) (how many times we are going to repeat the no.)
		                   {
		                   statements;
		                   decrement or increment;
		                   }
		*/
		
	//Print a number from 1 to 10
		
		int i=1;       //initialization;
		while(i<=10)   //while (condition)
		{
			System.out.println(i);  //statement;
			i++;                    //dec/inc;
		}
		
		  
		//print Hello message 10 time
		
		int j = 1;
		
		while(j<=10)
		{
			System.out.println("Hello");
			j++;
		}
		
		//Print even numbers between 1 to 10
		
		int k=1;
		while(k<=10)
		{
			if(k%2==0) //filter
			{
			System.out.println(k);
			}
			k++;  //k+2=k
		}
		
		//Print every number is odd or even upto 10
		
		int m=1;
		while(m<=10)
		{
			if(m%2==0) 
			{
			System.out.println(m + " even");
			}
			else
			{
			System.out.println(+m + " odd");
			}
			m++;
		}
		
		
		//Print a number from 1 to 10 in descending order
		
		int q=10;
		
		while(q>=1) 
		{
			System.out.println(q);
		    q--; //q-1=q
		}    
	}
		

}
