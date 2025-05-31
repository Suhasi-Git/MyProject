package day16;

interface liquid_colour
{
	void Green();                                     //Abstract Method
	
	default void White()                              //Default Method
	{
		System.out.println("This is White Color...");
	}
	
	static void Black()                               //Static Method
	{
		System.out.println("This is Black Color...");
	}

}

public class colour implements liquid_colour
{
	public void Green()                             //Abstract Method
	{
		System.out.println("This is Green Colour...");
	}
	
	void m1()
	{
		System.out.println("Testing 1");
	}
	
	void m2()
	{
		System.out.println("Tsting 2");
	}

	
	public static void main(String[] args) {
		
		colour c = new colour();
		c.Green();
		c.m1();
		c.m2();
		c.White();
		liquid_colour.Black();
		

	}

}
