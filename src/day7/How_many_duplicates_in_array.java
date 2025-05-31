package day7;

public class How_many_duplicates_in_array {

	public static void main(String[] args) {
		
		
		//find how many duplicate values in array
		
		int a[]= {10,20,10,30,10,40,30,50,60};
		int num=30;
		int count=0;
		
		for (int value:a)
		{
			if (value==num)        //System.out.println(x);
			{
				count++;
			}
		}
        System.out.println(count);
	}

}
