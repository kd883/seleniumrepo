package Constructor; // user defined constructor

public class Ex3 {
	int age;
	double salary;
	Ex3(){ // user defined, zero parameterized constructor , having just a body.
		System.out.println("this user defined zero parameterized constructor starts from here");
		 age=25;
		System.out.println("this user defined zero parameterized constructor ends here");
	}

	public static void main(String[] args) {
		Ex3 obj=new Ex3();
		System.out.println(obj.age);
		System.out.println(obj.salary);
	}

}
