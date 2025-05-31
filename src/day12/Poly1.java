package day12;

public class Poly1 {

	int a = 10;
	int b = 20;
	
	void m1()
	{
		System.out.println(a+b);
	}
	
	void m1(int x, int y)
	{
		System.out.println(x+y);
	}
	
	void m1(String s, int x)
	{
		a=x;
		System.out.println(s+x);
	}
	
	void m1(double d, int i)
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Poly1 o1 = new Poly1();
		
		o1.m1();
		o1.m1(200, 300);
		o1.m1("Suhasi", 50);
		o1.m1(111.11, 60);

	}

}
