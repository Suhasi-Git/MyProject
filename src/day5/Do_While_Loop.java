package day5;

public class Do_While_Loop {

	public static void main(String[] args) {
		

/*do while loop - Syntax: initialization (should be number)
              do
               	{
                  statements;
                  decrement or increment;
                 }		                   
              while(condition) (how many times we are going to repeat the no.)
                   */

		int i=1;   //Initialization
		do {
			System.out.println(i); //Statement to be printed
	        i++;                   //increment or decrement   
		}
		while(i<=5);  //condition
		
				
		
		int p=10;
		do
		{
			System.out.println(p);
			p--;
		}
		while(p>=5);
	}
	
}	