package day18;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		
		System.out.println("Program is started...");

		String s = null;
		
		
		try 
		{
		System.out.println(s.length());
		}
		/*
		catch(NullPointerException e)
		{
			System.out.println("Handeled Exception....");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handeled Exception....");
			System.out.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handeled Exception....");
			System.out.println(e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Handeled Exception....");
			System.out.println(e.getMessage());
		}
		*/
		catch(Exception e)
		{
			System.out.println("Handeled Exception....");
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Program is completed...");
	}
}
