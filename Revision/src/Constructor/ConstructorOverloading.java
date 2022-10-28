package Constructor;
	

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("Zero Parameterized constructor");
	}
	ConstructorOverloading(int a){
		System.out.println("Parameterized constructor having int parameter");
	}
	ConstructorOverloading(double s){
		System.out.println("Parameterized constructor having double parameter");
	}
	ConstructorOverloading(int a, double b, int d){
		System.out.println("Parameterized constructors having int, double, int parameters");
	}
	ConstructorOverloading(double w, int e, int r){
		System.out.println("Parameterized constructor having double, int , int parameters");
	}
	public static void main(String[] args) {
		ConstructorOverloading obj1=new ConstructorOverloading();
		ConstructorOverloading obj2=new ConstructorOverloading(5);
		ConstructorOverloading obj3=new ConstructorOverloading(4.5);
		ConstructorOverloading obj4=new ConstructorOverloading(5,5.55,6);
		ConstructorOverloading obj5=new ConstructorOverloading(4.56,3,2);

	}

}
