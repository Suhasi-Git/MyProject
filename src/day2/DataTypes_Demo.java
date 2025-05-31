package day2;

public class DataTypes_Demo {

	public static void main(String[] args) 
	{
		// Numeric data  type
		
		int a=100, b=200;
		
		System.out.println("The value of a is :"+a);
		System.out.println("The value of b is :"+a);
		System.out.println("The sum of a and b is :"+(a+b));

		byte by=127;
		System.out.println(by);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=11111333311441111L; //Literal is needed - L	
		System.out.println(l);
		
		
		//Decimal Data type - Float, Double
		
		float item=19.8F;         //Literal is needed - F
		System.out.println(item);
			
		double item2=1234.999999;
		System.out.println(item2);
		
		char item3='s';
		System.out.println(item3);
		
		
		//Non Premitive Type
		
		//string name="Suhasi";
		//System.out.println(name);
		
		
		//char item4='ABCD';   //invalid Statement
		//char item5="ABCD";   //invalid Statement
		//string name='Anu';   //invalid Statement
		//string name="Om";    //valid Statement
		
		//Boolean Data Type -> True,False
		
	    String b1="true"; 	
		System.out.println(b1);

		String b2="false";
		System.out.println(b2);
		
	}

}
