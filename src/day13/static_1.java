package day13;

public class static_1 {
	
    static int x = 50;    //static variable
	int y = 60;           //non static variable
	
	static void m1()      //static method
	{
		System.out.println("This is Ststic method");
	}
	
	void m2()             //non static method
	{
		System.out.println("This is non static method");
	}

	public static void main(String[] args) {
		System.out.println(x);   //no need to create object 
		m1();                    //direct access the method without creating object
		
		//need to create object for accessing the m2 method
		static_1 sc = new static_1();
		sc.m2();                 //now we can able to access the m2 method after creating the object
		
		
		

	}

}
