package Collections;//Interesting program(Focus on its output).

import java.util.Vector;

public class VectorEx2 {

	public static void main(String[] args) {
		Vector<String> vl=new Vector<String>();
		System.out.println("The default capacity of this Vector list is:"+vl.capacity());
		System.out.println("The present size of this Vector list si:"+vl.size());
		vl.setSize(3);
		System.out.println("The updated Vector size is :"+vl.size());
		System.out.println("The elements of this Vector list are:"+vl);
		System.out.println("**************************");
		vl.addElement("east coast");
		vl.addElement("west coast");
		vl.addElement("himalayas");
		vl.addElement("island territories");
		System.out.println("The updated vector list:"+vl);
		System.out.println("Present size of this Vector list is:"+vl.size());
		vl.addElement("plains");
		System.out.println("The updated Vector list is:"+vl);
		System.out.println("Present size of the Vector list:"+vl.size());
		System.out.println("The present capacity of the Vector list is:"+vl.capacity());
		
	}

}
