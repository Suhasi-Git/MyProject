package day11;

public class Account {

	int a=10;
	int b=20;
	
	void sum()                    //1 no parameters
	{
		System.out.println(a+b);
	}
	
	//   int sum()              //return type-not considerable but method is same as sum() do not hold any parameters
	//   {
	//   return(a+b);
	//   }
	
	void sum(int x, int y)       //2
	{
		System.out.println(x+y);
	}
	void sum(double p, int q)    //3 data type of parameters is different
	{
		System.out.println(p+q);
	}
	void sum(int s, double z)    //4 order of parameter is different
	{
		System.out.println(s+z);
	}
	
	
	public static void main(String[] args) {
		
	 
		Account acc = new Account();
		
		acc.sum();           //1
		acc.sum(2, 3);       //2
		acc.sum(2.3, 3);     //3
		acc.sum(3,2.3);      //4
		
		
		
	}

}
