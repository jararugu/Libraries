/*
 * Note:
 --> If the Reference or object is pointing to null, we get NullPointerException.
 --> We can avoid NullPointerException Using "if condition:"
 
 * 
 *
 */
 package com;
public class NullPointerException {

	public static void main(String[] args) {
		System.out.println("start");
		String s = "java";
		// s= null; // NullPointerException
		if(s!=null)
		{
			System.out.println(s.length());
		}
		System.out.println("end");
	}
}
/* output:
start
4
end
*/
