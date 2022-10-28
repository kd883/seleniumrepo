package Block;

public class NonStaticBlock {

	// NonStaticBlock() {
	// System.out.println("this is a zero parameterized constructor"); // this is
	// the constructor body.
	// }

	{
		System.out.println("this is an example of non-static block"); // this is the body of non-static block which gets
																		// executed before the execution of the
																		// constructor while object creation.
	}

	public static void main(String[] args) {
		System.out.println("main() method starts ");
		NonStaticBlock obj1 = new NonStaticBlock();
		System.out.println("-------------------------------------------");
		NonStaticBlock obj2 = new NonStaticBlock();
		System.out.println("main() method ends here");
	}

}
// even if we comment out the zero parameterized constructor, still the
// non-static block will be executed before the execution of the default
// constructor which is hidden.