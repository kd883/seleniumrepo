package Collections;//Using generics to restrict the type of contents accepted by list.

import java.util.ArrayList;

public class ArrayListEx4 {

	public static void main(String[] args) {
		/**
		 * ArrayList<Integer> l1=new ArrayList<Integer>();//Generic -allowing only
		 * integer type objects. l1.add(12); 
		 * 
		 * ArrayList<Boolean> l2=new ArrayList<Boolean>();//Generic-allowing only boolean type objects.
		 * l2.add(true);
		 * 
		 * ArrayList<Character> l3=new  ArrayList<Character>();Generic-allowing only char type of objects.
		 * l3.add('d');
		 * 
		 */
		
		ArrayList<String> list1=new ArrayList<String>();//Generic
		//Now, as we have declared this arraylist to be generic(string) type, we can pass only string type of objects in it.
		list1.add("lily");
		list1.add("hibiscus");
		list1.add("marigold");
		list1.add("lotus");
		System.out.println("Printing the elements of this list:"+list1);
		System.out.println("**********************************");
		System.out.println("Removing specific element from this list based on index:"+list1.remove(0));
		System.out.println("Elements of the updated list:"+list1);
		System.out.println("Removing element from the list based on object:"+list1.remove("hibiscus"));
		System.out.println("Elements of the updated list:"+list1);
		System.out.println("***********************************");
		
		//Now ,we will create another arraylist.
		ArrayList<String> list2=new ArrayList<String>();
		list2.add("apple");
		list2.add("orange");
		list2.add("pineapple");
		list2.add("pomogranate");
		list2.add("figs");
		list2.add(0, "guava");
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		//list1.removeAll(list2);
		System.out.println(list1);
		
		
		System.out.println("Elements of list2 are:"+list2);
		System.out.println("Size of list2 is:"+list2.size());
		System.out.println("**********************");
		//list1.retainAll(list2);
		System.out.println(list1);//No common elements between list1 and list2, so output is null.
		System.out.println("************************");
		
		//Removing elements based on specified conditions.
		//using two methods:
		//-if- statement.
		//-using lambda expression.
		
		/*if(list1.contains("lotus")){
			list1.remove("lotus");	
	}*/
		
		//or
		
		//Using lambda expression.
		
		list1.removeIf(str -> str.contains("lotus"));
		System.out.println("Updated list is :"+list1);
		System.out.println("*********************************");
		
		//Now, clearing all elements available in the list using .clear() method and .removeAll(same list name) method.
		list2.clear();
		//list2.removeAll(list2);
		System.out.println(list2);
		System.out.println(list1);
  }
}
