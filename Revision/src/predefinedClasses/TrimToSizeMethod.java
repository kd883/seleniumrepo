package predefinedClasses;

public class TrimToSizeMethod {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Last few days");
		System.out.println("Length :"+s1.length());
		System.out.println("Capacity :"+s1.capacity());
		s1.trimToSize();
		System.out.println("Length :"+s1.length());
		System.out.println("Capacity :"+s1.capacity());
	}

}// trimtosize() method removes the additional spaces which are present in the default capacity.
