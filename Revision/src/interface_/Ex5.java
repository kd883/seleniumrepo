package interface_;

	interface printable2{
		void print();
	}
	interface showable2 extends printable2{ // this is the case of multilevel inheritance.
		void show();
	}

public class Ex5 implements showable2 {
	

	public static void main(String[] args) {
		Ex5 obj1=new Ex5();
		obj1.print();
		obj1.show();
		printable2 obj2=new Ex5();
		obj2.print();

	}

	@Override
	public void print() {
		System.out.println("Hello");
	}

	@Override
	public void show() {
		System.out.println("welcome");
		
	}

}
