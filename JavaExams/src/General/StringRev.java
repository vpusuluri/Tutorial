package General;

import java.util.Scanner;

public class StringRev 
{

	/*
	 * public static void main(String[] args) {
	 * 
	 * String str = "Automation"; char chars[] = str.toCharArray(); // converted to
	 * character array and printed in reverse order for(int i= chars.length-1; i>=0;
	 * i--) { System.out.print(chars[i]); } }
	 */
	
	
	  public static void main(String[] args)
	  { 
		  String original = "",reverse="";
	  System.out.println("Enter the String"); 
	  Scanner scan = new   Scanner(System.in);
	  original = scan.nextLine(); 
	  int len = original.length();
	  for(int i= len-1;i>=0;i--) 
	  { 
		  reverse = reverse + original.charAt(i);
	         System.out.println("The Reversed String Insdie= " + reverse); 
	  }
	  System.out.println("The Reversed String = " + reverse);
	  
	  }
	 
	
	/*
	 * public static void main(String[] args) { String str = "Madam"; String
	 * reverse=""; char chars[] = str.toCharArray(); for(int i =
	 * chars.length-1;i>=0;i--) { System.out.println("The String Reverse = " +
	 * chars[i]); reverse = reverse + str.charAt(i); }
	 * System.out.println("The String Reverse = " + reverse); }
	 */

}
