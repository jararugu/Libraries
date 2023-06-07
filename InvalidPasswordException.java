/*  CustomException:
--> Based on certain Projects, it is necessary to create user defined Exception.
--> Any Exception,which is created by the user or programmer. is called CustomException.

    Rules For Creating and Invoking Custom Exception .
 1. Create a class with in Exception name.
 2. In order to create check Exception,class should in inherit Exception class.
    and to create un-check exception,class should in inherit RuntimeException.
 3. Override getMesssage() method (variable,Constructor,and Method)
 4. Invoke the Exception Object using throw keyword. and Handle it using Suitable Exception.


   throw:
   --> throw is keyword,Which is used to invoke and object of Exception.
   --> throw is generally used with CustomException.
   --> Syntax:
           throw ObjectofExceptionType;
                 or
           throw new className();
 * 
 */

package com;

class InvalidPasswordException extends RuntimeException {   // Rule:1  and Rule:2

	private String message;

	InvalidPasswordException(String message)
	{
		this.message = message;

	}
	@Override
	public String getMessage( )
	{
		return message;                                   // Rule:3
	}              
}





