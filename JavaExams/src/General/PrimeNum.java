package General;

import java.util.Scanner;

public class PrimeNum 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int num = scan.nextInt();
		int count = 0;
		/*
		 * if(num == 0 || num ==1) System.out.println("Number is not a prime"); if(num
		 * %2== 0) { System.out.println("Not a prime number"); } else {
		 * System.out.println("It is a prime number"); }
		 */
		
		 for(int i=2; i<num; i++)
	      {
			 System.out.println("Number is = " + num);
	         if(num%i == 0)
	         {
	            count++;
	            break;
	         }
	      }
	      
	      if(count==0)
	         System.out.println("\nIt is a Prime Number.");
	      else
	         System.out.println("\nIt is not a Prime Number.");

	}

}
