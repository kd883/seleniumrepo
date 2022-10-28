package predefinedClasses; //Static reference variable example 1.
class demo11{
	void display() { //non-static method 
		System.out.println("Demo11 class display method.");
	}
	void callme() { //non-static method
		System.out.println("Demo11 class call me method.");
	}
}

public class SystemClassEx2 {
	static int age=30;
	final static demo11 d1=new demo11();
	static void calling() {
		System.out.println("Calling......");
	}
	void test() {
		System.out.println("SystemClassEx2 class test method");
		//class.static-reference_variable.non-static_method
	}
	

	public static void main(String[] args) {
		SystemClassEx2.d1.display(); // this calling is same as ' System.out.println 'statement.
		//class.static-reference_variable.non-static_method
		
		SystemClassEx2.d1.callme(); //this calling is same as 'System.out.println' statement.
		//class.static-reference_variable.non-static_method

	}

}
