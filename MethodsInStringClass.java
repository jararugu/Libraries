// Important methods in String class

package com;

public class MethodsInStringClass {
	
	public static void main(String[] args) {
		
		String s = "Gururaja Shreshti";
		System.out.println(s);                 // Gururaja Shreshti
		System.out.println(s.length());      // 17
		System.out.println(s.toLowerCase()); // gururaja shreshti
		System.out.println(s.toUpperCase()); // GURURAJA SHRESHTI
		System.out.println(s.startsWith("Guru")); // true
		System.out.println(s.charAt(8));  // a
		System.out.println(s.indexOf('h')); // 10
		System.out.println(s.contentEquals("raja")); // true
		
		
		String s1 = "mbbs";
		String s2 = "mbbs";
		String s3 = "MBbs";
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
	} 

}

/* output:
Gururaja Shreshti
17
gururaja shreshti
GURURAJA SHRESHTI
true
 
10
false
true
false
true 
  

 */
