package predefinedClasses; // Concat operation using '+' and .concat() method.

public class StringClassEx6 {

	public static void main(String[] args) {
		String s1="Design your"+1234;
		System.out.println(s1);
		
		String s2=s1.concat("Purpose");
		System.out.println(s2);
		//String s3=s1.concat(null);System.out.println(s3); // Shows NullPointerException		
	}

}
