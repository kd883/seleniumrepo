package abstract_keyword;

abstract class demo1 { // 50% abstract class.
	abstract void print(); // this is abstract method/incomplete.... without method body.

	void display() { // non-abstract/complete/concrete method.
		System.out.println("this is concrete method");
	}
}

abstract class demo2 { // 0% Abstract class.
	void display() {
		System.out.println("these are normal methods.");
	}

	void display2() {
		System.out.println("this is also a normal method.");
	}
}

abstract class demo3 { // 100% abstract class

	abstract void write(); // abstract methods do not specify body.

	abstract void read();

	abstract void learn();

}

class thar extends demo3 { // here, we have two options: either to make the class thar abstract, or to
	int a = 10;

	// implement the complete versions of the abstract methods of class demo3.
	void write() { // the abstract method of class demo3 have been implemented as concrete methods.
		System.out.println("write properly");
	}

	void read() {
		System.out.println("read properly");

	}

	void learn() {
		System.out.println("learn properly");
	}// this is called overriding.........which is must while inheriting an abstract
		// class in a concrete method.
		// When a concrete child class is inheriting an abstract parent class , then all
		// the abstract methods of the parent class must be overridden and made concrete
		// methods in the child class.
		// subclass needs to override all the abstract methods of the parent class.

	void compile() {
		System.out.println("check if u can call this using reference of class 'demo3' ");
	}
}

public class Ex1 {

	public static void main(String[] args) {

		thar obj3 = new thar(); // we can create object of class thar...which is concrete class
		demo3 obj4 = new thar(); // we can create object of child class and keep reference of parent
									// class.....this is allowed.
		obj4.learn(); // here, we are calling the overridden methods of class demo3 by using reference
						// of the class 'demo3'.
		obj4.write();
		obj4.read();
		// but we cannot call void compile method of class 'thar' through this reference
		// variable.

		// demo1 obj = new demo1(); // its showing error.....cannot instantiate the type
		// demo1....because its an
		// abstract class.

	}

}
