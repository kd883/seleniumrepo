package Collections;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList al1=new ArrayList();// Creating an Arraylist 'al1' whose default size is 10.
		al1.add("mango");//Auto upcasting from String to Object class's object.
		al1.add("Banana");
		al1.add(1234);//First, boxing of int value into Integer type object, and then auto-upcasting into Object class object.
		al1.add(null);//Null is allowed in a list type collection.
		al1.add("Banana");//Duplicate elements are also allowed in list type collection.
		al1.add('C');
		al1.add(12.43);// A list collection can hold heterogeneous values/elements.
		al1.add(true);//Boolean values can also be stored in a list type collection.
		al1.add(new ArrayListEx1());//ArrayListEx1() class object will be auto-upcasted to the object of 'Object' class.
		
		
		//All the collections deal only with objects and no primitive data type.
		
		//Now we will be printing all the objects of this collection.
		System.out.println("Size of this list /array list 'al1' is: "+al1.size());
		System.out.println("Printing elements of this list : "+al1);// This simply prints all the elements of this list.
		//.toString() method is overridden in collection.
		System.out.println("***************");
		
		System.out.println("Traversing this list using for loop: ");
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));// .get(i) method used in for loop prints all the list elements.
		}
		System.out.println("************************");
		System.out.println("Traversing list through for each loop : ");
		for(Object fruit:al1) {
			System.out.println(fruit);
		}
		
		//Accessing some specific element based on index no
		
		System.out.println("Return element at index 1st:"+al1.get(1));
		
		//Now we will change/update existing element of the list.
		
		al1.set(3, "Litchi");//It replaces the old element with the new element.
		
		System.out.println("Checking the size of the list 'al1':"+al1.size());
		System.out.println("**********************************************");
		
		//System.out.println("Printing all the elements of this list 'al1': "+al1);
		System.out.println("Printing all the elements of updated list :");
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));// .get(i) method used in for loop prints all the list elements.
		}
		
		
		
		
	}

}
