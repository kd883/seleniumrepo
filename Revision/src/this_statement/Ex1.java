package this_statement;
	
	class A1 {
		A1(){
			System.out.println("Hellow zero parameterized constructor.");
		}
		A1(double a){
			System.out.println("Hellow double parameterized constructor.");
		}
		A1(int s){
			System.out.println("Hellow int parameterized constructor.");
		}
	}
public class Ex1 {

	public static void main(String[] args) {
		A1 obj1=new A1(); // calling constructor A1() by creating object 'obj1'.
		A1 obj2=new A1(20.4);// calling constructor A1(double a) by creating object 'obj2'.
		A1 obj3=new A1(89); // calling constructor A1(int s) by creating object 'obj3'.
	}

}
// 'this()' statement's use can negate the requirement of creating three objects for calling the three constructors. 
// we will see this in the next program.