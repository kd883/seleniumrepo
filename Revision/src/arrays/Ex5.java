package arrays; //Finding min and max elements of an array.
	
class operations {
	// Creating a method which receives an array as a parameter and finds minimum
	// element of the array.
	static void min(int arr[]) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if (min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("The minimum element in array is :"+min);
		
	}
	
	static void max(int arr2[]) {
		int max=arr2[0];
		for(int i=1;i<arr2.length;i++) {
			if(max<arr2[i]) {
				max=arr2[i];	
				}
		}
		System.out.println("The maximum element in array is :"+max);
	}
}
public class Ex5 {

	public static void main(String[] args) {
		int a[]= {23,34,45,56,67,65}; // declaring and initializing an array.
		operations.min(a);
		operations.max(a);
		
		
		}
	}


