package General;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToFile 
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw = new FileWriter("C:\\Users\\pvbra\\OneDrive\\Desktop\\DataWrite.txt");
        BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium automation using Java");
		bw.close();
		
	}

}
