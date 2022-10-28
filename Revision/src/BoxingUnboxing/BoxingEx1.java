package BoxingUnboxing;

public class BoxingEx1 {

	public static void main(String[] args) {

		int age = 20;
		System.out.println("Age is:" + age);

		Integer obj1 = 45;// Here, implicit boxing is taking place(Autoboxing-performed by jvm). And we
							// have also used the
							// 'Integer' class which is inbuilt in java.lang package.
		System.out.println("Obj1 is :" + obj1);// Output will be '45' because, toString() method is overridden here.

		Integer obj2 = new Integer(age);// Here, explicit boxing is taking place.(performed by user)
		System.out.println("obj2 is:" + obj2);

		System.out.println(age == obj2);// output will be true.

		Integer obj3 = new Integer(37);// Explicit boxing(performed by user).
		System.out.println("obj3 is :" + obj3);

		Integer obj4 = 90;// Implicit boxing(autoboxing-performed by jvm).
		System.out.println("obj4 is :" + obj4);

		// Now, converting 'char' type into objects.....because all primitive data types
		// can be converted into objects using boxing with the help of wrapper classes.
		
		
		System.out.println();
		char c1='a'; //declaration of char type variable 'c1' with value 'a'.
		Character obj5=c1;//Implicit boxing(Autoboxing-performed by jvm).
		//Character is an in built class in java.lang package.
		
		Character obj6=new Character(c1);//Explicit boxing-performed by the user.
		
		System.out.println("c1 is:"+c1);
		System.out.println("obj5 is:"+obj5);
		System.out.println("obj6 is:"+obj6);
		
		
		

	}

}
