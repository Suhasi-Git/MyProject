package day12;

public class constructorOverloading {

	int k=10;
	int p=20;
	int s=30;
	
	constructorOverloading()
	{
		int a=k;
		int b=p;
		int c=s;
		System.out.println(a+b+c);
		
	}
	constructorOverloading(int x, int y, int z)
	{
		int k = x;
		int p = y;
		int s = z;
		
		System.out.println(k+p+s);
	}
	
	
	
	
	public static void main(String[] args) {
		
		//constructorOverloading CO = new constructorOverloading();
		//constructorOverloading CO = new constructorOverloading(20, 30, 40);
	}

}
