package day5;

public class Break_Statement {

	public static void main(String[] args) {
		
		//Break Statement
		
		//break; continue; - used to break/stop for print
		
		//print 1 to 10 number
		
		int i;
		
		for (i=1; i<=10; i++)
		{
			if (i>5)
			{
				break;   //stop for print because if condition is applied
			}
		System.out.println(i);
		}

		
        int k;
		
		for (k=1; k<=10; k++)
		{
			if (k==5)
			{
				continue;   //stop for print because if condition is applied
			}
		System.out.println(k);
		}
		
		
		int j;
		
		for (j=1; j<=10; j++)
		{
			if (j==3 || j==7 || j==9)
			{
				continue;
			}
			System.out.println(j);
		}
		
	}

}
