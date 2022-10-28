package BoxingUnboxing;

public class UnboxingEx1 {

	public static void main(String[] args) {

		Double obj1 = 34.5678;// Implicit boxing.(capital 'D'-Built in class in java.lang package).
		System.out.println("obj1 is:" + obj1);

		double salary = obj1.doubleValue();// Unboxing using .doubleValue() method for converting Boolean object into
											// boolean data type.
		System.out.println("Salary is:"+salary);
		
		Boolean obj2=true;//Implicit boxing.
		boolean b=obj2.booleanValue();//Unboxing operation.
		System.out.println("b is:"+b);
		
		Integer obj3=89;//Implicit boxing.
		int i=obj3.intValue();//Unboxing operation.
		System.out.println("i is:"+i);
		
		Character obj4='r';//Implicit boxing operation
		char c=obj4.charValue();//Unboxing operation.
		System.out.println("c is:"+c);
		
		Character obj5=new Character('t');//Explicit boxing operation.
		char d=obj5.charValue();//Unboxing operation.
		System.out.println("d is:"+d);
		
	}

}
