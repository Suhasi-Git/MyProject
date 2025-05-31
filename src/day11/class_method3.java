package day11;

public class class_method3 {

	void met1()
	{
		System.out.println("Hello");
	}
	
	String met2(String s)
	{
		return s;
	}
	
	void met3(int a)
	{
		System.out.println(a);
	}
	
	int met4()
	{
		return 7000;
	}
	
	public static void main(String[] args) {
	
		class_method3 cm = new class_method3();
		
		cm.met1();
		
		String s =cm.met2("Baby");
		System.out.println(s);
		
		cm.met3(5000);
		
		int i = cm.met4();
		System.out.println(i);
		
	}

}
