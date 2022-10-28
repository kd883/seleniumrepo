package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map m1=new HashMap();
		m1.put(1,5);
		m1.put(2, 10);
		m1.put(3, 15);
		m1.put(4, 20);
		System.out.println(m1);
		
		Map m2=new HashMap();
		m2.put('s', 30);
		m2.put('d', 40);
		System.out.println(m2);
		m1.putAll(m2);//Adds all the elements of m2 map into m1 map.
		System.out.println("The updated map 'm1' is :"+m1);
		
	}

}
