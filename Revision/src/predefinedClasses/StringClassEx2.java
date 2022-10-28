package predefinedClasses;

public class StringClassEx2 {

	public static void main(String[] args) {
		StringClassEx2 obj1 = new StringClassEx2();
		System.out.println("obj1 is:" + obj1);// Here the output will be in the form of
												// 'fullyqualifiedclassname@hexadecimaladdress'
		
		String obj2=new String("Bengaluru is IT  hub");
		System.out.println("obj2 is :"+obj2.toString());
		System.out.println("obj2 content count is :"+obj2.length());
		String obj3=new String(" "); // null
		System.out.println("obj3 is:"+obj3.toString());  // output is null.

		
		

	}

}
