package day16;

interface Shape
{
	int length = 100;    //final & static variable
	int width = 200;     //final & static variable
	
	void circle();       //abstract method
	
	default void square()
	{
		System.out.println("This is square...(default)");       //default method
	}
	
	static void rectangle()
	{
		System.out.println("This is rectangle...(static)");   //static method
	}

}

public class Interface_Demo implements Shape
{
	
	public void circle() 
	{
		System.out.println("This is circle...(abstract)");    //abstract method
	}
	
	void triangle ()
	{
		System.out.println("This is triangle...(class method)");
	}

	public static void main(String[] args) {
		
		Interface_Demo Iobj = new Interface_Demo();
		Iobj.circle();       //interface abstract
		Iobj.square();       //interface default
	    Iobj.triangle();	 //class method
		Shape.rectangle();   //Static method can directly access from interface
		
	}

}
