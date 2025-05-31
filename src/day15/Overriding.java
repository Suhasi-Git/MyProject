package day15;

class Pencil 
{
	void SBI(int a)
	{
		System.out.println(a);
	}
	
	void BOI(String s)
	{
		System.out.println(s);
	}
}

class Ereser extends Pencil
{
	void SBI(int a)                //overriding
	{
		System.out.println(a*a);
	}
	void RBI(double d)
	{
		System.out.println(d+d);
	}
}



public class Overriding {

	public static void main(String[] args) {
		
		//Pencil Pl = new Pencil();
		//Pl.SBI(5);
		//Pl.BOI("yes");
		
		Ereser Er = new Ereser();
		Er.BOI("Overriding");
		Er.SBI(5);
		Er.RBI(10.5);
				

		
	}

}
