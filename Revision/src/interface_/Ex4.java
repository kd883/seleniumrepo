package interface_;

interface printable_ {
	void print();
}

interface showable_  {
	void print();
}

public class Ex4 implements printable_, showable_ {
	

	public static void main(String[] args) {
		Ex4 obj1 = new Ex4();
		obj1.print();
		// printable obj2=new printable();// this was the mistake i was doing.....i was
		// trying to instantiate(create an object for the interface).
		printable_ obj2=new Ex4();
		obj2.print();
		showable_ obj3=new Ex4();
		obj3.print();
	}

	@Override
	public void print() {
		System.out.println("hello......hello......");
	}

}
