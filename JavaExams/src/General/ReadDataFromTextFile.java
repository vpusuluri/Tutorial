package General;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadDataFromTextFile
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		String fpath = "C:\\Users\\pvbra\\OneDrive\\Desktop\\Datafile.txt";
		File file = new File(fpath);
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine())
		{
			System.out.println("File Contents = " + scan.nextLine());
		}

	}

}
