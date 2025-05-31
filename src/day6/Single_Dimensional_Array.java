package day6;

public class Single_Dimensional_Array {

	public static void main(String[] args) {
		
		/*
		 1) Declaration on an Array
		 2) Add values in an Array 
		 3) Find length/size of an Array
		 4) Read single value in an Array
		 5) Read multiple value in an Array
		  */

		//1) Declaration of an Array
	    //Approach 1   
		int a[]=new int[5];   //Syntax
		                    
		a[0]=100;                           
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		//2) Add value in an Array
        //Approach 2
		 
		int b[]= {100,200,300,400,500};
		
		//3) Find length of an Array
	   System.out.println("length of an array is : "+b.length);	//variable_name.length (length is a keyword)
		
	   //4) Read single value in an Array
	   System.out.println(a[3]);       //variable_name[index_number]
	   
	   //5) Read multiple values in an Array
	   int c[]= {100,200,300,400,500};
	   
	   for (int i=0; i<=4; i++)     // i<=4 or i<5 or i<a.length or i<=a.lenghth-1
	   {
		   System.out.println(c[i]);  // 100, 200, 300, 400, 500
	   }
	   
	   
	   //Enhanced for loop / for..each loop
	   int p[]= {10,20,30,40,50,60};
	   
	   for (int x:p)
	   {
		   System.out.println(x);
	   }
	   
	   
	   
	}

}
