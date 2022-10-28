package this_statement;

class student {
	int rollno;
	float fee;

	student(int rollno) {
		this.rollno = rollno; //assigning the value of local 'rollno' to global 'rollno' by using this keyword.
	}

	student(int rollno, float fee) {
		this(rollno); // here, using this() statement, we are calling constructor of line no.7 and
						// passing another value/ re-initializing the value of rollno.
		this.fee = fee; // assigning the value of local 'fee' to global 'fee' by using this keyword.
	} 

	void display() {
		System.out.println(rollno + "   ,  " + fee);
	}
}

public class Ex3 {

	public static void main(String[] args) {

	}

}
