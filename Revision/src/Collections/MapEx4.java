package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> m = new HashMap<Integer, String>();// Creating restricted HashMap.
		m.put(5, "india");
		m.put(10, "nepal");
		m.put(15, "Bangladesh");
		m.put(20, "Bhutan");
		m.put(25, "Sri Lanka");
		System.out.println("Printing the elements of this Map:" + m);
		System.out.println("*****************************");

		System.out.println("Traversing the elements of this Map using foreach loop.");
		for (Map.Entry<Integer, String> obj : m.entrySet()) {
			System.out.println(obj.getKey() + " : " + obj.getValue());
		}
		System.out.println("**********************");

		// Map is an interface and Entry is also an interface . Entry extends map
		// interface and it contains some methods like .entrySet() ,getKey(), and
		// getValue().
		Iterator<Map.Entry<Integer,String>> itr=m.entrySet().iterator();// focus here.
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
