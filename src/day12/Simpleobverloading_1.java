package day12;

public class Simpleobverloading_1 {
	
	int s1 = 50;
	int s2 = 40;
	int T;
	
	void v1()   //simple add
	{
		System.out.println("Sum is: "+(s1+s2));
	}

	void v1(int p, int q)
	{
		T=p-q;
		System.out.println(T);
	}
	
	void v1(int p)
	{
	s1=p;
	System.out.println(s1);
	}
	
	Simpleobverloading_1()
	{
		s1=s2=50;
		System.out.println("The value of s1 is: "+s1);
	}
	
	public static void main(String[] args) {
		Simpleobverloading_1 SO = new Simpleobverloading_1();
		SO.v1();
		SO.v1(20, 10);
		SO.v1(60);

	}

}
