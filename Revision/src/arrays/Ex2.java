package arrays;

public class Ex2 {

	public static void main(String[] args) {
		int[] array1 = new int[3]; // first syntax.
		array1[0] = 12;
		array1[1] = 32;
		array1[2] = 89;

		// now , we will check the length of this array,find some element based on index
		// and print all the elements.
		System.out.println("length of this array is :" + array1.length);
		System.out.println("locating element at 0th index :" + array1[0]);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]); // don't use dot(.) operator
		}

		System.out.println("******************************************");
		double[] marks = { 89.45, 45.67, 98.78, 99, 100 };
		// this is the second way of declaring an array.
		// we will again perform similar operations of finding the length , locating an
		// element, and printing all the elements of this array.
		System.out.println("Length of this array is :"+marks.length);
		System.out.println("Element at 2nd index(third element) is :"+marks[2]);
		for(int i=0;i<marks.length;i++) {
			System.out.println( marks[i]);
		}
	}

}
