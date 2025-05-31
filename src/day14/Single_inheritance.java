package day14;

//Single Inheritance Class A is Parent Class and Class B is Child Class

class A {
	
	int a;
	void display()
	{
		System.out.println(a);
	}
	
}

class B extends A 
{
	
	int b;
	void print()
	{
		System.out.println(b);
	}

}


public class Single_inheritance {

	public static void main(String[] args) {
		
		B bobj = new B();
		
		bobj.a = 200;
		bobj.b = 300;
		
		bobj.display();
		bobj.print();
		
	}

}
