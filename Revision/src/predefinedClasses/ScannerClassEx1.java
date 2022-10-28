package predefinedClasses;

import java.util.Scanner;

public class ScannerClassEx1 {

	public static void main(String[] args) {
		// The use of scanner class is to eliminate the need of hard coding and to
		// facilitate user to pass values of members of a class at run-time.
		// Earlier , we used to hard code like this.....

		// int a=12;
		// double salary=234567.40;
		// String name="Bengaluru";

		Scanner obj1 = new Scanner(System.in); // This is the way of object creation for scanner class.
		int age;
		double salary;
		String name;
		boolean valid;
		// Initialization of variables using scanner class.
		System.out.println("Enter the value of age:");
		age = obj1.nextInt(); // For taking the input of age variable...we use .nextInt() method(an inbuilt
								// method of scanner class).
		System.out.println("Enter the salary:");
		salary=obj1.nextDouble(); // For taking the input of salary variable, we use .nextDouble() method(an inbuilt method of scanner class).
		System.out.println("Enter name:");
		name=obj1.next();// for taking the input of name variable, we use .next() method.
		System.out.println("Enter the valid condition( True/False):");
		valid=obj1.nextBoolean();//To take the input of valid variable, we use .nextBoolean() method.
		System.out.println("Age= "+age);
		System.out.println("Salary= "+salary);
		System.out.println("Name is :"+name);
		System.out.println("Valid condition is: "+valid);
		
		int num1,num2;
		System.out.println("Enter num1: ");
		num1=obj1.nextInt();
		System.out.println("Enter num2: ");
		num2=obj1.nextInt();
		char op;
		System.out.println("Enter operator : ");
		op=obj1.next().charAt(0);// two dot operators.
		System.out.println("Addition of two numbers: "+addnumber(op,num1,num2));
		
	}
	static int addnumber(char op,int num1,int num2) {
		if(op=='+') {
			return num1+num2;
		}
		else {
			return 0;}
	
		}
	}


