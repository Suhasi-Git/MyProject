package day3;

public class Ternary_Operator {

	public static void main(String[] args) {
		
		//Ternary Operator
		
		//Syntax : Datatype Variable = (Exparation) ? Value_1 : Value_2
		// Check Exp is True then print Value_1 
		// Check Exp is False then print value_2
		
		
		//Example 1
		int Exp=20;
		System.out.println(Exp); //False-20

		//Example 2
		int age=30;
		String Eligibility=(age>=18)? "Allowes": "Not Allowed";
		System.out.println(Eligibility); //True-Allows
		
		//Example 3
		int i=300;
		System.out.println(i);  //False-300
		
	}

}
