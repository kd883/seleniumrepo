package arrays;

	/** declaration: 
	 * int a[];
	 *  initialization:
	 *  a=new int[5];
	**/
public class Ex1 {

	public static void main(String[] args) {
		int a[]=new int[5];// declaration and instantiation done together.
		// at this stage, the memory locations of this array 'a' are initialized by the default value of int type....i.e '0'.
		
		// so if use sysout statement to access some element, the output will be 'o'.
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		// now, lets initialize the array elements with some values.
		a[0]=29;
		a[1]=43;
		a[2]=56;
		a[3]=45;
		a[4]=98;
		// now , if we sysout the elements, the results will be:
		System.out.println("***************After Initialization*****************");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println();
		// arrayName.lenght() is a predefined method used to check the size of the array....the number of elements.
		System.out.println("Length of array 'a' is :"+a.length); 
		System.out.println("**********************************************");
		
		// Every time, we cannot print all the elements of an array individually....so we will use for loop for this purpose.
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
			
		}
		System.out.println("*********Output of For each loop*********");
			
		
	// now, we will use for each loop / enhanced for loop for printing the elements of the array......
				for(int num:a) {
					System.out.println(num);
				}
				
				System.out.println("*********Output of char array using for each loop***********");
				
				char[]  getarray=new char[] {'a','b','c','d'};
				for(char num:getarray) {
					System.out.println(num);
				}
				
				
				
		 // how to execute a java program line by line .......check it.
		
		
		
		
		
		

	}

}
