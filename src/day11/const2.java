package day11;

public class const2 {

	String s;
	int i;
	char c;
	
	const2(String a, int b, char d)
	{
		s=a;
		i=b;
		c=d;	
	}
	
	void m()
	{
		System.out.println("a "+"b "+"d ");
	}
	
	public static void main(String[] args) {
		const2 co = new const2("Suhasi", 100, 'A' );
		co.m();

	}

}
