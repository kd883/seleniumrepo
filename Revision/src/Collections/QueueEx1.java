package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue qu = new PriorityQueue();
		// The .add() method in queue is overridden in a way that it always keeps the
		// smallest object at the top position/as head element.

		qu.add(12);
		qu.add(23);
		qu.add(34);
		qu.add(45);
		qu.add(98);
		System.out.println("Printing the elements of this queue:" + qu);
		System.out.println("Finding the size of this queue:" + qu.size());
		System.out.println("*****************************************");

		/**
		 * Now,we will use four different methods: -1- this is .element() method which
		 * returns the top most/head element of the queue. if the queue is empty, this
		 * method will throw an exception by the name-nosuchelementexception.
		 * 
		 * -2-this is .peek() method and also returns the head element of the queue.But
		 * if the queue is empty, then it returns null instead of throwing an exception.
		 * 
		 * -3-this is .remove() method and it removes the head element of te queue.In
		 * case the queue is empty, this method will throw a nosuchelementexception.
		 *
		 * -4-this is .poll() method and it also removes the head element of the
		 * queue.But of the queue is empty, this method will return null value and won't
		 * throw an exception.
		 */

		System.out.println("Using .element() method:" + qu.element());
		System.out.println("Using .peek() method:" + qu.peek());
		System.out.println("Using .remove() method:"+qu.remove());
		System.out.println("Using .poll() method:"+qu.poll());
		System.out.println("************************");

		// Now,printing all the elements of the queue by using foreach loop.....we
		// cannot use normal for loop because queue has no indexing.
		System.out.println("Printing the queue elements using foreach loop.");
		for (Object obj : qu) {
			System.out.println(obj);
		}
		System.out.println("*********************");

		//We can also use Iterator for traversing all the objects of the queue.
		System.out.println("Printing the queue elements using Iterator.");
		Iterator obj2=qu.iterator();
		while(obj2.hasNext()) {
			System.out.println(obj2.next());
		}
	}

}
