/* PrintStackTrace():
 * --> this method Used to Print the Compiler Information ,About the Exception.
 * --> PrintStackTrace Method Prints ExceptionName,Line Number,and Message about Exception.
 * -->  Syntax: PrintStackTrace()
 * {
 * 
 * }
 * 
 */

package com;

public class EightProgram {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		try {
			System.out.println(10/0);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("end");
		
	}
/*	output:
 * start
java.lang.ArithmeticException: / by zero
	at Libraries/com.EightProgram.main(EightProgram.java:19)
end

 * 
 */
	

}
