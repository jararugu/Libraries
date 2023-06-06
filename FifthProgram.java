package com;

public class FifthProgram {
	static void display() throws InterruptedException {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
			display();
			
		}
		catch(InterruptedException e)
		{
			System.out.println("Handled");
		}
		System.out.println("end");
	}
}
