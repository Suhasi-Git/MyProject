package day10;

public class Company {     //Class name 

	String Name;            //Variables
	String Department;
	int Strength;
	int Salary;
	
	void display()     //Method
	{
		System.out.println(Name);
		System.out.println(Department);
		System.out.println(Strength);
		System.out.println(Salary);
	}
	
	public static void main(String[] args) {      //Main class
		
	Company XXX=new Company();       //Object 1 
	
		XXX.Name = "XXX Limited";
		XXX.Department= "Sales";
		XXX.Strength = 20;
		XXX.Salary = 200000;
		XXX.display();             //called method form class

				
		Company YYY=new Company();     //Object 2
		YYY.Name = "YYY Limited";
		YYY.Department = "Accounts";
		YYY.Strength = 5;
		YYY.Salary = 10000;
		YYY.display();             //called method form class
		
		Company ZZZ=new Company();   //Object 3
		ZZZ.Name = "ZZZ Limited";
		ZZZ.Department = "HR";
		ZZZ.Strength = 10;
		ZZZ.Salary = 150000;
		ZZZ.display();               //called method form class

	}

}
