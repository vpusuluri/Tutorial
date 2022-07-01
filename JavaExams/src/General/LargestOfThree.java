package General;

import java.util.Scanner;

public class LargestOfThree 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X value");
		int x = scan.nextInt();
		System.out.println("Enter Y value");
		int y = scan.nextInt();
		System.out.println("Enter Z value");
		int z = scan.nextInt();
		if(x > y && x > z)
			  System.out.println("The Largest value = " + x);
		else if(y > x && y > z)
			System.out.println("The Largest value = " + y);
		else if(z > x && z > y)
			System.out.println("The Largest value = " + z);
			


	}

}
