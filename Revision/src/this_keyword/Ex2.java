package this_keyword;

public class Ex2 {
	static int age; // static global variable
	int salary; // non-static global variable
	int empid;

	void display(int salary) {
		System.out.println("salary(local variable) is:" + salary);
		System.out.println("salary(global variable) is:" + this.salary);
		this.salary = 35000;
		System.out.println("salary(global variable) is:" + this.salary);
	}

	public static void main(String[] args) {
		int age = 29;
		System.out.println("age(local variable) is:" + age);
		System.out.println("age(static global variabel) is:" + Ex2.age);// here we are accessing static global variable
																		// through class name.
		int salary = 34000;
		int empid = 20;
		System.out.println("salary(local) is:" + salary); // we can use this keyword only in non-static methods.
		// to access global non-static variables ( int salary and int empid), we need to
		// create objects and then access the global variables through the object.
		Ex2 obj1=new Ex2();
		System.out.println("accessing global non-static variable int salary:"+obj1.salary);
		System.out.println("accessing global non-static variable int empid:"+obj1.empid);
		obj1.display(60000);
	}

}
