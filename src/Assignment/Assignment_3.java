package Assignment;

public class Assignment_3 {

	public static void main(String[] args) {
		
		//reverse number
		
		int i= 1234;
		
		for (i=4; i>=1; i--)
		{
			System.out.println(i);
		}
		
		
		System.out.println("    ");
		//print reverse number after compare number
		
		int k=121;
		
		for (k=1; k<=2; k++)
		{
			
			System.out.print(k);
		}
		
		
		//print numbers from 1 to 90
		
		int num;
				
		for (num=1; num<=90; num++)
		{
			System.out.println(num + " ");		
		}
	 
	//count number of digits
		
		int numbers=423424111;
		int count=0;
		
		while(numbers!=0)
		{
			numbers/=10;
			count++;
		}
		System.out.println("Number of digits: " +count);
		
		
		
	}

}
