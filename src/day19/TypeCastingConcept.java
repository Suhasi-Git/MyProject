package day19;

//UpCasting - Automatic [smaller to larger] [int --> long]
//DownCasting - Manually [larger to smaller] [long --> int]

public class TypeCastingConcept {

	public static void main(String[] args) {
	
		//UpCasting - Automatic [smaller to larger] [int --> long]
		
		//Example1
		int intvalue = 20;
		long longvalue = intvalue;
		System.out.println(longvalue);
		
		//Example2
		float floatvalue = 11.25F;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		//DownCasting - Manually [larger to smaller] [long --> int]
		
		//Example3
		long lv = 100000;
		int iv = (int)lv;
		System.out.println(iv);
		
		//Example4
		double dv = 22.2222;
		float fv = (float)dv;
		System.out.println(fv);
		
		//Issues in UpCasting and DownCasting		
		
		//Example5 - UpCasting
		int a = 10;
		double x = a;
		System.out.println(x);
		
		//Example6 - DownCasting
		double y = 10.101;
		int b = (int)y;
		System.out.println(b);
		
	}

}
