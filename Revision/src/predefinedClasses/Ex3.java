package predefinedClasses;

class demo123 {
	void display() {
		System.out.println("I am display() method of class demo123.");
	}

	/**public int hashCode() {
		return 0;
		// TODO Auto-generated method stub
	}**/
}

public class Ex3 extends demo123 {
	static int last_roll = 190;
	int roll_no;

	// Constructor.
	Ex3() {
		roll_no = last_roll;
		last_roll++;
	}

	@Override
	void display() {
		System.out.println("I am display of another class.");
	}

	@Override
	public int hashCode() { // here, as hashCode() method has been overridden, so the output of this method
							// will be different than the standard output.
		return roll_no;
	}

	public static void main(String[] args) {
		Ex3 obj = new Ex3();
		System.out.println(obj);
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		obj.display();

		demo123 obj2 = new demo123();// obj2 is an object of demo123 class
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());// here, hashcode() method will give its normal value and not overridden
											// value.....because here its being called through the object of class
											// demo123.....and the haschcode() method has been overridden in Ex3 class.
	}

}
