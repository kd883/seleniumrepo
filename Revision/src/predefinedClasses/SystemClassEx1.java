package predefinedClasses; //System class example.
 
public class SystemClassEx1 {

	public static void main(String[] args) {
		
		// Checking specific properties of the system.
		System.out.println("System user directory:"+System.getProperty("user.home"));
		System.out.println("Current working directory:"+System.getProperty("user.dir"));
		//System.exit(0);//Stops / Terminates the execution after this line.
		
		// Clearing any already stored property.
		System.clearProperty("user.home");
		System.out.println(System.getProperty("user.home"));// Output will be -NULL.
		
		//Setting specific property.
		System.setProperty("user.home", "F:\\GitAutomation\\MorningBatch13thmay");
		
		//Getting the updated property.
		System.out.println("Updated sysytem directory :"+System.getProperty("user.home"));
		
		//Setting specific property.
		System.setProperty("user.country", "IND");
		
		//Getting the updated property.
		System.out.println("Updated user country :"+System.getProperty("user.country"));
		
		
		//Checking properties other than system property
		//Illustrating getProperty(String key,String def)
		System.out.println("Checking properties other than System properties:"+System.getProperty("User Password","None of your business"));
		
		System.out.println("Difference between current time and miidnight , Jan 1, 1970,UTC is :"+System.currentTimeMillis());
		System.out.println("Current time in nano seconds is : "+System.nanoTime());
		
	}

}
