package General;

import java.util.Scanner;

public class StringLengthWithoutLength 
{

	public static void main(String[] args) 
	{
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the string to find its length");
		   String userInput = scan.nextLine();
		   System.out.println("Lenght of the given string = " + userInput.lastIndexOf(""));


	}

		  
}
