package predefinedClasses;

public class Ex2 extends demo {
	static int last_roll = 100;
	int rollno;

	Ex2() { // constructor.
		rollno = last_roll;
		last_roll++;
	}

	public static void main(String[] args) {
		Ex2 obj1 = new Ex2();
		System.out.println(obj1);
		System.out.println(obj1.toString());// String representation of an object.
		System.out.println(obj1.hashCode());// It returns the hashcode value of an object.
		demo obj2 = new demo();
		System.out.println(obj2);
		System.out.println(obj2.toString());// String representation of an object.
		System.out.println(obj2.hashCode());// It returns the hashcode value of an object.
		// hashcode is the integer form of hexadecimal address of an object.
	}

}// toString() method is a public method and provides the string representation
	// of an object.
// This representation is provided in the form of :'fullyqualifiedclassname@hexadecimaladdress.
// fullyqualifiedclassname=packagename.classname
//hashcode()-this method converts the hexadecimal address into integer form.
//equals()-this is also a public method and compares and checks whether two objects are equal or not....and returns boolean value.

//Object class is the super most class of java....i.e ..directly or indirectly, all classes in java inherit the 'Object class'.