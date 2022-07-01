package General;

import java.util.Scanner;

public class NumReverse {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number to be reversed");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int revnum=0;
		while(num >0)
		{
			revnum=revnum * 10 + num%10;
			num = num/10;
		}
		System.out.println("The Reversed Number = " + revnum);
		

	}

}
