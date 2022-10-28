package predefinedClasses;

import java.util.Scanner;

public class StringClassEx3 {

	public static void main(String[] args) {
		
		String str1="Dharwad";
		char c=str1.charAt(0);
		System.out.println("char at index 0 is :"+c);
		
		// To print all the characters of the string one by one.
		for(int i=0;i<str1.length();i++) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("********************************");
		
		//Now, we will be printing the characters of the string one by one starting from the last index.
		for(int i=str1.length()-1;i>=0;i--) {
			System.out.println(str1.charAt(i));
		}
		System.out.println("********************************");
		String temp=" ";
		for(int i=str1.length()-1;i>=0;i--) {
			temp=temp+str1.charAt(i);
		}
		
		System.out.println("str1 is :"+str1);
		System.out.println("temp is :"+temp);
		//System.out.println(reverseString("dharwad"));
		
		String s1="Bangalore";
		System.out.println(reverseString(s1));
		
		Scanner scn=new Scanner(System.in);
		String s2;
		System.out.println("Enter the String to be reversed:");
		s2=scn.next();
		System.out.println("Reversed String is :"+reverseString(s2));
		
		//Palindrome of string.
		
		String s3;
		System.out.println("Enter String to check for palindrome:");
		s3=scn.next();
		palinString(s3);
			
	}
	
	static String reverseString(String str) { // A method to reverse any given string.
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		return temp;
	}
	static void palinString(String str) {
		String s1=str;
		String temp=" ";
		for(int i=str.length()-1;i>=0;i--) {
			temp=temp+str.charAt(i);
		}
		if(temp.equals(s1)) {
			System.out.println("Given String is palindrome. "+str);
		}
		else {
			System.out.println("Given String is not a palindrome. "+str);
		}
			
		}
	}
	


