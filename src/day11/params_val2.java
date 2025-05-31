package day11;

public class params_val2 {
	
	// no param no return value
	//take param no return value
	//no param return value
	//take param no return value
	
	// no parameters no return value
	void m1() //no parameters
	{
	  System.out.println("Hii Baby"); //no return value
	}
	
	//take parameters no return value
	void m2(int a)  //take parameters
	{
		System.out.println(a);   //no return value
	}
	
	
	//no parameters return value
	int  m3()  //no parameters
	{
		return 5555; //return values (create new object to store new value in main method)
	}
	
	int m4(int a) //take parameters
	{
		return a; //return value (create new object to store new value in main method)
	}
	
	

	public static void main(String[] args) {
		
		params_val2 obj1 = new params_val2();
		
		obj1.m1();
		obj1.m2(1000);
		
		int x = obj1.m3();
		System.out.println(x);
		
		int y = obj1.m4(70000);
		System.out.println(y);
		

	}

}
