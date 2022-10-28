package this_statement;

class A2 {
	A2() {
		this(20.5); // its just 'this()' and not this.()
		System.out.println("Hellow zero parameterized constructor");
	}

	A2(double a) {
		this(35);
		System.out.println("Hellow double parameterized constructor : "+a);
	}

	A2(int s) {
		System.out.println("Hellow int parameterized constructor : "+s);
	}
}

public class Ex2 {

	public static void main(String[] args) {
		A2 obj1 = new A2(); // this call is going to the zero parameter constructor .......line no 4.
		// in the zero para constructor, complier finds this() statement making a call
		// to the double para constructor.
		// when compiler reaches inside double para constructor, it finds another
		// this() statement making a call to the int para constructor.
		// then complier goes inside the int para constructor and executes it....and
		// remainig parts will also be executed sequentially.

	}

}
