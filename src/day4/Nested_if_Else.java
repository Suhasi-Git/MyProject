package day4;

public class Nested_if_Else {

	public static void main(String[] args) {
		
		//if condition having another next condition
		
		//Example 1
		//Display week name based on week number
		
		int week=10;
		
		if (week==1)
		{
			System.out.println("Sunday");
		}
		else if (week==2)
		{
			System.out.println("Monday");
		}
		else if (week==3)
		{
			System.out.println("Tuesday");
		}
		else if (week==4)
		{
			System.out.println("Wednesday");
		}
		else if (week==5)
		{
			System.out.println("Thursday");
		}	
		else if (week==6)
		{
			System.out.println("Friday");
		}
		else if (week==7)
		{
			System.out.println("Saturday");
		}	
		else
		{
			System.out.println("Invalid week number");
		}	
		
		
		
		//Example 2
		// Display the grade for students
		
		int marks=79;
		
		if (marks>=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>=90)
		{
			System.out.println("Grade B");
		}
		else if (marks>=80)
		{
			System.out.println("Grade C");
		}
		else if (marks>=70)
		{
			System.out.println("Grade D");
		}	
		else
		{
			System.out.println("Grade E");
		}
		
		//Example 3
		//Display the marks of students from grade
		
		char Grade = 'C';
		
		if (Grade == 'A')
		{
			System.out.println("Marks between 90 to 100");
		}
		else if (Grade =='B')
		{
			System.out.println("Marks between 80 to 90");
		}	
		else if (Grade == 'C')
		{
			System.out.println("Marks betwwen 70 to 80");
		}	
		else
		{
			System.out.println("Marks is below 70");
		}
		
	}
	

}
