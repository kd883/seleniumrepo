package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;

//We will be converting/adding:
//ArrayList collection into Set collection.
//Queue collection into Set collection.
//Vector collection into Set collection.

public class SetEx2Conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Ravi");
		System.out.println("Printing the elements of this ArrayList collection:"+al);
		System.out.println("*******************************************");
		
		//Creating a queue collection.
		Queue qu1 = new PriorityQueue();
		qu1.add("mercury");
		qu1.add("venus");
		qu1.add("earth");
		qu1.add("mars");
		System.out.println("Printing the elements of this queue:"+qu1);
		System.out.println("**************************************");
		
		//Now adding the queue into Set collection.
		HashSet<String> hs0=new HashSet<String>(qu1);
		System.out.println(hs0);
		System.out.println("********************************");
		
		//Creating a vector collection and then adding its elements to a Set collection.
		Vector<String> Vc=new Vector<String>();
		Vc.add("tirupati");
		Vc.add("sabarimala");
		Vc.add("meenakshi");
		Vc.add("kashi vishwanath");
		Vc.add("somnatha");
		Vc.add("kamakhya");
		System.out.println("Printing the elements of this Vector collection :"+Vc);
		HashSet<String> hs2=new HashSet<String>(Vc);
		System.out.println(hs2);
		System.out.println("************************************");
		
		//Creating a Set collection and adding the ArrayList elements into the Set collection.
		HashSet<String> hs=new HashSet<String>(al);//This statement will add the elements of ArrayList 'al' into the Set collection.
		//Here, 'hs' is a Set type collection.
		System.out.println("Printing the elements of Set type collection:"+hs);
		System.out.println("***************************************");
		
		hs.add("gaurav");
		System.out.println("Print the updated Set collection:"+hs);
		System.out.println("*************************************");
		
		System.out.println("Printing the elements of this Set collection using Iterator.");
		Iterator<String > i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("*********************************");
		
		System.out.println("Traversing the elements of this Set collection using lambda expression.");
		hs.forEach(a ->{
			System.out.println(a);
		});
		System.out.println("***************************");
		
		hs.removeIf(a ->a.contains("Vijay"));
		System.out.println(hs);
				
	}

}
