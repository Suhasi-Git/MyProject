package day5;

public class For_Loop {

	public static void main(String[] args) {
	
		
		/*for loop - Syntax:     for (initialization; condition; inc/dec)       
         	                     {
                                   statements;
                                  }		   */                
        //print number 1 to 10
        
		int i;
		
		for (i=1; i<=10; i++)
		{
			System.out.println(i);
		}

		
		//print even number between 1 to 10
		
		int j;
		
		for (j=0; j<=10; j+=2)
		{
			System.out.println(j);
		}
		
		//print even and odd number between 1 to 10
		
		int k;
		for (k=10; k>0; k--)
		{
			if (k%2==0)
			{
			System.out.println(k + " Even number");
			}
			else
			{
			System.out.println(k + " Odd Number");
			}
		}
		
		}

}
