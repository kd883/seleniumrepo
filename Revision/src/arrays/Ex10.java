package arrays;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		int[] arr = {2,1,5,4,3};
		System.out.println("Printing original array :");
		for (int i : arr) {
			System.out.println(i);

		}
		System.out.println("Printing clone of array :");
		int[] clonearray = arr.clone(); // clone() method is a built in method.....and is used to create another array
										// ....that is, by using clone() method , we are assigning the values of already
										// existing array into a new array.
		// clone() method creates a true copy....exactly same.
		// whereas, using copyof() method , we can copy the existing elements and also
		// add some more space by increasing the size of new array.
		for (int i : clonearray) {
			System.out.println(i);
		}
		System.out.println("Are 'arr' and 'clonearray' both equal ?");
		System.out.println(Arrays.equals(arr, clonearray));// Built in method to compare and check if the two arrays are
															// equal.....compares the content of the two arrays.......
		int newcopiedarray[] = Arrays.copyOf(arr, arr.length); // Here, we can increase or decrease the size(length) of
																// the
																// newly created array......that is , we can copy
																// selective elements of the array as per our need.
		for (int i : newcopiedarray) {
			System.out.println(i);
		}
		System.out.println("*********************************");
		int newcopiedrangearray[] = Arrays.copyOfRange(arr, 0, 3); // By using this method, we can copy selective
		// elements of the array by specifying the index position...from and to...
		// output of copyofrange() method is 1(0th index),2(1st),3(2nd)...it does not
		// prints the element at 3rd index.

		for (int i : newcopiedrangearray) {
			System.out.println(i);
		}
		System.out.println("Comparing the two arrays, 'newcopiedarray' and 'newcopiedrangearray': "
				+ Arrays.equals(newcopiedarray, newcopiedrangearray));
		System.out.println("***********************************************");
		Arrays.sort(arr); // This predefined array sorts the elements of the array in ascending order and
							// stores them in the same array.
		System.out.println("Output of sorted array:");
		for(int i:arr) {
			System.out.println(i);
		}

	}

} // Arrays is a built in class in java.util package and has many predefined
	// methods like: clone(), equals(), copyof(), copyofRange().
