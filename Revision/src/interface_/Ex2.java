package interface_;

interface Printable {
	int age = 30;

	void print();
}

interface Showable {
	public void show();
}

public class Ex2 implements Printable, Showable { // case of multiple inheritance supported by java through interfaces.
	public static int age = 45;

	public void print() {
		System.out.println("hellow, print");
	}

	public void show() {
		System.out.println("hellow, show");
	}

	public static void main(String[] args) {
		Ex2 obj1 = new Ex2();
		obj1.print();
		obj1.show();
		System.out.println(Printable.age);
		System.out.println(Ex2.age);
		System.out.println(age); // accessing age directly from this static member...because....one static
									// member( here method) can access another static member(here int age) if they
									// are available inside the same class.
	}

}
