package Access_Modifiers; // looking at the example of private constructor within a class.

 class A2 {
	private A2() { // private constructor.

	}

	A2 obj1 = new A2(); // through this object creation , the constructor A2 is being accessed, which is
						// possible here because the private constructor is within the same class .
// but if we do this same object creation outside this class , then the compiler will show an error because, while creating an object , the constructor will be called, but since its private, so it cannot be accessed from outside this class.
}

public class Ex2 {

	public static void main(String[] args) {
		// A2 obj2 = new A2(); // the error says :The constructor A2() is not
		// visible......thats all because of private access specifier.
		System.out.println("Im the second class of this program");
	}

} // if we make the constructor of a class 'private' , then we cannot instantiate
	// the class from outside.....because the private constructor is not visible
	// from outside this class.
