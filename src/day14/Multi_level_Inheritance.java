package day14;

class A1 { 
	
	int i1;
	void m1()
	{
		System.out.println(i1);
	}
}

class A2 extends A1 
{
	
	int i2;
	void m2()
	{
		System.out.println(i2);
	}
}

class A3 extends A2
{
	
	int i3;
	void m3()
	{
		System.out.println(i3);
	}
}


public class Multi_level_Inheritance {

	public static void main(String[] args) {
		
		A2 objectA2 = new A2();
		
		objectA2.i2 = 500;
		objectA2.i1 = 600;
		
		objectA2.m2();
		objectA2.m1();
		
		
		A3 objectA3 = new A3();
		
		objectA3.i3 = 700;
		objectA3.i2 = 800;
		objectA3.i1 = 900;
		
		objectA3.m3();
		objectA3.m2();
		objectA3.m1();
		
		
		
	}

}
