package arrays;

public class Ex7 { 

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{5,4,3},{6,7,8,9,0}}; // Each entry is one row.
		// Using for loop to print all the elements of array 'arr'.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+ "  ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		char arr1[][]= {{'a','s','d','e'},{'q','w','e','r','t','y'},{'f','g'}};
		// Using for loop to print all the elements of array 'arr1'.
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+ "  ");
			}
			System.out.println();
		}
		
	}

}
