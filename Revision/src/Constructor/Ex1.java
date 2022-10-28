package Constructor;

public class Ex1 {

	Ex1() {
		System.out.println("This is a zero-parameter constructor");
	}

	Ex1(char c) {
		System.out.println("This is a single parameter constructor");
	}

	Ex1(int a, double b) {
		System.out.println("This is a twin parameter constructor");
	}

	public Ex1(float a, int b) {
		System.out.println("This is a public constructor with two parameters");
	}

	private Ex1(int c, float v) {
		System.out.println("This is a private constructor with two parameters");
	}

	public static void main(String[] args) {
		Ex1 a1 = new Ex1();
		Ex1 a2 = new Ex1('r');
		Ex1 a3 = new Ex1(12, 20.5);
		Ex1 a4 = new Ex1(12.8f, 34);
		Ex1 a5 = new Ex1(12, 23.4f);

	}// if a constructor is written more than once in a class with different set of
		// parameters , then its called constructor overloading.....same as method overloading.

}
// compiler will call the constructors based on the parameters we enter along with the constructors while calling them.