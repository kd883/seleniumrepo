package ConstantVariable;

public class Ex2 {

	public static void main(String[] args) {
		final int age=20; // declaring the variable using final keyword to make its value constant.
		System.out.println("age is:"+age);
		//age=29; // error....because the value of age cannot be changed now.
		System.out.println("age is:"+age);
		
	}// so once we declare a variable using final keyword, its value cannot be modified.

}//error at line no 8: final local variable 'age' cannot be assigned.
