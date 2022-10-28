package Constructor;

class A{
	int i=10;
	A(){ // user defined constructor
		System.out.println("This is class A constructor");
	}
	void display() {
		System.out.println("I am display() method of class A");
	}
}
class X{
	int k=20;
	X(){ // user defined constructor
		System.out.println("This is class X constructor");
	}
	void display() {
		System.out.println("I am display() method of class X");
	}
}
public class Ex4 { // this class has no user defined constructor , so default constructor comes in action.
	void display() {
		System.out.println("I am the display() method of class Ex4 ");
	}
	
	public static void main(String[] args) {
		System.out.println("Main() of class Ex4 has started");
		A obj=new A();
		obj.display();
		X obj2=new X();
		obj2.display();
		Ex4 obj3=new Ex4();
		obj3.display();
		
		
		
		
	}

}
