package day18;

public class FinallyBlock {

	public static void main(String[] args) {
	
		System.out.println("Program started..");
		
		String s = "welcome";  //enter input null or any word
		
		try 
		{
		System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.println("Catch Block Exception Handled..");
			System.out.println(e.getMessage());
		}
		finally      //finally block always be executed 
		{
			System.out.println("You entered into finally blocked....");
		}
		
		System.out.println("Program ended...");
		

	}

}
