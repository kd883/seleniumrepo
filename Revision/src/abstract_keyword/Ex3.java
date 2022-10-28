package abstract_keyword;

abstract class RBIBank {
	abstract double rateofinterest();

	final void loan() {
		System.out.println("As per RBI loan framework.");
	}
}

class SBI extends RBIBank {
	double rateofinterest() {
		return 6.45;
	}
}

class PNB extends RBIBank {
	double rateofinterest() {
		return 7.5;
	}

}

public class Ex3 {

	public static void main(String[] args) {
		PNB obj1 = new PNB();
		obj1.loan();// we can call this final loan method because of inheritance, but we cannot
					// override it because its declared final.
		System.out.println("PNB rate of interest is :" + obj1.rateofinterest());
		SBI obj2 = new SBI();
		obj2.loan();
		System.out.println("SBI rate of interest is :" + obj2.rateofinterest());
		RBIBank obj3 = new SBI();
		System.out.println("rate of interest through obj3 is:" + obj3.rateofinterest()); // the output will be 6.45 as
																							// the abstratc method of
																							// parent class has been
																							// overridden in the child
																							// class.
		RBIBank obj4 = new PNB();
		System.out.println("rate of interest through obj4 is:" + obj4.rateofinterest()); // the output will be 7.5 as
																							// the abstract method of
																							// the parent class has been
																							// overridden by the child
																							// class.

	}

}
