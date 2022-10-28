package interface_;
//THIS IS THE CASE OF MULTIPLE INHERITANCE.....USING INTERFACES.
// Interface declaration by first user.
	interface drawable{
		int salary=25000; // complier will write it as 'public static final int salary=25000'.
		void draw(); // complier will write it as 'public abstract void draw()''
		// this method cannot have body because its inside an interface.
	}
	// Implementation by second user.
	class rectangle implements drawable{
		public void draw() { 
			System.out.println("Drawing Rectangle");
		}
	}
	class circle implements drawable{
		public void draw() {
			System.out.println("Drawing Circle");
		}
	}
public class Ex1 {

	public static void main(String[] args) {
		rectangle obj1=new rectangle();
		obj1.draw();
		circle obj2=new circle();
		obj2.draw();
		System.out.println("calling the salary variable from drawable interface:"+drawable.salary);
		 // using the class name.....as the int salary variable is by default public static. 
		drawable obj3=new circle(); // reference of drawable interface and object of circle class.
		obj3.draw();
		drawable obj4=new rectangle ();// reference of drawable interface and object of rectangle class.
		obj4.draw();

	}

}
