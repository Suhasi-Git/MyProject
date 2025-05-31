package day14;

class C1
{
	int a;
	void M1()
	{
		System.out.println(a);
	}
	
}

class C2 extends C1
{
	int x;
	void M2()
	{
		System.out.println(x);
	}
	
}

class C3 extends C1
{
	int y;
	void M3()
	{
		System.out.println(y);
	}
	
}

class C4 extends C1
{
	int z;
	void M4()
	{
		System.out.println(z);
	}
}


public class Hierarchy_Inheritance {

	public static void main(String[] args) {
		
		C2 obj2 = new C2();
		
		obj2.a = 1000;
		obj2.x = 1001;
		
		obj2.M2();
		obj2.M1();
		
		
		C3 obj3 = new C3();
		
		obj3.a = 2000;
		obj3.y = 2002;
		
		obj3.M3();
		obj3.M1();
		
		C4 obj4 = new C4();
		
		obj4.a = 3000;
		obj4.z = 3003;
		
		obj4.M4();
		obj4.M1();
	}

}
