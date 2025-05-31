package day9;

public class Reverse_a_string {

	public static void main(String[] args) {
		
		//Reverse a string - length() & charAt()
		
		String s = "suhasi";
		
		System.out.println("Before Reverse...."+s);
		
		for (int i=s.length()-1; i>=0; i--)
		{
			System.out.print(s.charAt(i));
		}
		
		//

	}

}
