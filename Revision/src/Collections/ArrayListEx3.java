package Collections;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		System.out.println("Initial list of elements is:"+al);
		System.out.println("Checking wheather this list is empty or not: "+al.isEmpty());
		System.out.println("**********************************");
		
		//Adding elements to the list:
		al.add("India");
		al.add("Israel");
		al.add("Japan");
		al.add("Russia");
		al.add("Australia");
		al.add("New Zealand");
		al.add("Iceland");
		System.out.println("Checking if the list is still empty :"+al.isEmpty());
		System.out.println("Printing the updated list:"+al);
		System.out.println("Checking the size of the updated list:"+al.size());
		System.out.println("**************************************");
		//Adding an element to a specific position in the list.
		al.add(5,"Sri Lanka");
		System.out.println("**************************");
		System.out.println("Printing the updated list:"+al);
		System.out.println("Checking the size of the updated list :"+al.size());
		
		// Creating another object.
		ArrayList al2=new ArrayList(); //Empty arraylist.
		al2.add("equador");
		al2.add("columbia");
		al2.add("venezuela");
		al2.add("brazil");
		al2.add("argentina");
		al2.add("chile");
		al2.add("peru");
		System.out.println("Printing all the elements of this list:"+al2);
		System.out.println("Checking the size of this arraylist:"+al2.size());
		al.addAll(al2);
		System.out.println("Printing the updated al arraylist:"+al);
		System.out.println("Checking the size of the updated arraylist al:"+al.size());
		
		System.out.println("*****************************");
		
		//Now, we are adding the al2 list to al list at specific index.
		al.addAll(2, al2);
		System.out.println("Printing the updated list al:"+al);
		System.out.println("Checking the size of the updated list al:"+al.size());
		
		System.out.println("******************************");
		
		
		
		
		
		
	}

}
