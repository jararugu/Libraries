package com;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s = " Developer";
		char[] ch = s.toCharArray(); // String into array
		
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]); // Developer
		}
		System.out.print("\n--------\n");
		for(int i=ch.length-1;i>=0;i--) 
		{
			System.out.print(ch[i]);  // repoleveD
		}
		
	}

}

/* Output:
 * Developer
--------
repoleveD 
 * */
