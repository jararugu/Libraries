/*  
--> When we reinitialize a String Object, the Existing Objects cannot be Modified.
--> Apart  from that a new Object gets creater.
--> The Referential Variable Pointing to the old Object gets Dereferenced and start pointing to the Newly created Object .
 --> String Objects are Immutable in nature.
 --> The Mutable in nature.
 --> The mutable Version of String are as follows
 
      1. StringBufffer.
      2. StringBuilder.
      
     String s = "sql";
     String s = "apt";
     String s = "java";
     
   1. StringBuffer:
   --> Predefined Final class Present in java.lang package.
   --> Introduced from jdk 1.0
   --> mutable in nature.
   --> Thread safe.
   
   2. StringBuilder:
   --> Predefined Final class Present in java.lang package.
   --> Introduced from jdk 1.0
   --> mutable in nature.
  --> Not Thread safe.
 *
 * 
 */
package com;

public class StringImmutabilityConcept {
	
	public static void main(String[] args) {
		
		String s1 = new String("java");
		System.out.println(s1);    /// java
		s1.concat("  program");
		System.out.println(s1);  // java
		System.out.println("------------");
		 
		String s2 = new String("java");
		System.out.println(s1);    /// java
		s2 = s2.concat("  program");
		System.out.println(s2);  // java program
		System.out.println("------------");
		
		StringBuffer s3 = new StringBuffer("good");
		System.out.println(s3); //good
		s3.append("  morning");
		System.out.println(s3);  // good morning
		System.out.println("--------------");
		
		StringBuilder s4 = new StringBuilder("good");
		System.out.println(s4);  //good
		s4.append("  Evening");  
		System.out.println(s3); //good Even
		System.out.println("--------------");
	}
	

}

/*
java
java
------------
java
java  program
------------
good
good  morning
--------------
good
good  morning
-------------- 

 
 
 
 
 
 
 */
