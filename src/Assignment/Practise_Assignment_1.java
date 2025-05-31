package Assignment;

public class Practise_Assignment_1 {

/*Write a java program to input a cost of a pen 
 *and calculate 70 pens cost with some discount. if total pen 
 * cost greater than 1000 then we calculate 20% discount otherwise 10%.
 */
	
	public static void main(String[] args) {
		
		int i=5; //i=cost of 1 pen
		int j=i*70; //j=cost of 70 pens
		int Dis;
		
		{
			System.out.println("Cost of 70 pens: " +j);
		}
		if (j>=1000) 
		{
			Dis=j*20/100;
			System.out.println("20% discount " +(j-Dis));
		}
		else
		{
			Dis=j*10/100;
			System.out.println("10% Discount " +(j-Dis));
		}

/*Write a java program to take Basic salary of employee from user 
 * and calculate gross salary with given condition, if 
 * Basic salary >= 10000 then we calculate 40% da and 30% ta 
 * of Basic salary otherwise 30% da and 20% ta of Basic salary.*/
		 
		int p=8000; //Basic Salary
		int DA;
		int TA;
		
		if (i>=10000)
		{
			DA=p*40/100;
			TA=p*30/100;
			System.out.println("Gross Salary is: " +(DA+TA+p));
		}
		else 
		{
			DA=p*30/100;
			TA=p*20/100;
			System.out.println("Gross Salary is: " +(DA+TA+p));
		}
		
		//Write a java program to Take values of length and breadth 
		//of a rectangle from user and check if it is square or not.
		
		
		int l = 20; //l=length
		int b = 50; //b=breadth
		
		if (l==b)
		{
			System.out.println("It is a square");
		}
		else
		{
			System.out.println("It is a rectangle");
		}
		
		/*Write a java program to A shop will give discount of 10% if the cost of 
		purchased quantity is more than 2000. Ask user for quantity, Suppose, 
		one unit will cost 100. Judge and print total cost for user. */
		
		int u1 = 100;
		int q = 22;
		int tq = q*u1;
		int cost;
		
		if (tq>2000)
		{
			cost=tq - tq*20/100;
			System.out.println("Total cost of user " +cost);
		}
		else
		{
			System.out.println("No Discount");
		}
			
		
			int time=8;
			
			if (time>=2 && time<=3)
			{
				System.out.println("High Efficient");
			}
			else if (time>3 && time<=4)
			{
				System.out.println("Improve Speed");
			}
			else if (time>4 && time<=5)
			{
				System.out.println("Training to improve speed");
			}
			else 
			{
				
				System.out.println("worker has to leave the company");
			}

			
			
			
		
		
	}
	
	

}
