package day15;


 class A //if I put Final in front of class A then cannot access the child class
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
}

class B extends A //get error 
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
}

public class final_keyword {

	public static void main(String[] args) {
		

	}

}
