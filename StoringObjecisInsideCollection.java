package com;
import java.util.ArrayList;
public class StoringObjecisInsideCollection {
	
	public static void main(String[] args)
	{
		
		Student s1 = new Student(21,"sudhakar");
		Student s2 = new Student(22,"mithun");

		ArrayList<Student> l = new ArrayList();
		l.add(s2);
		l.add(s2);
		System.out.println("-------------------");
		//if toString() is not Overridden
		for(int i=0;i<l.size();i++)
		{
			System.out.println("age:"+l.get(i).age); 
			System.out.println("name: "+l.get(i).name);
		}
		System.out.println("-------------------");
		//if toString() is Overridden
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
	
	

}
