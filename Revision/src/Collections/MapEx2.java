package Collections;

import java.util.Map;
import java.util.TreeMap;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m1=new TreeMap();//Treemap returns output in Ascending order.
		m1.put(1, "indian ocean");
		m1.put(4,"pacific ocean");
		m1.put(2, "atlantic ocean");
		m1.put(3,"arctic ocean");
		m1.put(5,"antarctic ocean");
		System.out.println(m1);
		
		
		
	}

}
