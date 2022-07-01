package General;

import java.util.Scanner;

public class IntToBinary 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = input.nextInt();
		Integer i = new Integer(number);
		String binary = Integer.toBinaryString(i);
		System.out.println("Binary value= " + binary);

	}

}
