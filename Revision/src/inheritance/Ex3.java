package inheritance;

class fourwheeler {
	// default constructor.
	public void wheels() {
		System.out.println("I have four wheels.");
	}
}

class car extends fourwheeler { // child class of fourwheeler class and parent of maruti class.
	// default constructor.
	public void type() {
		System.out.println("i'm a car.");
	}
}

class maruti extends car { // child class of 'car' class.
	// default constructor.
	public void company() {
		System.out.println("I'm maruti.");
	}
}

public class Ex3 {

	public static void main(String[] args) {
		maruti obj = new maruti(); // object of child class 'maruti'....which is used to access all the non-static
									// members of both the parent classes from this child class owing to
									// inheritance.
		obj.wheels();
		obj.type();
		obj.company();
	}

}
// this is an example of multilevel inheritance.
// the default constructors are there.....written by the compiler but are hidden.
// the default super() statements are also there in their respective default constructors......also written by the compiler.