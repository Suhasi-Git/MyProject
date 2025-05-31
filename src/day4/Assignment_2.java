package day4;

public class Assignment_2 {

	public static void main(String[] args) {
		
		//Largest of two numbers using if else
		
		int number=50;
		
		if (number>=100)
		{
			System.out.println("Number is Largest");
		}
		else 
		{
			System.out.println("Number is Smallest");
		}

		//Largest of two numbers using ternary operator
		
		int Num = 50;
		String Checking =(Num>=100)? "Number is Smallest": "Number is Largest";
		System.out.println(Checking);
		
		
		// Print week number based on week name using switch case
		
		String weekname = "Friday" ;
		
		switch(weekname)
		{
		case "Monday": System.out.println("1");
		break;
		case "Tuesday": System.out.println("2");
		break;
		case "Wednesday": System.out.println("3");
		break;
		case "Thursday": System.out.println("4");
		break;
		case "Friday": System.out.println("5");
		break;
		case "Saturday": System.out.println("6");
		break;
		case "Sunday": System.out.println("7");
		break;
		default: System.out.println("Invalid Input");
		}
		
		//Students have 3 subjects where 40 marks is passing. 
		//If Student fails in any subject then display "you are failed with subject name".
		//If marks more than 40 then fail with grade and subject_name
		//Grades are as follows: Marks 40-60=Grade C, Marks 60-75=Grade B, Marks 75-100=Grade A
		//If students gets more than 75% then display one more message - "you are passed with distinction".
		//If invalid input display invalid marks
		
		
		//Java Program to check whether a character is a vowel or consonant using if-else.
		
		char i= 'B';
		
		if (i=='A' || i=='E' || i=='I' || i=='O' || i=='U')
		{
			System.out.println("i is vovel");
		}
		 else if(i!='H' && i!='R' && i!='W' && i!='Y') 
		{
			System.out.println("i is consonant");
		}
		 else {
			System.out.println("Normal Alphabate");
		 }
		
		
		//Java Program to check Division on the basis of marks obtained by students.
	   //Percentage >= 60% : Division 1, Percentage >= 45% : Division 2, 
	  //Percentage >= 30% : Division 3, Percentage < 30% : Fail
		
		
		int marks=29;
		
				
		if (marks>=60)
		{
			System.out.println("Division 1");
			
		}
		else if (marks>=45)
		{
			System.out.println("Divsion 2");
		}
		else if (marks>=30)
		{
			System.out.println("Division 3");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		
		
		
			}				
				
		}


