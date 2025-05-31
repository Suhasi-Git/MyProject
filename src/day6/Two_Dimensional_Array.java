package day6;

public class Two_Dimensional_Array {

	public static void main(String[] args) {
		
		/*
		 1) Declaration on an Array
		 2) Add values in an Array 
		 3) Find length/size of an Array
		 4) Read single value in an Array
		 5) Read multiple value in an Array
		  */
		
		//1) Declaration of Array
		//Notations
		            //1) int a[][]= new int[3][2];
		            //2) int [][]a= new int [][];
		            //3) int []a[]= new int [][];
		
		
		  //Approach 1
		int a[][]=new int[3][2];   //Syntax [3Rows] [2Columns]--> 0,1,2 (Rows) & 0,1 (Column)
				
		a[0][0]= 100;
		a[0][1]= 200;
		
		a[1][0]= 300;
		a[1][1]= 400;
		
		a[2][0]= 500;
		a[2][1]= 600;
		
		 //Approach 2
		
		int b[][]= { {100,200},{300,400},{500,600} };    //OR
		{
			System.out.println(b);
		}
		
		//2) Add value in array
		
		int x[][]= { {100,200},
				     {300,400},
				     {500,600}
	            	};
		System.out.println(x);
  
		//3) find size in an array
		
		System.out.println("Lenghth of Row: " +x.length);
		System.out.println("Length of Column: " +x[0].length);
		
		//4) read single value in array
		
		System.out.println("Value of 2nd row and 1st column: "  +x[2][1]);  //600
		
		//5) read all values form array       <=a.length & <=a.length-1
		
		for(int r=0; r<=2; r++)  //if we don't know the range of rows or column then use .length-1
		{
			for (int c=0; c<=1; c++)   
			{
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
			System.out.println();
			
			
		//normal for loop	
			
			for(int arr[]:x)  //if we don't know the range of rows or column then use .length-1
			{
				for (int t:arr)   
				{
					System.out.print(t + " ");
				}
				System.out.println();
			}
			
		}
	}

}
