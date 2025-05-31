package day17;

public class WrapperClasses {

	public static void main(String[] args) {
		
		
		//Wrapper class is used to convert data from one format to another format
		
		String s = "Welcome";  //cannot possible because string value is not in numeric format 
		
//1]	//String value ---> Integer
		
		String s1 = "10";      //possible to convert because value is in numeric format
		String s2 = "20";      //possible to convert because value is in numeric format
		
		//System.out.println(s1+s2);     //get output is 1020 because it is concat
		
		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));      //30
		
//2]	//String value ---> Double
		
		String d1 = "50.5";
		String d2 = "60.6";
		
		System.out.println(Double.parseDouble(d1)+ Double.parseDouble(d2));  // 111.1
		
//3]	//String value ---> Boolean
		
		String B = "Welcome";  //cannot convert into boolean because the value in string is not in boolean
		
		String b1 = "True";    //can convert into boolean
		
		System.out.println(Boolean.parseBoolean(b1));     //true
		
		String b2 = "baby";   //other than true, if pass any string that will return false
		
		System.out.println(Boolean.parseBoolean(b2));    //false
		
		//int, double, boolean ---> String
		
		int a = 10;
		boolean b = true;
		char c = 'A';
		double d = 20.4;
		
		System.out.println(String.valueOf(a));
		System.out.println(String.valueOf(b));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(d));

	}

}
