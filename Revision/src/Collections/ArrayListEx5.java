package Collections;//In queue and set, there is no indexing, hence normal for loop is inapplicable there.So we must know how to use Iterator for printing the elements of the collection

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(12344);
		al.add('c');
		al.add("asdf");
		al.add("nicobar");
		al.add("ten degree channel");
		al.add("kuno palpur cheetah");
		al.add("sco summit @samarkand");
		System.out.println("printing list elements :"+al);
		System.out.println("****************************");
		
		//Using Iterator to print the elements of this list.
		Iterator obj=al.iterator();
		while(obj.hasNext()) {
			System.out.println(obj.next());
		}
		System.out.println("**************************");
		
		//Iterating once more--for this we need to create another object of Iterator.
		Iterator obj2=al.iterator();
		while(obj2.hasNext()) {
			System.out.println(obj2.next());
		}
		System.out.println("*********************");

		List l1=new ArrayList();
		l1.add('s');
		l1.add('r');
		l1.add('f');
		System.out.println(l1);
		System.out.println("*************************");
		
		//Now,we are using Collections.sort and Collections.reverse
		/*Collections.reverse(al);
		System.out.println(al);// IF PUTTING AL , ITS SHOWING ERROR.
		Collections.sort(al);
		System.out.println(al);*/
		Collections.sort(l1);
		System.out.println(l1);
		

		Collections.reverse(al);
		System.out.println(al);
		
	}

}
