package General;

import java.util.Scanner;

public class strPalindrome {

	public static void main(String[] args) 
	{
		String original="";
		StringBuffer rev;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string ");
		original = scan.nextLine();
		StringBuffer sb = new StringBuffer(original);
		rev = sb.reverse();
		System.out.println("String Reversed = " + rev);
		if(original.equalsIgnoreCase(rev.toString()))
		{
			System.out.println("Given sring is palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		

	}

}
