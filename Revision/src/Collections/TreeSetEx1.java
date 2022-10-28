package Collections;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet is the class is used to enter the elements in a Set collection in sorted order.

//.add() method in TreeSet class has been overridden in such a way that it checks and stores the incoming entries in ascending order.
//.pollFirst() method,.pollLast() method,

public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> al = new TreeSet<String>();
		al.add("Ratan");
		al.add("Mohan");
		al.add("Ashwin");
		al.add("Aman");
		System.out.println("Printing the TreeSet elements:" + al);

		System.out.println("**********************************");
		System.out.println("Using Iterator to traverse the elements of TreeSet.");
		Iterator<String> obj = al.iterator();
		while (obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("***********************************");
		System.out.println("Printing the TreeSet elements in descending order using Iterator.");

		Iterator obj2 = al.descendingIterator();
		while (obj2.hasNext()) {
			System.out.println(obj2.next());
		}
		System.out.println("**************************");

		TreeSet<Integer> al2 = new TreeSet<Integer>();
		al2.add(12);
		al2.add(23);
		al2.add(34);
		al2.add(54);
		al2.add(32);
		System.out.println("The elements of this TreeSet 'al2' are:" + al2);
		System.out.println("***************************************");

		// Now,using .pollFirst() method and .pollLast() method.
		System.out.println("Using .pollFirst() method on this TreeSet :" + al2.pollFirst());
		System.out.println("Updated elements of the TreeSet:" + al2);
		System.out.println("Using .pollLast() method on this TreeSet :" + al2.pollLast());
		System.out.println("Updated elements of the TreeSet:" + al2);

		// .pollFirst() method removes the first element from the TreeSet
		// .pollLast() method removes the last element from the TreeSet.
		System.out.println("**********************************");
		TreeSet<Integer> al3 = new TreeSet<Integer>();
		al3.add(10);
		al3.add(9);
		al3.add(3);
		al3.add(4);
		al3.add(5);
		al3.add(6);
		al3.add(7);
		al3.add(8);
		al3.add(1);
		al3.add(2);
		System.out.println("The elements of this TreeSet 'al3' are:" + al3);
		System.out.println("Reverse set:" + al3.descendingSet());// High to low.
		System.out.println("Head Set:" + al3.headSet(5));// This method prints the elements present before that element
															// which is passed as parameter.
		System.out.println("Head Set second method:" + al3.headSet(4, true));
		// .headSet(element,boolean) method either includes of excludes the specified
		// element as per the boolean value.

		System.out.println("Head Set second method:" + al3.headSet(6, false));
		
		System.out.println("************************");
		
		System.out.println("Now,we will use .subSet() method");
		System.out.println("subSet normal:"+al3.subSet(1,4));
		
		System.out.println("subSet boolean:"+al3.subSet(2,false, 5, false));

		System.out.println("subSet boolean:"+al3.subSet(1,true,7, true));
		System.out.println("******************************************");
		
		System.out.println("Using .tailSet() method:"+al3.tailSet(7));
		System.out.println("Using .tailSet() method:"+al3.tailSet(4,false));
		
		

	}

}
