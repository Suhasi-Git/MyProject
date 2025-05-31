package day2;

public class Variable_Demo {

	public static void main(String[] args) 
	{
		//int a;  //declaration
		//a=100;  //assignment
		
		/*int b=100; //declaration+assignment
		System.out.println(b);

		b=300; 
		System.out.println(b);*/
		
		//Approach 1 - if variables belongs to different data type
		/*
		int a =100;
		System.out.println(a);
		
		int b=200;
	    System.out.println(b);	
		
		int c=300;
		System.out.println(c);*/
		
		
		//Approach 2 - if all variables belongs to same data types
		/*
		int x,y,z;
		x=500;
		y=600;
		z=700;*/
		
		
		//Approach 3 - if all variables belongs to same data types
		
		int p=800, q=900, r=1000;  
		
		System.out.println("p = 800");
		System.out.println("q = 900");
		System.out.println("r = 1000");
		
		System.out.println("Value of p:"+p);
		System.out.println("Value of q:"+q);
		System.out.println("Value of r:"+r);
		
		System.out.println(p+" "+q+" "+r); //800 900 1000
		
	}

}
