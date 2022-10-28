package Constructor;
class Ba{
	int i=10;
	Ba(int x){    // this is parameterized constructor.
		System.out.println("this is the constructor of class Ba");
		i=x;
	}
}

public class Parameterized {

	public static void main(String[] args) {
		System.out.println("Main () method of class Non_Parameterized has started");
		Ba obj1=new Ba(23);
		System.out.println("Class Ba's global variable i="+obj1.i);
		Ba obj2=new Ba(34);
		System.out.println("Class Ba's gobal variable i="+obj2.i);
		System.out.println("Main() method of class Non_Parameterized ends here");
		
	}

}
// this is the example of parameterized constructor.