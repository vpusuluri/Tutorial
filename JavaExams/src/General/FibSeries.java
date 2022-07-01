package General;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) 
	{
		
		int a=0,b=0,c=1;
		System.out.println("Enter the Number of times");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
			a=b;
			b=c;
			c= a+b;
			System.out.println("The Fibonacci Series is = " + a);
		}
		
		

	}

}
