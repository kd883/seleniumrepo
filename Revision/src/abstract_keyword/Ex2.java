package abstract_keyword;

	abstract class shape{
		abstract void draw();
	}
	class rectangle extends shape{
		protected void draw() { // overridden method.
			System.out.println("im drawing a rectangle.");
		}
	}
	class circle extends shape{
		public void draw() { // overridden method.
			System.out.println("im drawing a cirlce.");
		}
	}

public class Ex2 {

	public static void main(String[] args) {
		shape obj=new rectangle(); // reference of parent class 'shape' and object of child class rectangle.
		// the above statement is also an example of heterogeneous statement.
		obj.draw();
		shape obj2=new circle(); // reference of parent class 'shape' and object of child class circle.
		// the above statement is an example of heterogeneous statement.
		obj2.draw(); 
		
	}

}
