package predefinedClasses;

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer obj1 = new StringBuffer("Hello");
		System.out.println("Original StringBuffer value:" + obj1);

		obj1.append(" bro");
		System.out.println(obj1);

		obj1.insert(1, "qwert");
		System.out.println(obj1);

		obj1.replace(2, 5, "WWW");
		System.out.println(obj1);

		obj1.delete(0, 2);
		System.out.println(obj1);

		StringBuffer obj2 = new StringBuffer("Bengaluru is it hub, but it also needs to urbanize in a planned way.");
		obj2.reverse();// This method will directly reverse each character of this string,no such
						// method is available in String class.
		System.out.println(obj2);
		System.out.println(obj2.capacity());
		
		StringBuffer obj3=new StringBuffer();// To check the default capacity of StringBuffer class.(which is 16)
		System.out.println(obj3.capacity());
		
		obj3.append("Hello");
		System.out.println("Say "+obj3);
		System.out.println(obj3.capacity());
		obj3.append("Java is simple to learn");
		System.out.println("Result after appending :"+obj3); // Formula for expansion of capacity is:(old capacity*2)+2.
		System.out.println(obj3.capacity());
		
		obj3.append("You see me");
		System.out.println("Result after appending :"+obj3);
		// Formula for expansion of capacity is:(old capacity*2)+2.
		
		System.out.println(obj3.capacity());
		
		
		
		
	}

}

