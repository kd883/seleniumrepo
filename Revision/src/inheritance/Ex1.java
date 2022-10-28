package inheritance;
 
class A1{ // super class/ parent class/inherited class/base class.
	static int a=10;
	int b=29;
	double c=43.6;
}
class B1 extends A1{ // B1 is child class and A1 is parent class(inherited class)
	// this class will also have a virtual copy of the non-static members of class A1...ie
	// int b and double c will be present in this class virtually.
	
	static int e=21;
	int r=32;
	double g=45.5;
}
	class C1 extends B1{ // C1 is child class and B1 is parent class or inherited class.
		// this class will have virtual copies of non-static members from class 'A' as well as class 'B'.
		// i.e we will have int b, double c, int r and double g.
		static int y=29;
		int u=38;
		double j=38.7;
	}

public class Ex1 {

	public static void main(String[] args) {
		System.out.println("accessing static members of classes A,B and C through class name.");
		System.out.println("static member of class A:"+A1.a);
		System.out.println("static member of class B:"+B1.e);
		System.out.println("static member of class C:"+C1.y);
		System.out.println("Now , we are going to access all the non-static members of all the classes using one single object created for class C1");
		System.out.println("This is possible all because of 'Inheritance', which makes availabe a virtual copy of the parent class into the child class.");
		C1 obj=new C1(); // creating an object of class C1 and then accessing all the non-static members of classes A, B and C through it.
		System.out.println("accessing int b of class A1:"+obj.b);
		System.out.println("accessing int b of class A1:"+obj.c);
		System.out.println("accessing int b of class B1:"+obj.r);
		System.out.println("accessing int b of class B1:"+obj.g);
		System.out.println("accessing int b of class C1:"+obj.u);
		System.out.println("accessing int b of class C1:"+obj.j);

	}

}// inheritance : when a child class inherits the properties of a parent class, its called inheritance. its a concept of OOPs.
//representation:
//child class extends parent class{
//}
//inheritance is achieved by using super() statement.
// super() statement is by default present in all default constructors.
// super() statement is used to call the constructor of the parent class and thus enable inheritance.
// super() statement must be the first statement of a constructor....thus we cannot use this() and super() together.
