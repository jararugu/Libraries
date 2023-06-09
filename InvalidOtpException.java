/* 
 * 
 */
  package com;

public class InvalidOtpException extends Exception {
	
	private String message;
	
	public InvalidOtpException(String message)
	{
		this.message  = message;
		
	}
	
	public String getmessage()
	{
		return message;
	}

}
