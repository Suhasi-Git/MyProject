package day8;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {
		
//1)	//length() - find length of characters present in string
		
		String s="Welcome"; //OR String s = new String ("Welcome");
		
		System.out.println(s);                   //Output - welcome
		
		System.out.println("Welcome".length());  //Output - 7
		System.out.println(s.length());          //Output - 7
		System.out.println("   Welcome   ".length());
		
		
//2)	//concat() - used for joining two or more strings
		
		String a = "Suhasi";
		String b = "Akshay";
		
		System.out.println(a+b);           //Normal method
		System.out.println(a.concat(b));   //use of concat() method to join 2 strings
		
		String c = "Apna Sapna";
		String d = "Money Money";
		
		System.out.println(a+b+c+d);
		System.out.println(a.concat(b).concat(c).concat(d)); //joint multiple strings
		System.out.println(a.concat(b+c+d));
		
		System.out.println("Hello World"+"In Java");
		System.out.println("Hello"+"World".concat("in"+"Java"));
		System.out.println("Hello World".concat("IN Java"));
		
		String e = "Suhasi";
		int f = 50;
		
		System.out.println(e+(f));
		
		
//3)   //trim() - Remove spaces left and right 	
		
		String g = "   Suhasi   ";
		
		System.out.println(g);          //    Suhasi
		System.out.println(g.trim());   //Suhasi (Spaces removed)
		
		System.out.println("Before Trimming..."+g.length());        //12
		System.out.println("After Triming..." +g.trim().length());  //6
		
		
//4)    //charAt() - returns a character form a string based on index number
		String h = "Babita";
		System.out.println(h.charAt(4));  //t
		System.out.println(h.charAt(0));  //B		

//5)    //contains() - check particular string is a part of main string or not
		//must necessary all characters are in upper case or lower case
		
		String i = "Entertainment";
		String j = "Enter";
		String k = "Ment";
				
	    System.out.println(i.contains(j)); //True
	    System.out.println(i.contains(k)); //false because M is upppercase
		
//6)    //equals(), equalsIgnoreCase() - use to compare string and return boolean value true/false
	    
	    String l = "Baby";
	    String m = "Baby";
	    
	    System.out.println(l==m); //true
	    System.out.println(l.equals(m));  // True
	    System.out.println(l.equals("baby")); //False bcoz B is upper case in main string
	    System.out.println(l.equalsIgnoreCase("bAby")); //True because we have used ignorecase()
	    
//7)    //replace() - Replace Single/Multiple/Sequence character in a string
	     
	    String n = "i love my india so very much very much by heart";
	    
	    System.out.println(n.replace('o','P'));            //single characters
	    
	    System.out.println(n.replace("much", "not much")); //multiple characters
	    	    
	    String p = "abcaacc";
	    
	    System.out.println(p.replace('a', 'x').replace('c','y'));
	    
	    
//8)    //substring() - Extract substring from the main string    
	    
	    String o = "Welcome";
	    
	    System.out.println(o.substring(3,7));  //come (starting index no,ending index no + 1)  
	    System.out.println(o.substring(0,3)); //wel (starting index no,ending index no + 1)
	    
//9)    //toUpperCase(), toLowerCase() - 
	    
	    String q = "Chikoo";
	    
	    System.out.println(q.toUpperCase()); //CHIKOO
	    System.out.println(q.toLowerCase()); //chikoo
	    
//10)   //split() - split the string into multiple parts based on delimeter
	    
	    String r = "suhasi.gadge9@gmail.com";
	    
	    String z[] = r.split("9");
	    System.out.println(Arrays.toString(z)); //[suhasi.gadge, @gmail.com]
	    
	    System.out.println(z[0]);  //suhasi.gadge
	    System.out.println(z[1]);  //@gmail.com
	    
//11)   //StringBuffer - to reverse the characters in string	
	    
	    StringBuffer y = new StringBuffer ("Welcome");
	    
	    System.out.println("After reverse..."+y.reverse());
	    
//11)   //StringBuilder - to reverse the characters in string	
	    
	    StringBuilder w = new StringBuilder ("Welcome");
	    
	    System.out.println("After reverse..."+w.reverse());	    
	    
	    
	    
	  
	    
	    
	    
	    
	}

}
