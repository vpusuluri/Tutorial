package General;

import java.util.Scanner;

public class isPrimeNumber {

	public static void main(String[] args) 
	{
		int num,i=2,count=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		num = scan.nextInt();
		for(i=2;i<num;i++)
		{
			if(num % i == 0)
			{
				count++;
				break;
			}
		}
		if(count == 0)
			 System.out.println("\nIt is a Prime number");
		else
		{
			System.out.println("\nIt is not a Prime number");
		}

	}

}
