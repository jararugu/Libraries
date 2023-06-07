package com;

import java.util.Scanner;

public class Login {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Password");
		 int Password = sc.nextInt();
		 sc.close();
		 if(Password==123)
		 {
			 System.out.println("LOgin Successfully!");
		 }
		 else 
		 {
	
		 try {
			   throw new InvalidPasswordException("Enter Valid Password");
		 }
		 catch(Exception e) 
		 {
			 System.out.println(e.getMessage());
		 }

}
}
}