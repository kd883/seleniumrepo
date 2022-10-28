package predefinedClasses; // Split method.

public class StringClassEx4 {

	public static void main(String[] args) {
		String s1 = "I am from Bihar, I am a farmer and also a story teller";
		System.out.println("Actual String :" + s1);
		String[] strarray = s1.split("");
		for (String s : strarray) {
			System.out.println(s);

		}
		System.out.println("********************************");
		String s2 = " I am from Bihar ";
		System.out.println("Actual String s2 is :" + s2);
		String[] strarray2 = s2.split(" ", 3); // Split is a predefined method whose return type is String array.
		for (String s : strarray2) {
			System.out.println(s);
		}
		System.out.println("*********************************");
		String s3 = "I want to travel to israel and japan";
		System.out.println("Actual String s3 is:" + s3);
		String[] str = s3.split(" ");
		String temp = "";
		// for(String s:str) {
		// System.out.println(s);
		// }
		for (int i = str.length - 1; i >= 0; i--) {
			temp = temp + " " + str[i];
		}
		System.out.println("Reverse statement:" + temp);
		System.out.println("***********************************");

		String s4 = "             I am dibyanshu                        ";
		System.out.println("Actual string with paces:" + s4);
		System.out.println("Actual String length:" + s4.length());
		System.out.println("Actual String without spaces:" + s4.trim());// .trim() method removes the additional spaces
																		// at the beginning and end of the string.
		System.out.println("Actual String length without spaces:" + s4.trim().length());
		System.out.println("**************************************");

		String s5 = "                 I         am           Dibyanshu               ";
		System.out.println("Actual String without spaces:" + s5.trim()); // .trim() method removes the additional spaces
																			// in the beginning and end of the string.
		System.out.println("Actual String length:" + s5.length());

	}

}
