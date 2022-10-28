package Constructor;

public class Ex2 {
	int age;
	double salary;
	/** below is a default constructor that will be written by java complier at compile time.
	Ex2(){ // no parameters...no body....
		
	}**/
	
	
	public static void main(String[] args) {
		Ex2 a1=new Ex2(); // here Ex2() is the constructor ........
		System.out.println(a1.age); 
		System.out.println(a1.salary);
	}

}
