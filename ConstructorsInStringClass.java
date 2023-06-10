/*   Important COnstrutor Present in string class
 * 
 1. EMpty String Object
 2. Passing a set of characters.
 3. Converting char array into String object
 * 
 * 
 * 
 */
package com;
public class ConstructorsInStringClass {
	
	public static void main(String[] args) {
		
		//  EMpty String Object
		String s1 = new String();
		System.out.println(s1);
		
		//Passing a set of characters.
		String s2 = new String("java");
		System.out.println(s2); // java
		
		// Converting char array into String object
		char[] ch = { 'h' ,'a' , 'i'};
		String s3 = new String(ch);
		System.out.println(s3); // hai
		 
		}
	}

/*  output:
 
java
hai

 */

