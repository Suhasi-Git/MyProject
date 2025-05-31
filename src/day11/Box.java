package day11;

public class Box {
	
	double weight;
	double height; 
	double depth;
	
	Box()                 //1 Constructor becuase method name = class name
	{
		weight=0;
		height=0;
		depth=0;
	}
	
	Box(double w, double h, double d)  //2 Constructor becuase method name = class name
	{
		weight=w;
		height=h;
		depth=d;
	}
	
	Box(double len)        //3 Constructor becuase method name = class name
	{
		weight=height=depth=len;
	}
	
	double volume()       //4
	{
		return (weight*height*depth);
	}
	

	public static void main(String[] args) {
		
		
		//Box b = new Box();                   //1
		//Box b = new Box (11.2, 11.3, 11.4);  //2
		Box b = new Box(22.1);                 //3
		System.out.println(b.volume());        //4

	}

}
