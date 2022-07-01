package General;

import java.util.Scanner;

public class CountTheWords
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int count =1;
		for(int i=0;i<s.length()-1;i++)
		{
			System.out.println("The Value of i = " + i);
			System.out.println("Value1= " + s.charAt(i));
			System.out.println("Value2=" + s.charAt(i+1));
			if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
			{
				System.out.println("The Count = " + count);
				count++;
			}
		}
		System.out.println("Number oF words in the string = " + count);
	}
}