package day11;

public class Parameters_Values {
	
	//No Parameters No Return Values
	void m1()
	{
		System.out.println("Hello Suhasi");
	}
	
	//No Parameters Returns Values
	int m2()
	{
		return 1004;
	}
	
	//Take Parameters No Returns value
	void m3(String name)
	{
		System.out.println(name);
	}
	
	//Take Parameters Returns Value
	
	int m4(int numb)
	{
		return numb;
	}

	public static void main(String[] args) {
		
		Parameters_Values PM1 = new Parameters_Values();
		PM1.m1();
		
		int rollno = PM1.m2(); //if return then must declare variable
		System.out.println("The roll no is: "+rollno);
		
		
		PM1.m3("daughter");
		
		int number = PM1.m4(5000);
		System.out.println(number);
		


		

	}

}
