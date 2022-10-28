package arrays;  // Sum and average of array elements.

public class Ex4 {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,78,54,0,-23,-54};
		int sum=0;
		double avg;
		
		// Accessing all the array elements and adding them in 'sum' variable.
		for(int arr:array) {
			sum=sum+arr;
			
		}
		int length=array.length;
		avg=sum/length;
		System.out.println("Sum of array elements is :"+sum);
		System.out.println("Average of array elements is :"+avg);
		
	}

}
