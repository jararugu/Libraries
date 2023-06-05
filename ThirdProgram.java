/*  Exception Handling:
 * Example 3:
 * 
 * 
 * Note: 
 * --> it is always important to handle on Exception with relevant try and catch block.
 * --> we cannot have any execute lines of code between try and catch block.
 * --> comments are allowed between try and catch block,between comment is non executable line.
 * --> if the do nor=t no the exception name,we can already handle it using super class type and catch block.
 * --> one try block can have Multiple catch blocks and that suitable catch block will be executed.
 * --> It is always good practice to Handle the Super class catch block as the last catch block.
 * 
 * 
 */
package com;
public class ThirdProgram {
	
  

public static void main(String[] args) {
	  try {
		  System.out.println(10/0);
	  }
	  catch(NullPointerException  e) {
		  
		  System.out.println("1");
		  
	  }
	  catch(ArithmeticException e)
	  {
	 
		  System.out.println("2");
		  
	  }
	  catch(Exception e)
	  {
		  System.out.println("3");
	  }
}

}

/* output:
	2
	*/
