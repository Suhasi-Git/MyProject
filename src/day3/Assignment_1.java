package day3;

public class Assignment_1 {

	public static void main(String[] args) {
		
		//Swapping of two numbers

		//Method 1:
		
		int a=10;
		int b=20;
	
		a=a+b;
		b=a-b;
		System.out.println("Value of b: "+b);
		a=a-b;
		System.out.println("Value of a: "+a);

		//Method 2:
		
		int x=10;
		int y=20;
		int z;
		
		z=x;
		x=y;
		y=z;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		

	}

}
