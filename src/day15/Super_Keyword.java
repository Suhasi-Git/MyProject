package day15;

public class Super_Keyword {
	
	String color = "White";

}

class Dog extends Super_Keyword 
{
    String color = "black";

    
    void displaycolor() 
    {
        System.out.println(super.color);
    }


	public static void main(String[] args) {
		Dog T2 = new Dog(); 
        T2.displaycolor();  
        
	}

}
