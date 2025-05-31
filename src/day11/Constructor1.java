package day11;

import java.lang.reflect.Constructor;

public class Constructor1 {

	int a;
	int b;
	int c;
	
	
	Constructor1 (int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	void m1()
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		
		Constructor1 ct = new Constructor1(100, 200, 300);
		ct.m1();

	}

}
