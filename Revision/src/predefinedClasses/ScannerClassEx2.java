package predefinedClasses;

import java.util.Scanner;

public class ScannerClassEx2 {

	public static void main(String[] args) {
		String s = "this is the different chapter of my life in which i am learning java to get a job , and to switch my life into next gear. There are many pure souls here as well, like all the other chapters of my life. They are putting their best effort to help me and many souls like me to find their next track. 20 days remain for this class to get over and then all will depend on my performance in the interviews.....so im doing my work and hoping for the best.......and this time it will happen the way i want...so no worries at all.";
		//String s="";
		//Now, creating a scanner object and passing the String 's' in it.
		Scanner obj1=new Scanner(s);
		// Check if Scanner has a token by using hasNext() method.
		System.out.println("Boolean result:"+obj1.hasNext());
		// Now, using nextLine() method, we will print the string.
		System.out.println("String is:"+obj1.nextLine());
		obj1.close();
		
		
		System.out.println("Enter your details:");
		Scanner obj2=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=obj2.next();
		System.out.println("Name is :"+name);
		System.out.println("Enter your age:");
		int age=obj2.nextInt();
		System.out.println("Age is :"+age);
		System.out.println("Enter your salary:");
		double salary=obj2.nextDouble();
		System.out.println("Salary is :"+salary);
		obj1.close();
	}

}
