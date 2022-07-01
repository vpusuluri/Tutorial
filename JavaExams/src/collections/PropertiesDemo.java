package collections;
import java.io.*;
import java.util.*;
public class PropertiesDemo 
{

	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\pvbra\\eclipse-workspace\\JavaExams\\src\\collections\\abc.properties");
		p.load(fis);
		System.out.println("The propertyies = " + p);
		String s = p.getProperty("venki");
		System.out.println("The property value = " +s);
		p.setProperty("nag", "88888");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\pvbra\\eclipse-workspace\\JavaExams\\src\\collections\\abc.properties");
		p.store(fos, "Updated by user ");
		

	}

}
