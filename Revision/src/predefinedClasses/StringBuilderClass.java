package predefinedClasses;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder obj1=new StringBuilder("Say hello to the world brothers ");
		obj1.append("& sisters");
		System.out.println(obj1);
		
		obj1.reverse();
		System.out.println(obj1);
		
		StringBuilder obj2=new StringBuilder("Hello Java");
		System.out.println(obj2);
		
		StringBuilder obj3=new StringBuilder("Hello Java");
		System.out.println(obj3);
		
		System.out.println(obj1.equals(obj2));// In case of StringBuffer and StringBuilder classes, .equals() method compares the operands based on their address.
		System.out.println(obj1==obj2);// This also compares the operands based on their addresses.
		// We don't have any method to compare the object values in StringBuffer and StringBuilder classes.
		//If we need to do so,then , we need to convert StringBuffer and StringBuilder objects into String class and then compare using .equals() method.		

		
		System.out.println((obj2.toString()).equals(obj3.toString()));//Converting from StringBilder to String class for comparison.
		
		
		
	}

}
