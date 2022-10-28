package arrays;

public class Ex3 {

	public static void main(String[] args) {
		// Creating an array.
		
		int[] DAV= {12,23,34,45,56,67};
		
		// now , we will be performing some operations on this array.
		
		System.out.println("Length of this array is : "+DAV.length);
		System.out.println("Accessing the fourth element(3rd index) :"+DAV[3]);
		
		// Now, we will use for loop to print all the elements of this array.
		System.out.println("Printing all the elements of array 'DAV':");
		for(int i=0;i<DAV.length;i++) {
			//System.out.println(DAV[i]);
			if(DAV[i]==45) {
				System.out.println(DAV[i]);
				break;
			} else {
				System.out.println("DAV is not 45");
			}

		}
		System.out.println("+++++++++++++++++");

		for(int a:DAV) {
			//System.out.println(a);
			if(a==45) {
				System.out.println(a);
				break;
			} else {
				System.out.println("DAV is not 45");
			}
		}
	}

}
