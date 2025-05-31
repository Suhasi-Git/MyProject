package day13;

public class this_keyword_1 {
	
	int basic = 1000;
	int HRA = 2000;
	int LTA = 3000;
	int gross;
	
	void Gross1(int basic)
	{
		this.basic=basic;
		System.out.println(this.basic);
	}
	void Gross2(int basic, int HRA)
	{
		this.basic = basic;
		this.HRA = HRA;
		gross = basic + HRA;
		
		System.out.println("Gross is: "+gross);
	}
	
	this_keyword_1()
	{
		int b = basic;
		int h = HRA;
		int l = LTA;
		int k;
		
		k = b+h+l;
		System.out.println("Gross is: "+k);
		
	}

	public static void main(String[] args) {
		
		this_keyword_1 TK = new this_keyword_1();
		
		TK.Gross1(8000);
		TK.Gross2(3000, 7000);
		
		

	}

}
