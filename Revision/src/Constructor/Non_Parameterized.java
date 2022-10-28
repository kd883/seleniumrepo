package Constructor;
class B{
	int i=10;
	B(){    // this is non-parameterized constructor
		System.out.println("this is the constructor of class B");
		i=25;
	}
}

public class Non_Parameterized {
	
	public static void main(String[] args) {
		System.out.println("Main () method of class Non_Parameterized has started");
		B obj1=new B();
		System.out.println("Class B's global variable i="+obj1.i);
		B obj2=new B();
		System.out.println("Class B's gobal variable i="+obj2.i);
		System.out.println("Main() method of class Non_Parameterized ends here");
	}

}
// this is the example of non-parameterized constructor.
