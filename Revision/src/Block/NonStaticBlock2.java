package Block;

public class NonStaticBlock2 {
	NonStaticBlock2() {
		System.out.println("this is a non-parameterized constructor");
	}

	{
		System.out.println("this is an example of non-static block-1");
	}
	{
		System.out.println("this is an example of non-static block-2 ");
	}

	public static void main(String[] args) {
		System.out.println("main () method starts here ");
		NonStaticBlock2 obj1 = new NonStaticBlock2();
		System.out.println("main() method ends here ");
	}

	{
		System.out.println("this is an example of non-static block-3");
	}

}
// in this case, main() method is the first to be executed, then, 
//all the non-static blocks get executed sequentially, then, 
//the constructor is executed at the time of object creation, then, the main() method ends.
// so, static block(s) will be executed first ---then the main method-----then the non-static block(s)----then the constructor .