package interface_;

	interface bank{
		float rateofinterest(); // by default public and abstract.
	}
	class SBI implements bank{
		public float rateofinterest() {
			return 9.15f;
		}
	}
	class PNB implements bank{
		public float rateofinterest() {
			return 8.50f;
		}
	}

public class Ex3 {

	public static void main(String[] args) {
		SBI obj1=new SBI();
		System.out.println("SBI ROI : "+obj1.rateofinterest());
		PNB obj2=new PNB();
		System.out.println("PNB ROI : "+obj2.rateofinterest());
		bank obj3=new SBI();
		System.out.println("ROI : "+obj3.rateofinterest());
	}

}
