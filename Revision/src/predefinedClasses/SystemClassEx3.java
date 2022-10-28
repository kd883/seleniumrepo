package predefinedClasses;

	class training{
		training(){
			System.out.println("training class constructor.");
		}
		void manualtesting() {
			System.out.println("I am from manual testing.");
		}
		void automationtesting() {
			System.out.println("I am from automation testing.");
		}
	}

public final class SystemClassEx3 {
	static training t1=new training();

	public static void main(String[] args) {
		System.out.println("Program starts.");
		SystemClassEx3.t1.manualtesting();
		SystemClassEx3.t1.automationtesting();

		//classname.staticrefvariable.non-static_method.
		training t2=new training();
		t2.manualtesting();
		t2.automationtesting();
		System.out.println("Program ends.");
	}

}
