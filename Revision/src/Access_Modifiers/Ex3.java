/** This is the example for default access specifiers.
 * 
 */
package Access_Modifiers;

/**
 * @author girish deo pandey
 *
 */
public class Ex3 {
	int accno=1234; // default access specifier.
	void display() { // default access specifier.
		System.out.println("account no is:"+accno);
	}

	
	public static void main(String[] args) {
		Ex3 obj1=new Ex3();
		obj1.display();
		System.out.println("Account no is:"+obj1.accno);
	}
}
	
	class Accessdefaultmembers{
		
		public static void main(String[] args) {
			Ex3 obj2=new Ex3();
			System.out.println("Accessing the default members of class Ex3");
			obj2.display();
			System.out.println("accessing the default int variable form class Ex3:"+obj2.accno);

		}
	
	}
