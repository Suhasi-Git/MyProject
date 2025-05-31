package day3;

public class Increment_Decrement_Operators {

	public static void main(String[] args)
	{
		// Increment Operators ++
		
		//Case 1 
		
		int a=100;
		a++;
		System.out.println(a); //101
		
		//Case 2 - Pre-Increment ++a
		
		int Result=++a;
		System.out.println(Result); //102
		
		//Case 3 - Post Increment a++
		
		int Value=a++;
		System.out.println(Value); //102 
			
		
		
		//Decrement Operators --
		
		//Case 1
		
		int x=100;
		x--;
		System.out.println(x); //99
		
		//Case 2 - Pre-Decrement --x
		
		int amount=--x;
		System.out.println(amount); //98
		
		//Case 3 - Post Decrement x--
		
		int price=x--;
		System.out.println(price); //98
		

	}

}
