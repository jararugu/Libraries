/* Exception Handling:
 *  Example 2:
 *  
 * 
 */

package com;

public class SecondProgram {
	public static void main(String[] args) {
		System.out.println("strat");
		int[] a = { 10,20,3};
		//System.out.println(a[2]); // normal output: 20
		//System.out.println(a[22]);
     /* output:
	 -->Exception in thread "main" start java.lang.ArrayIndexOutOfBoundsException: Index 22 out of bounds for length 3
	    at Libraries/com.SecondProgram.main(SecondProgram.java:14)
	*/
		 try {
			 System.out.println(a[22]);
		 }
		 catch(ArrayIndexOutOfBoundsException  e) { // Exception Handling
			 System.out.println("invalid infdex");
		 }
		 System.out.println("end");
		
	}

}
