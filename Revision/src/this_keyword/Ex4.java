package this_keyword;

public class Ex4 {
	int x;
	public Ex4(int x) { // constructor with parameter 'int x'
		this.x=x; // assigning the value of local variable 'x' into global variable 'x'
	}
	
	public static void main(String[] args) {
		Ex4 obj=new Ex4(5);
		System.out.println("Value of x(global variable) is :"+obj.x);
		
		
	}

}
