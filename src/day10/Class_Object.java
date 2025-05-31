package day10;

public class Class_Object {
	
	//variables
	int emp_id;
	int salary;
	String name;
	String job;
	
	
	//methods
	void display()
	{
		System.out.println(emp_id);
		System.out.println(salary);
		System.out.println(name);
		System.out.println(job);
		
	}

	public static void main(String[] args)
	{
		Class_Object emp1=new Class_Object();
		
		emp1.emp_id=101;
		emp1.salary=20000;
		emp1.name="Suhasi";
		emp1.job="Finance";
		emp1.display();
		
		
		Class_Object emp2=new Class_Object();
		
		emp2.emp_id=102;
		emp2.salary=10000;
		emp2.name="Akshay";
		emp2.job="Developer";
		emp2.display();
		
		Class_Object emp3=new Class_Object();
		
		emp3.emp_id=103;
		emp3.salary=25000;
		emp3.name="Raj";
		emp3.job="Designer";
		emp3.display();
	

	}

}
