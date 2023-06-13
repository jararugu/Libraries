/*
Enhanced for loop or for each loop:
------------------------------------

--> for each loop is traverse a group of objects from an array or cooolection.
--> for each loop uniquelydirectional.(only forwd direction).

--> Syntax:\

for(DatatypeToTraverse  variable : arrayname/coolectionName)
  {
  //staements;
   }
 */



package com;

 class ForEachLoop1
{
	public static void main(String[] args) 
	{
		
		int[] a = {10,20,30};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("-------------------------");
		for(int i : a)
		{
			System.out.println(i);
		}
		System.out.println("-------------------");
		
		double[] marks = { 19.8,78,8,98.9};
		for(double x: marks)
		{
			System.out.println(x);
		}
		System.out.println("------------------");
        String[] fruits = { "Apple","banana","mango"};
        for(String f: fruits)
        {
        	System.out.println(f);
        }
	
	}
}
 /* output:
 10
20
30
-------------------------
10
20
30
-------------------
19.8
78.0
8.0
98.9
------------------
Apple
banana
mango
*
  */
	
	
	
	


