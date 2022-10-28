package inheritance;

class A2 {
	void display() {
		System.out.println("this is the case of multiple inheritance.");
	}
}

class B2 {
	void dispaly() {
		System.out.println("this is also the case of multiple inheritance.");
	}
}
/* class C2 extends A2,B2{ // java does not supports 'multiple' inheritance.
	C2(){
		super(); // here , the super() statement is confused whether to call the constructor of class 'A2' or of class 'B2'. 
	}                // because of this confusion or ambiguity , java doesn't supports multiple inheritance.
 }*/

public class Ex4 {

	public static void main(String[] args) {

	}

}
// java doesn't supports multiple inheritance using classes.
// java supports multiple inheritance using interface.
// Case of multiple inheritance, which is not supported by java.
// Multiple inheritance: When a child class tries to inherit the properties of more than one parent classes simultaneously, its called multiple inheritance.
// Because of this confusion or ambiguity, java doesn't supports multiple inheritance.