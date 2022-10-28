package arrays;

public class Ex9 {

	public static void main(String[] args) {
		
		// Declaring and initializing a 2-d array.
		int[][] arr= {{1,2,3},{4,5},{6,7,8,9}};
		
		//Printing this 2-d array.
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		System.out.println("*************************");

		char[][] chararray= {{'a','b'},{'c','d','e','r'},{'q','w','e','r','t'}};
		// for printing thi sarray:
		for(int i=0;i<chararray.length;i++) {
			for(int j=0;j<chararray[i].length;j++) {
				System.out.print(chararray[i][j]);
			}
			System.out.println();
		}
	}

}		
