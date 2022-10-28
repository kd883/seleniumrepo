package Block;

public class StaticBlock {
	static {
		System.out.println("***********this is an example of static block ***************");
	}

	public static void main(String[] args) {
		System.out.println("main() method starts");
		System.out.println("this is the main method");
		System.out.println("main method ends");
	}
	static {
		System.out.println("***********this is an example of static block 2 ***************");
	}
	static {
		System.out.println("***********this is an example of static block 3 ***************");
	}


}
// so , static block gets executed before main() method.
// but if the class has no main method, then static block will not be executed.
// use of static block is to initialize the static variables of the class.
// in case of multiple static blocks in a program, then they will be executed sequentially before the execution of main method starts.