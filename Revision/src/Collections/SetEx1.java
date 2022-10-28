package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating set/hashset and adding elements to it.
		Set <String> s1=new HashSet<String>();
		s1.add("Ravi");
		s1.add("Ajay");
		s1.add("Vijay");
		s1.add("Ravi");
		System.out.println("Elements of the Set 's1' are:"+s1);
		System.out.println("Size of this set is:"+s1.size());
		System.out.println("*****************************");
		
		//Traversing elements of the set.
		System.out.println("Traversing elements of the set using foreach loop.");
		for(String obj:s1) {
			System.out.println(obj);
		}
		System.out.println("************************");
		System.out.println("Traversing elements of the set using Iterator.");
		Iterator <String> obj2=s1.iterator();
		while(obj2.hasNext()) {
			System.out.println(obj2.next());
			
		}
		
		System.out.println("****************************");
		 
		//Now, creating another set.
		
		HashSet<String> s2=new HashSet<String>();
		s2.add("allu");
		s2.add("mahesh");
		s2.add("jntr");
		s2.add("ajay");
		System.out.println("Printing elements of set 's2':"+s2);
		System.out.println("Size of this set is :"+s2.size());
		s1.addAll(s2);
		System.out.println("Printing the updated set 's1'"+s1);//Random order of objects
		System.out.println("Size of the updated set s1 is:"+s1.size());
		s1.remove("Ravi");
		System.out.println(s1);
		//s1.removeAll(s2);
		//System.out.println(s1);
		s1.retainAll(s2);
		System.out.println(s1);
		
		
		
	}

}
