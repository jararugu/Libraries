/* Check Exception:
 * -->are compiler no Exception and compiler will force you to handle immediately.
 * --> all check Exception will inherit the Exception class.
 * Example: IntrruptedException,FilenotFoundException.
 * 
 *  UncheckException:
 *  --> are Compiler Unknown exceptions and the Compiler will not force you handle immediately.
 *  --> all uncheckException will inherit Runtime Exception class.
 *  --> Example: ArithmeticException,ArrayIndexoutofboundException.
 * 
 Throws:
 * -->is a keyword ,which is used to indicate or inform the caller about the possibility of exception.
 * --> Throws can we used with both check exception and unchecked exception but mandatory do used with checkException.
 * --> Throws can we used with both methods declaration and  constructor. what measuredly used with method Declaration.
 * -->Throws is used to Propagate or transfer  the Exception from ons side to another side.
 * Example :
 */
 package com;

public class ForthProgram {
	
	 
	static void div() throws ArithmeticException // throws indicate the information to the caller about the possibility of exception.
	{
		System.out.println(10/0); /// ArithmeticException
	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
			div();  // caller side
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("HAandled");
		}
		System.out.println("end");
	}

}
/* 
Output:
start
HAandled
end

	*/