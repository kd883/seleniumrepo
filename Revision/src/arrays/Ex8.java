package arrays;

public class Ex8 {

	public static void main(String[] args) {
			
		// Declaring and initializing a 2d array.
		int[][] arr=new int[3][3]; // Declaration of 3 by 3 array.
		System.out.println("Array size is :"+arr.length);
		arr[0][0]=14;
		arr[0][1]=21;
		//arr[0][2]=32;
		arr[1][0]=12;
		arr[1][1]=78;
		arr[1][2]=45;
		arr[2][0]=43;
		arr[2][1]=36;
		arr[2][2]=90;
		for(int i=0;i<arr.length;i++) { //Gives row count.
			for(int j=0;j<arr.length;j++) { // Gives column count of current row.
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
