package day13;

public class this_keyword_2 {
	
	int i = 50;
	int j = 60;
	int k = 70;
	
	void m1(int i, int j, int k)
	{
		this.i = i;
		this.j = j;
		this.k = k;
		System.out.println(j);
		System.out.println(j);
		System.out.println(k);
	}
	

	public static void main(String[] args) {
		
		this_keyword_2 TK2 = new this_keyword_2();
		
		TK2.m1(90, 40, 30);

	}

}
