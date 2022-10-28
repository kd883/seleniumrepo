package Collections;

import java.util.ArrayList;//import statement for ArrayList. 
import java.util.Collections;//import statement for Collections. 
import java.util.Iterator;//import statement for Iterator interface.

public class ArrayListEx2 {

	public static void main(String[] args) {

		ArrayList al2 = new ArrayList();// Creating an arraylist9a type of list, which is a kind of collection.
		al2.add("porshe");
		al2.add("ferrari");
		al2.add("alfaromeo");
		al2.add("lamborghini");
		al2.add("bavarianmotorworks");
		al2.add("TATA");
		al2.add("Buggati");
		al2.add("pagani");
		al2.add("kyonigsegg");
		al2.add("rimac");

		// Finding the size of this list.
		System.out.println("Size of this list is: " + al2.size());

		// Printing all the elements of this list.
		System.out.println("Elements of this list are: " + al2);
		System.out.println("***********************************");
		/**
		 * So, there are 4(four) ways in which we can print the elements of a list.
		 * -Using simple for loop. -Using for each loop(LHS:RHS). -Using for each
		 * loop(Lambda expression. -Using Iterator.
		 */

		// Meaning of Traversing/Iterating/Looping-Accessing every object stored in
		// ArrayList and performing some kind of operations on them, like printing them.

		// First, using simple for loop.

		System.out.println("Traversing/Iterating/Looping through this list using simple for loop: ");
		for (int i = 0; i < al2.size(); i++) {
			System.out.println(al2.get(i));
		}
		System.out.println("**********************************");

		// Second, using the for-each loop.
		System.out.println("Traversing/Iterating/looping through this list using for-each loop:");
		for (Object CarCompanies : al2) {
			System.out.println(CarCompanies);
		}
		System.out.println("***********************************");

		// Accessing some specific element based on the index.
		System.out.println("Printing the 3rd element(2nd index): " + al2.get(2));
		System.out.println("**************************");

		// Changing/Updating the element in the list.
		al2.set(1, "Shelby");
		System.out.println("Checking the size after updation:" + al2.size());
		System.out.println("Printing the updated list:" + al2);
		System.out.println("**************************************");

		// Sorting the list using Collections.sort() method. It gives the list in
		// ascending order.
		Collections.sort(al2);// Add the import statement and add the argument.
		System.out.println("Printing the sorted arraylist:" + al2);
		System.out.println("******************************");

		// Third, using for-each loop(Lambda expression).
		System.out.println("Traversing the elemts of this list using lambda expression:");

		al2.forEach(a -> { // Here 'a' is a character , it can be any other character.
			System.out.println(a);
		});
		System.out.println("********************************");

		// Fourth, Traversing/Iterating/Looping the elements of this list using
		// Iterator:

		System.out.println("Traversing list elements using Iterator interface :");
		Iterator obj = al2.iterator();
		// System.out.println(al2);

		/**
		 * Iterator interface has some predefined methods like: -hasNext()-->It checks
		 * whether the list has a subsequent element or not and accordingly returns
		 * boolean output(true/false).
		 * 
		 * -next()-->It returns the next element.
		 * 
		 * -remove()-->It deletes the specified element.
		 * 
		 * One single Iterator object can be used to iterate the elements of a list only
		 * once. If we want to iterate the elements of the list again, we need to create
		 * another object of the Iterator.
		 * 
		 * Why so: Because, the first iterator keeps pointing to the last element of the
		 * list and never comes back to the first element for pointing it.
		 */

		// Now, we will use the predefined methods of Iterator interface.

		//System.out.println(obj.hasNext());// this will check and return boolean value if the list has any element at
											// subsequent place.
		/*
		 * System.out.println(obj.next());// System.out.println(obj.next());//
		 * System.out.println(obj.next());//alfaromeo
		 * System.out.println(obj.next());//lamborghini
		 * System.out.println(obj.next());//bavarianmotorworks
		 * System.out.println(obj.next());//TATA
		 * System.out.println(obj.next());//Buggati
		 * System.out.println(obj.next());//pagani
		 * System.out.println(obj.next());//kyonigsegg
		 * System.out.println(obj.next());//rimac
		 */ // System.out.println(obj.next());//NoSuchElementException exception.

		// Alternative to this lengthy process is use while loop.

		System.out.println("***************************");

		while (obj.hasNext()) {
			System.out.println(obj.next());
		}

		System.out.println("*****************************");
		System.out.println(obj.hasNext());
		System.out.println("*************************");
		al2.set(1, "Mahindra&Mahindra");

		// Now, if we want to perform the iteration once more, then,we need to create
		// another object. We cannot use the first object to perform repeated iterations.
		
//		Iterator obj2=al2.iterator(); //Creating second object of Iterator.
//		while(obj2.hasNext()) {
//			System.out.println(obj2.next());
//		}
//		
	}

}
