package accessingfromoutsidepackage;

import Access_Modifiers.Ex5;

public class Accessingprotectedmembers extends Ex5 {

	public static void main(String[] args) {
		Accessingprotectedmembers obj1=new Accessingprotectedmembers();
		obj1.display( );
		System.out.println("accessing the protected variable int accno from Ex5:"+obj1.accno);
	}
	// so clearly , we are able to access the protected members from another package's class Ex5 into this package.
	
	// the point to remember here is the import statement which must be included in the beginning.

}
// how to perform method overloading for the inherited methods   ??.