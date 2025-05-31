package day3;

public class OperatorsDemo {

	public static void main(String[] args) 
	{
		
		// 1) Arithmetic Operators + - * / %
		
		int a=10, b=20;
		
		int result = a+b;
		
		System.out.println("The value is: "+result);
	
		System.out.println("The value is: "+(a+b));
		System.out.println("The value is: "+(a-b));
		System.out.println("The value is: "+(a*b));
		System.out.println("The value is: "+(a/b));
		System.out.println("The value is: "+(a%b));
		
		// 2) Relational/Comparison Operators > >= < <= != ==
		         //It returns Boolean Value
		
		
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		a=20;
		
		System.out.println(a!=b);
		System.out.println(a==b);
		System.out.println(a>b);
		
		// 3) Logical Operators && || !
		     // It Returns Boolean Value
		
		boolean x = true;
		boolean y = false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		boolean b1=10>20;
		System.out.println(b1); //False
		
		boolean b2=20>10;
		System.out.println(b2); //True
		
		System.out.println(b1 && b2); //False
		System.out.println(b1 || b2); //True
		
		System.out.println((10<20) && (20>10)); //True
		System.out.println((10>20) || (20<10)); //false
		

	}

}
