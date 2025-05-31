package day15;

class Bank
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m1(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	void m1(double a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class overloading {

	public static void main(String[] args) {
		
		Bank bk = new Bank();
		bk.m1(100);
		bk.m1(100,200);
		bk.m1(11.11, 100);
		
		
	}

}
