package Access_Modifiers; // this is for public access specifiers.

public class Ex6 { // here, its imp to have this class as public in order to make its members accessible/visible in another package.
	public int rank = 1;

	public void print() {
		System.out.println("rank is :" + rank);
	}

	public static void main(String[] args) {
		Ex6 obj1 = new Ex6();
		obj1.print(); // public member is accessible within the same class.
		System.out.println(obj1.rank); // public member int rank is accessible within the same class.

	}

}

class accesscheck_ {

	public static void main(String[] args) {
		Ex6 obj2 = new Ex6();
		obj2.print();// clearly, we are able to access the public member of class Ex6 within this
						// class in the same file.
		System.out.println("differ : "+obj2.rank);// same as above.
	}
}
// we will also check if these public members of class Ex6 are accessible from another class of this package, and from a class of another package.
/** the public members of a class can be accessed:
 * -within the same class
 * -in another class of the same file
 * -in another class of same package
 * -in another package using inheritance.....but in this case , the original class being inherited must be 'public'.
 */
