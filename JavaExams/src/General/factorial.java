package General;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) 
	{
		int no=0,fact=1;
		System.out.println("Enter the number to get its Factorial");
		Scanner scan = new Scanner(System.in);
		no = scan.nextInt();
		for(int i=1;i<=no;i++)
		{
			fact = fact * i;
		}
		System.out.println("The Factorial of Number " + no + " is " + fact);
				

	}

}
