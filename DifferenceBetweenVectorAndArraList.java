/*     Difference Between Vectro and ArrayList
 *     ---------------------------------------
     Vector										ArrayList
--> Introduced from jdk 1.0					--> introduced from jdk 1.2.
-->Incremental of Capacity:					--> Incremental Capacity:
    current Capacity*2					       Cuurent capacity*3
    										  ---------------------  +1
    										             2
--> Vector have a 4 constructors`			--> ArayList contains the 3 constructors.
-->thread safe.								--> not thread safe.



question:When we choose ArrayList and LinkedList?
--> When there is inserting and deleting of objects the prefer LinkedList.bcz In arrayList 
    Shifting of Objects is involved.Which reduces the efficiency.
--> When there is atoring and rfetriving bee prefer ArrayList .
     bcz The arrayList is sequential,traversing is faster.
 */

package vectorclass;
import java.util.ArrayList;
public class DifferenceBetweenVectorAndArraList {
	public static void main(String[] args) {
		int a = 10;
		double b = 1.5;
		ArrayList l = new ArrayList();
		l.add(a); //AutoBoxing --> l.add(new Intewger(10));
		l.add(b); //Autoboxing -->l.add(new Double(1.5));
		
		//upcasting or generalization
		//Object i = new Integer(10); or object i = new Double(1.5);
		for(Object i : l)
		{
			System.out.println(i);
	}
	}

}
/*
 OutPut:
10
1.5

 */
