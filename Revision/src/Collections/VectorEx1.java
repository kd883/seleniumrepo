package Collections;

import java.util.Vector;

public class VectorEx1 {

	public static void main(String[] args) {
		
		Vector<String> l1=new Vector<String>();
		//The default capacity of vector is 10 and every increment in its capacity is of 100%(in arraylist, it was of 50%).
		
		//System.out.println(l1.add("east"));

		System.out.println("***********************");
		//Adding elements by using .add() method
		l1.add("east");
		l1.add("west");
		l1.add(null);
		l1.add("south");
		//Adding elements by using .addElement() method.
		l1.addElement("north");
		l1.addElement("sunrise");
		l1.addElement("cyclone");
		System.out.println("Printing the elements of this vexctor list:"+l1);
		System.out.println("*****************************");
		//Using for each loop.
		for(String obj:l1) {
			System.out.println(obj);
		}
		System.out.println("Checking the capacity:"+l1.capacity());//!0 is the default capacity of vector list.
		
		l1.add("istqb");
		l1.add("manual");
		l1.add("automation");
		l1.add("selenium");
		l1.addElement("rekjavik");
		System.out.println(l1);
		System.out.println("Again, checking the capacity of the vector list:"+l1.capacity());
		//The increment of the capacity in vector list is of 100%.
	}

}
