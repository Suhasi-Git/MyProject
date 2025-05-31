package day10;

public class Calculator {

	int num1;
	int num2;
	int output;
	
	void sum()
	{
		output = num1+num2;
		System.out.println("sum of two number is: "+output);
	}
	
	void minus()
	{
		output = num1-num2;
		System.out.println("substraction of two number is: "+output);
	}
	
	void multiply()
	{
		output = num1*num2;
		System.out.println("Multiplication of two number is: "+output);
	}
	
	void division()
	{
		output = num1/num2;
		System.out.println("Division of two number is: "+output);
	}
	public static void main(String[] args) {
		
		Calculator operation1 = new Calculator();
		operation1.num1 = 30;
		operation1.num2 = 2;
		operation1.sum();
		operation1.minus();
		operation1.multiply();
		operation1.division();
		
		
		Calculator operation2 = new Calculator();
		operation2.num1 = 50;
		operation2.num2 = 10;
		operation2.sum();
		operation2.minus();
		operation2.multiply();
		operation2.division();
	

	}

}
