package com;
import java.util.Scanner;


public class Otp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter OTP");
		int otp = sc.nextInt();
		sc.close();
		if(otp == 456789)
		{
			System.out.println("Login Successfully");
		}
		else
		{
			try
			{
				throw new  InvalidOtpException("enter Valid OTP");
			}
			catch(InvalidOtpException e)
			{
				System.out.println(e.getmessage());
			}
		}
		
		
	}

}
