package General;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException 
	{
		String fpath = "C:\\Users\\pvbra\\eclipse-workspace\\JavaExams\\src\\General\\myproperties.properties";
		FileInputStream fis = new FileInputStream(fpath);
		Properties prop = new Properties();
		prop.load(fis);
		String uname = prop.getProperty("username");
		System.out.println("The Uname = " + uname);
		
	}

}
