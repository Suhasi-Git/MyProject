package day10;

public class Car {
	
	String mainnumber;
	String statename;
	int number;
	double milage;
	int speed;
	
	void number()
	{
		
		mainnumber = statename + number;
		System.out.println("The number of car is: "+mainnumber);
	}
	
	void speedcount()
	{
       System.out.println("The milage is: "+milage +" & " +"Speed is: "+speed);
	}

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.statename = "MH";
		car1.number = 4228;
		car1.milage = 222.23;
		car1.speed = 220;
		car1.number();
		car1.speedcount();
		
		
		
				
		

	}

}
