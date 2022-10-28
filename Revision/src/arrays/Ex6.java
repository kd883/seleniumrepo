package arrays;

class Testreturnarray {

	static int[] getarray() { // This is a method with array as return type and 'getarray' as its name.
		return new int[] { 10, 20, 30, 40, 50, 60 }; // return type of this method.

	}
}

public class Ex6 {

	public static void main(String[] args) {
		int arr[] = Testreturnarray.getarray(); // Here, we are assigning the value returned by getarray() method into
												// array 'arr'.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
