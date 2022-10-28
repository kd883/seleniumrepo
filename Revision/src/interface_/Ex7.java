package interface_; // new feature of java_8, where we can include complete/concrete methods within interface.
	
	interface drawable3{
		void draw(); // traditional abstract method.
		default void msg() {
			System.out.println("Default method");				
			}
		static int cube(int x) {
			return x*x*x;
		}// default static int cube()..... can't be written.....and  private void test().....can't be written.
		
		}
	
	class rectangle3 implements drawable3{

		@Override
		public void draw() {
			System.out.println("Drawing rectangle");
		}
		
	}
	

public class Ex7 {

	public static void main(String[] args) {
		// Ex7 obj1=new rectangle3();
		drawable3 obj2=new rectangle3();
		obj2.draw();
		obj2.msg(); // shows 'd' in the selection box.
		System.out.println(drawable3.cube(3)); // since this is a static method which can be called using the class name.
		
	}

}
