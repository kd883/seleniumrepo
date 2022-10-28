package this_keyword;

public class Ex1 {

	static int age = 30;
	int emp_id = 10;

	void display() {
		int emp_id = 20;
		System.out.println("employee id(non-static local variable) is:" + emp_id);
		System.out.println("employee id(non-static global variable) is:" + this.emp_id);
	}

	public static void main(String[] args) {
		int age = 28;
		System.out.println("age(local non-static variable) is:" + age); // we are accessing the local variable 'age'.
		System.out.println("age(static global variable) is:" + Ex1.age);// accessing the static global variable 'age'
																		// through class name.
		Ex1 obj=new Ex1();
		obj.display();
		System.out.println("accessing the static global int variable:"+Ex1.age);
		System.out.println("accessing the non-static global emp_id variable:"+obj.emp_id);
		
	}

}
