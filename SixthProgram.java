package com;
import java.io.*;
public class SixthProgram 
{
	static void  readData() throws FileNotFoundException
	{
		FileReader f = new FileReader("car.txt");
		// FileNotFoundException Occurred.
	}

	public static void main(String[] args) 
{
		try
		{
			readData();
		}
       catch(FileNotFoundException e)
		{
	System.out.println("handled");
		}
}
}


/* Output:

Handled
*/