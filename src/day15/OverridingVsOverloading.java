package day15;

class Home 
{
	void bed(int i)
	{
		System.out.println(i);
	}
	void bed (int i, int j)
	{
		System.out.println(i);
		System.out.println(j);
	}	
}

class Banglow extends Home
{
	void bed (int i)       //overriding
	{
		System.out.println(i+1);
	}
	void table (int i, double j) //overloading
	{
		System.out.println(i);
		System.out.println(j);
	}
}


public class OverridingVsOverloading {

	public static void main(String[] args) {
		
		Banglow Bw = new Banglow();
		Bw.bed(100);
		Bw.bed(50000, 200);
		Bw.table(3000, 10.3);
		
		
	}

}
