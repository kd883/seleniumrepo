package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m1 = new HashMap();
		// To add elements to a map, we use put method.
		m1.put("key1", "admin");// upcasting for both entries......String object is converted to Object class
								// objects.
		m1.put("key2", "admin");// upcasting for both the entries.
		m1.put(null, "admin123");
		m1.put("key3", null);
		m1.put(234, "manager");// in case of,first boxing and then upcasting. in case of string,only upcasting
		System.out.println("Printing the elements of this Map:" + m1);
		System.out.println("Size of the Map is:" + m1.size());
		System.out.println("Gettign the value of some specific key:" + m1.get("key3"));
		System.out.println("Getting the whole key set of this Map:" + m1.keySet());
		System.out.println("Getting the values of this Map:" + m1.values());
		m1.put(234, "chief");
		// here,we are updating the value of the already present key.So the size will
		// remain same and the value 'manager' will be replaced by 'chief'.

		System.out.println("Checking the updated size of the Map:" + m1.size());// Size=5,same as earlier.
		System.out.println("Printing the elements of the updated map:" + m1);// Prints the updated value for key-234

		// .keySet() method returns all the keys of the associated Map.
		// .values() method returns all the values of the associated Map.
		System.out.println("************************************************");
		System.out.println("Now,we will print the elements of this Map using-Iterator,foreach loop and lambda expression.");
		
		System.out.println("Using Iterator to Traverse elements of the Map.");
		
		//	CHECK CHECK CHECK CHECK CHECK
		for(Map obj:)

	}

}