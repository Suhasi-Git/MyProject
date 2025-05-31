package day4;

public class Switch_Case {

	public static void main(String[] args) {
	
		//Syntax - Switch Case
		
		/*Switch (variable)
		{
			case value1: statements;
			 break;
			case value2: statements;
			 break;
			case value3: statements;
			 break;
			case value4 : statements;
			 break;
			default: statements;
		
		}*/

		//find the week day by using week number
		
		int weekno = 5;
		
		switch(weekno)
		{		
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default: System.out.print("Invalid Input");
		}
		
	}

}
