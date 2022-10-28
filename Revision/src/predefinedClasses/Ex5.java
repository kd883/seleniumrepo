package predefinedClasses;
	class Print12{
		int a=0;
		@Override
	public int hashCode() {
		return 101;
	}
		public String toString() {
			return "I am Print12 student";
		}
		
		
	}

public class Ex5 {

	public static void main(String[] args) {
		Ex5 obj1=new Ex5();
		System.out.println(obj1.toString());
		System.out.println(obj1.hashCode());
		
		Ex5 obj2=new Ex5();
		System.out.println(obj2.toString());
		System.out.println(obj2.hashCode());
		System.out.println("Comparing obj1 and obj2 using equals() method:"+obj1.equals(obj2));
		Ex5 obj3=obj2;
		System.out.println("Comparison of obj2 and obj3 using .equals() method:"+obj2.equals(obj3));
		
		
		Print12 obj4=new Print12();
		System.out.println(obj4.toString());
		System.out.println(obj4.hashCode());
		Print12 obj5=new Print12();
		System.out.println(obj5.toString());
		System.out.println(obj5.hashCode());
		System.out.println("Comparing obj4 and obj5 using .equals() method: "+obj4.equals(obj5));
		
		

	}

}
