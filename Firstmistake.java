/* Exception Handling:

 * Exception:
 -->is an Event or interruption,which  talks the execution of a program ,where in the below lines of code will not get executed.
 --> Exception should always be handled and the process of handling an exception is called Exception Handling.
 -->In other words, Exception is an runtime interruption,which has to be handled.
 
 TRY AND CATCH BLOCKS:
 --> In java,we generally handle an Exception Using try block and Catch block.
 --> The Problem Lines  or Critical Lines,Which might Given an Exception, should always be written inside try block.
 --> The solution for the Exception occurred should always be written inside catch block.
 --> Catch block will get executed,only when Exception Occurred.
 */
  package com;

import java.util.Scanner;

public class Firstmistake {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number");
		int x= sc.nextInt(); // --> double --> output--> infinity
		System.out.println("enter second number");
		int y = sc.nextInt();
		try {
		System.out.println(x/y);// ---> ArithmetcException
		}
		catch(ArithmeticException e) {
			System.out.println("do not devide by zero");
		}
		catch(Exception e)
		{
			System.out.println("handled");
		}
		sc.close();
		
	}
	
	
	
/* output:
enter first number
10
enter second number
0
do not divide by zero

 * 
 */

}
