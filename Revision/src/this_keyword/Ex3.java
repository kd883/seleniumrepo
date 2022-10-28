package this_keyword;

	class Student{
		int rollno;
		float fee;
		Student(int rollno,float fee){
			System.out.println("roll no (local variable) is:"+rollno);
			System.out.println("roll no (global variable) is:"+this.rollno);
			System.out.println("fee (local variable) is:"+fee);
			System.out.println("fee(global variable) is:"+this.fee);
			this.rollno=rollno;
			this.fee=fee;
			System.out.println("updated value of rool no(global) is:"+this.rollno);
			System.out.println("updated value of fee(global) is:"+this.fee);
		}
		void display() {
			System.out.println(rollno + ", "+fee);
		}
	}

public class Ex3 {

	public static void main(String[] args) {
		Student obj1=new Student(111,5000f);
		obj1.display();
		Student obj2=new Student(222,6000f);
		obj2.display();
		
		
	}

}
