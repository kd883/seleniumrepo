package final_keyword;

public class Ex2 {
	final int home;

	// final int home=70;
	Ex2() {
		home = 70;
		System.out.println(home);
	}

	public static void main(String[] args) {
		Ex2 obj = new Ex2();
		System.out.println(obj.home);
		System.out.println(*****************);
	}

}
// usually , final variables must be declared and initialized simultaneously.
// but in case if the 'final' variable is a global non-static variable, then we can declare it and use a constructor to initialize its value as done in this program. 
// a global non-static variable can be initialized by using a constructor.