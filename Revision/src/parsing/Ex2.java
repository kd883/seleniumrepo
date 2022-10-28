package parsing;

/*public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int decimalexample=Integer.parseInt("22");
		int signedpositiveexample=Integer.parseInt("+32");
		int signednegativeexample=Integer.parseInt("-12");
		int radixexample=Integer.parseInt("30", 2);
		//int stringexample=Integer.parseUnsignedInt("seeks", 12);
		
		System.out.println(decimalexample);
		System.out.println(signedpositiveexample);
		System.out.println(signednegativeexample);
		System.out.println(radixexample);
		//System.out.println(stringexample);
*/		 

		public class Ex2 {
		    public static void main(String args[])
		    {
		       /* int decimalExample = Integer.parseInt("20");
		        int signedPositiveExample = Integer.parseInt("+20");
		        int signedNegativeExample = Integer.parseInt("-20");
		        int radixExample = Integer.parseInt("20", 16);
		        int stringExample = Integer.parseInt("geeks", 29);
		  
		        System.out.println(decimalExample);
		        System.out.println(signedPositiveExample);
		        System.out.println(signedNegativeExample);
		        System.out.println(radixExample);
		        System.out.println(stringExample);*/
		    	
		    	String s = "77";
		    	  
		        // Primitive int is returned
		        int str = Integer.parseInt(s);
		        System.out.println(str);
		        
		  
		        // Integer object is returned
		        int str1 = Integer.valueOf(s);
		        System.out.println(str1);
	}

}
