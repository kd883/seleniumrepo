package Propertyfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Ex1 {//Reading data from property file.

	public static void main(String[] args) throws IOException {
		
		//Absolute path:(step-1)
		String filepath=System.getProperty("user.dir")+"\\Propertyfiles\\textfile.properties";
		System.out.println("Current directory is :"+filepath);
		
		//Step-2(Creating an instance of FileInputStream class and passing the property file location to its constructor)
		FileInputStream fis=new FileInputStream("D:\\workspace\\Revision\\Propertyfiles\\textfile.properties");
													//or
		//Step-2(Creating an instance of FileInputStream class and passing the property file location to its constructor)
		FileInputStream fis1=new FileInputStream(filepath);
					
												//or
		//Step-2(Creating an instance of FileInputStream class and passing the property file location to its constructor)
		//This is the best way according to sir.
		FileInputStream fis2=new FileInputStream(".\\Propertyfiles\\textfile.properties");
		
		//Step-3(Creating an instance of Properties class)
		Properties props=new Properties();
		
		//Step-4(Calling load() of Properties class with the help of Properties class reference variable 'props'.
		props.load(fis2);
		
		//Now,reading the data stored in the property file 'textfile.properties'.
		
		System.out.println("username is = "+props.getProperty("username"));
		System.out.println("password is = "+props.getProperty("password"));
		System.out.println("city is = "+props.getProperty("city"));
		System.out.println("car is = "+props.getProperty("car"));
		System.out.println("mobile no is : "+props.getProperty("mobileno"));
		
		//Parsing data from property file into some other data type.
		String mobileno=props.getProperty("mobileno");
		//System.out.println(mobileno);
		
		//Check parsing.
		
		//Now,editing the data stored in property file:
		props.setProperty("username", "ADMIN");
		props.setProperty("car", "suv");
		
		//This edit is temporary and won't be reflected in the property file until we specify the path:
		//To store these changes, we need to use FileOutputStream to save these changes.
		FileOutputStream fos=new FileOutputStream("./Propertyfiles/textfile.properties");
		//use '\' in input stream and use '/' in output stream.
		
		props.store(fos,"added two new keys");//This finally saves the updates.
		
		//close the connection:
		fos.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
