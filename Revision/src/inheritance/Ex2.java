package inheritance;

class fruit {
	fruit() { // default constructor of class 'fruit'.
		System.out.println("fruit class default constructor.");
	}
	public void taste() {
		System.out.println("taste of fruit is great");
	}
}

class apple extends fruit {
	apple() {
		super(); // this is the default super() statement of this constructor which enables
					// inheritance between classes 'apple' and 'fruit' by calling the default
					// constructor of parent class 'fruit'.....even if we don't write it explicitly,
					// the complier will write it.
		// but, if the constructor of the parent class is parameterized, then we need to
		// explicitly write the super() statement in the constructor of class 'apple'
		// having same type of parameter as that of the constructor of the parent class.
		System.out.println("apple class default constructor.");
	}
	public void shape() {
		System.out.println("shape if apple is like apple.");
	}
}

public class Ex2 {
	
	public static void main(String[] args) {
  apple obj=new apple();
  obj.taste(); //  accessed from class 'fruit'.
  obj.shape();// accessed from class 'apple'.
	}

}
