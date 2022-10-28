package ConstantVariable;

public class Ex1 {

	public static void main(String[] args) {
		int age=15;
		System.out.println("age is:"+age);
		age=10;
		System.out.println("age is:"+age);
		age=35;
		System.out.println("age is:"+age);
		age=29;
		System.out.println("age is:"+age);
	}

}
// here , the value of in age is constantly being changed.
// we can use 'final' keyword while declaring the variable'age' and make its value constant.
// we cannot change the value of a variable declared as final .....if we try to do so, it will throw a compile time error.
