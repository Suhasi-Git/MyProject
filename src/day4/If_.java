package day4;

public class If_ {

	public static void main(String[] args) {
		
		
		//Syntax
		/*   if (Condition)
		   {
			    Statement
		   }     */
		
		//if statement - Example 1
		//Checking the person age is eligible for vote or not
		
		int person_age = 19;
		
		if (person_age>=18)
				{
			System.out.println("Eligible for vote");
				}

		
		//if Statement - Example 2
		//Checking the Number is positive or negative
		
		int number = 100;
		
		if (number>0)
		{
			System.out.println("The number is positive");
		}
		
		
		//if Statement - Example 3
		//Checking the amount is even or odd
		
		int amount = 21;
		
		if (amount%2 == 0)
			
		{
			System.out.println("The number is Even");
		}
		
		
	}

}
