package predefinedClasses;

class demo{
	void display() {
		System.out.println("I am display().....");
	}
}

public class Ex1 extends demo {
	static int last_roll=100;
	int rollno;
	Ex1(){ // constructor.
		rollno=last_roll;
		last_roll++;
	}
	

	public static void main(String[] args) {
		Ex1 obj1=new Ex1();
		System.out.println(obj1);// Java complier writes ...>s.toString()..>string representation of an object..
		System.out.println(obj1.toString());
		demo obj2=new demo();
		System.out.println(obj2);
		demo obj3=new demo();
		System.out.println(obj3.toString());
		demo obj4=new Ex1();
		System.out.println(obj4);
	}

}// String representation: fullyqualifiedclassname@hexadecimaladdress.
//                                     packagename.classname@hexadecimaladdress.
