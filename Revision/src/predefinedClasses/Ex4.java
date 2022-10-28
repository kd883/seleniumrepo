package predefinedClasses;
class testsample {
	void callme() {
		System.out.println("hello");
	}

	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

public class Ex4 extends testsample {
	/**static int last_roll=100;
	int roll_no;
	// constructor.
	Ex4(){
		roll_no=last_roll;
		last_roll++;
	}**/
	public int hashCode() {
		return 404;
	}
	@Override
	public String toString() {
		return "Basic core java";
	}

	public static void main(String[] args) {
		Ex4 obj1=new Ex4();
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		testsample obj2=new testsample();
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		
	}

}// Its toString() and not tostring().
// and its hashCode() and not hashcode().
