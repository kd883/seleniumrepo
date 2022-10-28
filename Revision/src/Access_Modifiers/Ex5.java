package Access_Modifiers; // this is an example of protected access specifier and their visibility within their class, outside their class, within their own package and outside their own package.

public class Ex5 {
	protected int accno = 35467;

	protected void display() {
		System.out.println("I am for displaying the account number.");
	}

	public static void main(String[] args) {
		Ex5 obj1 = new Ex5();
		obj1.display(); // so, protected void display() method is accessible within the same class.
		System.out.println("accessing the protected variable: " + obj1.accno);// protected variable is also accessible
																				// within the same class.

	}

}

class Accesscheck {
	public static void main(String[] args) {
		Ex5 obj2 = new Ex5();
		obj2.display();// so we are able to access the default members of class Ex5 into this class.
		System.out.println("accessing int accno:" + obj2.accno); // wee are also able to access the protected variable
																	// int accno of class Ex5 into this class.
	} // now we will create another class and check the visibility/ accessibility of
		// the protected members of class Ex5 into that class.,...and after that, we
		// will check the same from another package. 
	
	// PROTECTED MEMBERS CAN ALSO BE ACCESSED FROM A DIFFERENT PACKAGE THROUGH INHERITANCE.
}
