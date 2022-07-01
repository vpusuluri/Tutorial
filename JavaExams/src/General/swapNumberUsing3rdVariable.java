package General;

import java.util.Scanner;

public class swapNumberUsing3rdVariable {

	public static void main(String[] args) 
	{
		int x,y,temp;
		System.out.println("Enter X and Y values to be swapped");
		Scanner scan = new Scanner(System.in);
		x= scan.nextInt();
		y= scan.nextInt();
		System.out.println("Before Swappingr X and Y values " + x + " " +y);
		temp =x;
		x=y;
		y=temp;
		System.out.println("After Swappingr X and Y values " + x + " "+y);
		

	}

}
