package com;

//import java.util.Scanner;

public class Atm {
	
	public static void main(String[] args) {
		
	    int balance = 5001;
	    /*
	     Scanner sc = new Scanner(System.in);
		 System.out.println("Amount Want to be withdraw");
		 int Amount = sc.nextInt();
		 sc.close();
	     */
	    
		 if(balance<=5000)
		 {
			 System.out.println(" Amount Withdrwan Successfully!");
		 }
		 else 
		 {
	
		 try {
			   throw new InsufficientBalanceException("Insufficient Balance");
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e.getMessage());
		 }
		 }
	}
}

	
