package Access_Modifiers;

public class Ex4 {

	public static void main(String[] args) { // this class has been created to access the default members from Ex3, protected members of Ex5, and public members of Ex6.
		Ex3 obj1 = new Ex3();
		obj1.display(); // so, clearly, we are able to access the default members of another class Ex3
						// which is in this same package.
		System.out.println("accessing the default variable int accno :" + obj1.accno);
		// here again, we are able to access the default member of class Ex3 which is a
		// different class but in this very package.

		// here, we are trying to access the protected members of class Ex5.
		Ex5 obj2 = new Ex5();
		obj2.display();// we are successfully able to access the protected members of class 'Ex5' from
						// this another class within the same package.
		System.out.println("accessing the protected variable of class Ex5 :" + obj2.accno);
		
		// now checking for the accessibility of public members of Ex6.
		Ex6 obj3=new Ex6();
		obj3.print(); // successfully able to access the public member void print() from class Ex6 within this very package.
		System.out.println(obj3.rank); // same as above for Ex6.
	}

}
// So , we can say that, default members are accessible anywhere in the same package.

// Default members cannot be accessed from outside the package.....i.e from another package. 

// here, we also have accessed the protected members of class Ex5 successfully....which proves that, protected members of one class can be accessed from another class of the same package.
// we also checked the accessiblity of public members of another class 'Ex6' in this class within the same package.