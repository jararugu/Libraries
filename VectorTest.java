/*
-->Vector is predefined class present java.uti. package.
-->Vector was intriduced fro, jdk 1.0 --> therefer vector as legacy collection.
-->Intial Capacity of vector is 10.
--> Incremental Capacity of vector is : current capacity*2.
--> The underLined dataStructure of vector is Resiable array or growable array.
-->The Vector impiments the Following interfaces.
   1.List  2.clonable 3. RandomAcesss. 4.Serilizable.
   
   :Constructors present in Vector:
    --------------------------------
 1. vector()
 2. vector(int capacity,int increental capacity)
 3.vector(collection c)
 
 Working of vector:
 -------------------
 -->When we create of an Object of vector ,internally an array grts created based on intial capacity 
     or custom capacity.
--> Whwen you add objetc into vector Once its is full,a new Array gets creaated based on incrfementsl 
        capacity.
--> all objects present in the ols array is copied newly created array.
--> The reference variable poiting to he oladf array gets derefernced andf start pointing to the newly 
       created array.
 */

package vectorclass;
import java.util.Vector;
public class VectorTest {

	public static void main(String[] args) {
		 Vector  v =new Vector();
		   v.add(10);
		  v.add(10.30);
		  v.add("java");
		  
		  for(Object obj : v)
		  {
			  System.out.println(obj);
		  }
	}
}

/*  OutPut:
 10
10.3
java

 */
 

