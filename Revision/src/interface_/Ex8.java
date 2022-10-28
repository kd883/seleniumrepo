package interface_;

interface A11 {
	void a(); // all these methods are by default public and abstract.

	void b();

	void c();

	void d();

}

abstract class B11 implements A11 {
	/**
	 * public void a() { // all these methods are virtually present inside class B11
	 * because of inheritance. } public void b(){ } public void c(){ } public void
	 * d()} }
	 **/
	public void c() {
		System.out.println("im adding body to this method");
	}

	public void e() {
		System.out.println("this is specific method of class B11");
	}
}

// now, we are creating sub-class of class B11.
class M11 extends B11 {

	@Override
	public void a() {
		System.out.println("im method a");

	}

	@Override
	public void b() {
		System.out.println("im method b");

	}

	@Override
	public void d() {
		System.out.println("im method d");

	}

}

public class Ex8 {

	public static void main(String[] args) {
		A11 obj1 = new M11();
		obj1.a();
		obj1.b();
		obj1.c();
		obj1.d();
		// when i have created the object of class M11 , can i call void e() ....because
		// its a method of class B11 which is inherited in M11.
	}

}
