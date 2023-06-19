package com;
import java.util.ArrayList;
public class TestEmployee {
	
   public static void main(String[] args) {
	
	   Employee e1 = new Employee("guru",50000.00);
	   Employee e2 = new Employee("raja",60000.00);
	   Employee e3 = new Employee("kumar",70000.00);

	   ArrayList<Employee> e = new ArrayList();
	   e.add(e1); // l.add(new Employee("guru",50000.00));
	   e.add(e2);//l.add(new Employee("guru",50000.00));
	   e.add(e3);//l.add(new Employee("guru",50000.00));
	   
	   for(Employee emp : e)
	   {
		   System.out.println(emp);
		   System.out.println(emp.name+"  "+emp.Salary);
	   }
	   
	   
}
}
/*output:
name  guru   Salary: 50000.0
guru  50000.0
name  raja   Salary: 60000.0
raja  60000.0
name  kumar   Salary: 70000.0
kumar  70000.0

 */
