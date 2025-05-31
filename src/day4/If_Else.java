package day4;

public class If_Else {

	public static void main(String[] args) {
		
		
		/* instead of writing an expression we can write boolean value
		 in the condition like */
		
		/* if (true)  /if (false)
		  {
		    Statement
		  }		
		  else
		  {
		  Statement
		  }
		 */
		
		
		
		
		//       Syntax-1                 Syntax-2 (if else ladder)
				/*   if (Condition)       if (Condition 1)
				   {                      {
					    Statement             Statement
				   }                      }
				   else                   else if(Condition 2)
				   {                      {
				   statements                 Statement
				   }                      }
				                          else
				                          {
				                              Statement 
				                          }
				     */
		
		//if_else statement - Example 1
		//Checking the person age is eligible for vote or not
		
		int person_age=15;
		
		if (person_age>=18)
		{
			System.out.println("Person is eligible for vote");
		}
		else
		{
			System.out.println("Person is not eligible for vote");
		}
		
		//If the Statement having one line then no need to write {}
		
		//if_else statement - Example 2
		//Checking the num is even or odd
		
		int num=51;
			
		if (num%2==0)
		
			System.out.println("Number is Even");
		
		else
	
			System.out.println("Number is Odd");
		
	
		//if_else statement - Example 2
		//Checking the Number is positive, negative, zero
		
		int Number=-15;
		
		if(Number>0)
		{
			System.out.println("Number is Positive");
		}
		else if (Number<0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is zero");
		}
		
		//if_else statement - Example 3
		//Checking the largest of 3 numbers
		
		int a=7, b=10, c=9;
		
		if (a>b && a>c)
		{
			System.out.println("Number a is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("Number b is Greater");
		}	
		else
		{
			System.out.println("Number c is Greater");
		}
		
	}
	

}
