package BoxingUnboxing;

public class BoxingEx2 {

	public static void main(String[] args) {
		
		
		char c1='a';// Just declaration.
		
		Character obj1=new Character(c1);//Explicit boxing-performed by us (user).
		System.out.println(c1==obj1);
		Character obj2=new Character('q');//Explicit boxing-performed by user.
		
		Character obj3='w';//Implicit boxing(Autoboxing-performed by jvm).
		
		System.out.println("c1 is:"+c1);
		System.out.println("obj1 is:"+obj1);
		System.out.println("obj2 is:"+obj2);
		System.out.println("obj3 is:"+obj3);
		
		
		//Now converting boolean type into object.
		
		boolean b=true;//Just declaration.
		Boolean obj4=new Boolean(b);//Explicit boxing.
		System.out.println(obj4==b);
		System.out.println("obj4 is:"+obj4);
		
		
		
	}

}
