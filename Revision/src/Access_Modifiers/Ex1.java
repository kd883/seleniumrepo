package Access_Modifiers;
	
	class A{
		private int data=40; // private access modifier
		protected double count=34.56; // protected access modifier
		int rollno=235; // default access modifier
		public int aadhar=39;
		private void msg() {
			System.out.println(" Hello everyone ");
			
		}
		
	}

public class Ex1 {
	private static int accno=123768;
	public static void main(String[] args) {
		System.out.println(Ex1.accno);
		A obj1=new A();
		// System.out.println(A.data); // the error message is: The field A.data is not visible....thats because of private access modifier.
		// A.msg(); // the error message is : // the method msg() from the type A is not visible...thats because of private access modifier.
		
		System.out.println(obj1.aadhar); // public can be accessed outside its own class.
		System.out.println(obj1.count); // protected can also be accessed outside its own class.
		System.out.println(obj1.rollno); // default can also be accessed outside its own class.
		
		
	} // A Private member is accessible only within the same class.

}
