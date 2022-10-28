package interface_;

interface animal {
	int age = 20; // by default public,static and final.

	public void animalsound();

	public void sleep();
}

interface reptile {
	void colour(); // by default, public.
}

class pig implements animal {

	@Override
	public void animalsound() {
		System.out.println("weeeeeeeeee....weeeeeeeeee");
	}

	@Override
	public void sleep() {
		System.out.println("Zzzzzzzzzzz....Zzzzzzzzzzzzzzzz");
	}

}

public class Ex6 extends pig implements reptile { // here, class Ex6 is inheriting interface 'pig' as well as interface
													// 'reptile.

	public static void main(String[] args) {
		pig obj1 = new pig();
		obj1.animalsound();
		obj1.sleep();
		Ex6 obj2=new Ex6();
		obj2.colour();

	}

	@Override
	public void colour() {
		System.out.println("black black black black");
	}

}
