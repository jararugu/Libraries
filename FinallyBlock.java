/*FInally block:
 * 
 * Set of Instruction or of a block code,which gets executed always,irrespective off and Exception Occurs or not.
 * 
 * Syntax:
 * 
 * Finally
 * {
 *     
 * }
 * 
 * 
 */
package com;
public class FinallyBlock {

	public static void main(String[] args) 
	{
		System.out.println("start");
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		finally {
			
			System.out.println("Invalid Finally Block");
			
		}
		System.out.println("end");
	}

}
/*
 Note:
-->.1. It is Possible to Have Nested Try and catch block.

  try
  {
    try
    {
    }
    catch(Exception e)
    {
    }
    }
    catch(Exception e)
    {
    }
  
 -->2. It is possible to have ,try without catch when have try and catch block.
       try{
       }
       finally
       {
       }
 --> 3. throw is used to invoke an Exception Object.
 --> 4. throws is used to Indicates the caller About possibility of Exception.
 --> 5. It is Possible to Declare Multiple Exception using throws.
 
       void m1() throws FIleNotFoundEception,ArithmeticException
       {
       }
         
         or
      void m1() throws Exception
      {
      
      }
      
 --> 6. It is possible to use throw with main method but it is not good practice because the caller of main 
           method is JVM and we cannot Handle an Exception at the JVM side.
           
         Father f = new son();
         Daughter d = (Daughter)f;
         
         
         
         
       
 */
	
	
