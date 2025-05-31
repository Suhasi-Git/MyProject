package day13;

public class this_const_2 {
	
	String s ="Hasi";
	String j = "Suhasi";
	
	
	void display()
	{
		System.out.println(s);
		System.out.println(j);
	}
	
	/*this_const_2 (String s, String j)
	{
		this.s = s;
		this.j = j;
		System.out.println(s);
		System.out.println(j);
	}
	*/
	

	public static void main(String[] args) {
		//this_const_2 TC = new this_const_2("Suhasi", "Baby");
		this_const_2 TC = new this_const_2();
		TC.display();
	}

}
