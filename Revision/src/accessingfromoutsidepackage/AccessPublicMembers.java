package accessingfromoutsidepackage;

import Access_Modifiers.Ex6; // remember this import statement.

public class AccessPublicMembers extends Ex6 {

	public static void main(String[] args) {
		Access_Modifiers.Ex6 obj1 = new Access_Modifiers.Ex6();
		obj1.print();// successfully able to access the public member void print() method from class
						// 'Ex6' present in another package through inheritance.
		System.out.println(obj1.rank);// successfully able to access the public member int rank from class 'Ex6'
										// present in another package using inheritance.

	}

} // here, the inherited class must be public in order to make its 'publicly' declared members visible/ accessible.

 // check fully qualified class concept.....how its written??