package predefinedClasses;

public class StringClassEx1 {

	public static void main(String[] args) {

		StringClassEx1 c1 = new StringClassEx1();
		System.out.println("c1 is :" + c1);
		String s1 = "Mumbai"; // Object creation for the String class using literals, so this object will be
								// stored in the constant pool part of the memory.
		String s2 = "Mumbai";// same as above. No duplicates are allowed in the constant pool area.
		String s3 = "Bangalore";// same as above. Duplicates not allowed in constant pool area.
		System.out.println("s1 is :" + s1); // Printing "Mumbai".
		System.out.println("s2 is :" + s2);// Pointing to the same address as that of s1.
		System.out.println("s3 is :" + s3);// Printing "Bangalore".
		System.out.println("s1 char count is :" + s1.length());// This gives the no of characters in the String...here
																// ,its 6.
		System.out.println("s2 char count is :" + s2.length());// same as above.
		System.out.println("s3 char count is :" + s3.length());// same as above.....here the count is 9.

		/**
		 * Normally,we use '==' to compare the values of two operands and '.equals()' to
		 * compare the address of the two operands. But in case of String class, the use
		 * of these two methods gets reversed. So, '==' operator is used to compare two
		 * operands based on their address and '.equals()' method compares the operands
		 * based on their values.
		 */
		System.out.println("Comparing s1 and s2 using .equals() method:" + s1.equals(s2));
		// Here, value is compared , which is same. So the output is true.

		System.out.println("Comparing s1 and s2 using == operator:" + (s1 == s2));
		// Here, address is compared and as s1 and s2 are two objects having same value
		// by using literals, so there are no duplicates and both the objects, s1 and s2
		// point to the same memory location where "Mumbai" is stored, so the output
		// will be true.

		System.out.println("Comparing s1 and s3 using .equals() method:" + s1.equals(s3));
		// Here, value is compared, which is different for both the objects. So the
		// output is false.

		System.out.println("Comparing s1 and s3 using == operator:" + (s1 == s3));
		// Here, addresses of the values stored in s1 and s3 is compared. As they are
		// unique objects, so the memory locations will also differ and the output will
		// be false.

		String s4 = new String("Mumbai");// This statement creates two objects, one using new keyword and another using
											// the String literal("Mumbai").....but here , it wont be recreated in the
											// constant pool area because its already there and duplicates are not
											// allowed in this part of memory.

		// Creation of a new object using 'new' keyword, the values of such objects are
		// stored in heap (non-constant pool) area of the memory.

		System.out.println("s4 is :" + s4);// printing Mumbai. Duplicates are allowed in heap area of the memory, as
											// every time the 'new' keyword is used, new object is created(even if
											// duplicate).

		System.out.println("Comparing s1 and s4 using .equals() method:" + s1.equals(s4));
		// Comparing s1( Created using literals) and s4(Created using new
		// keyword).....equals() method compares the value in case of strings, so the
		// value, so the output will be true.
		System.out.println("Comparing s1 and s4 using == operator:" + (s1 == s4));
		// Comparing the addresses of the values held by objects s1 and s4. As they are
		// created by using two different method, the memory locations would differ and
		// hence the output is false.

		String s5 = new String("Mumbai");// Creating another object using new keyword. Ideally two objects would have
											// been created,but as "Mumbai" is already present in the constant pool and
											// no duplicates are allowed in this part of the memory, so only one object
											// will be created in the heap area of the memory and
											// "Mumbai goes to heap memory"
		System.out.println("s5 is :" + s5); // Printing Mumbai

		System.out.println("Comparing s4 and s5 using .equals() method:" + s4.equals(s5));
		// Comparison is based on value, so the ouput is'TRUE'
		System.out.println("Comparing s4 and s5 using == operator:" + (s4 == s5));
		// Comparison is based on the address of the values of s4 and s6. So the output
		// is false, as use of new keyword every time creates a new object(duplicates are
		// allowed in heap area of the memory).
		
		String s6 = new String("Hyderabad"); //Creating another object using new keyword( gets allocated to the heap area od the memory).
		
		System.out.println("s6 is :" + s6);// Printing Hyderabad.

		System.out.println("Comparing s1 and s6 using .equals() method:" + s1.equals(s6));
		// Comparison is on the basis of values of s1 and s6. The values differ, hence the output is 'false'.
		
		System.out.println("Comparing s1 and s6 using == operator:" + (s1 == s6));
		// Comparison is based on the addresses held by the values of s1 and s6. As they differ, so the output is 'false'.
	}

}
