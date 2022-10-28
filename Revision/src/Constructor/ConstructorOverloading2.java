package Constructor;

public class ConstructorOverloading2 {
	int age;
	double salary;
	ConstructorOverloading2(){
		System.out.println("Zero paramterized constructor started");
		System.out.println("Its having no parameters");
		System.out.println("Zero parameterized constructor ends");
	}
	ConstructorOverloading2(int a){
		System.out.println("int parameterized constructor starts");
		age=a;
		System.out.println("int parameterized constructor ends");
	}
	ConstructorOverloading2(double b){
		System.out.println("double parameterized constructor starts");
		salary=b;
		System.out.println("double parameterized constructor ends");
	}
	ConstructorOverloading2(int a, double b){
		System.out.println("int and double parameterized constructor starts");
		age=a;
		salary=b;
		System.out.println("int and double parameterized constructor ends");
	}
	public static void main(String[] args) {
		ConstructorOverloading2 obj1=new ConstructorOverloading2();
		System.out.println("Value of age in zero parameterized constructor:"+obj1.age);
		System.out.println("Value of salary in zero parameterized constructor:"+obj1.salary);
		
		ConstructorOverloading2 obj2=new ConstructorOverloading2(20);
		System.out.println("Value of age in int parameterized constructor:"+obj2.age);
		System.out.println("Value of salary in int parameterized constructor:"+obj2.salary);
		
		ConstructorOverloading2 obj3=new ConstructorOverloading2(30.5);
		System.out.println("Value of age in double parameterized constructor:"+obj3.age);
		System.out.println("Value of salary in double parameterized constructor:"+obj3.salary);
		
		ConstructorOverloading2 obj4=new ConstructorOverloading2(20,39.4);
		System.out.println("Value of age in int and double parameterized cosntructor:"+obj4.age);
		System.out.println("Value of salary in int and double parameterized constructor:"+obj4.salary);
		
		
		
		
	}

}
