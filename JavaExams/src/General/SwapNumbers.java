package General;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) 
	{
		int x,y;
		System.out.println("Enter X and Y values");
		Scanner scan = new Scanner(System.in);
		x= scan.nextInt();
		y=scan.nextInt();
		System.out.println("Before swapping\n X = " +x +"\n Y=" +y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After swapping\n X = " +x +"\n Y=" +y);
		
	}

}
