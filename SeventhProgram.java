/* Important  Methods Present in throwable class:
 * getMessage():
 * This Method: this is used to Written a small  "Message" about the Program.
 * Syntax:
 *  Public Message getMessage() {
 *  
 *  return null;
 *  }
 *  
 *  Example:
 */

package com;

public class SeventhProgram {
	public static void main(String[] args) {
		

	try {
		System.out.println(10/0);
	}
	catch(Exception e) {
		String Message = e.getMessage();
		System.out.println(Message);
		System.out.println(e.getMessage());
	}
}
}

/* Output:
 * / by zero
 by zero
 */

