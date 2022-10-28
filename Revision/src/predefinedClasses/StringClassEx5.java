package predefinedClasses;

public class StringClassEx5 {

	public static void main(String[] args) {
		
		
		String s1="CoreJavaBasics";
		System.out.println("String length:"+s1.length());// Returns the no of characters in the string.
		
		System.out.println("Returns the character at '3rd' index: "+s1.charAt(3));// Returns the character at 'ith' index.
		
		System.out.println("Returns the substring from index 3:"+s1.substring(3));// Returns the substring from 'ith' index.
		
		System.out.println("Returns the substring from index 3 to index 5 :"+s1.substring(3, 5));//Returns the substring from 'ith' to 'j-1' index.
		
		String s2="Core";
		String s3="WorkOut";
		System.out.println("Value of s2( Before Concatination) :"+s2);
		System.out.println("Value of s3( Before Concatination) :"+s3);
		System.out.println("Concatinated Value of s2 and s3:"+s2.concat(s3));
		
		System.out.println("Value of s2 after concatination:"+s2);
		System.out.println("Value of s3 after concatination:"+s3);
		
		String p1="Kanyakumari";
		String p2="Dhanushkodi";
		
		String x1=s2.concat(s3);
		String x2=p1.concat(p2);
		String x3=p1+p2;
		String x4=x1.concat(x2);
		
		String s5="a beautiful mind.";
		//System.out.println("s5 size:"+s5.length());
		System.out.println("Index of mind starts from :"+s5.indexOf("mind")); //Returns the index for the first occurrence of specified string.
		
		System.out.println("Index of a :"+s5.indexOf('a',0));// Gives the index of 'a' after its occurrence at 0th index.
		System.out.println("Index of u :"+s5.indexOf('u',5));// Gives the index of 'u' after its occurrence at 5th index.
		
		
		
		
		
		
		
		
		
		
		}

}
