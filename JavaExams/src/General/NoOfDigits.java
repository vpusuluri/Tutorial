package General;

import java.util.Scanner;

public class NoOfDigits {
	//int cnt;
	public static void main(String[] args) 
	{
		int cnt=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number ");
		
		int num = scan.nextInt();
		int temp = num;
		System.out.println("The Number = " + num);
		if(num < 0)
		{
			num = num * -1;
			System.out.println("The Number is Negative =" + num);
		}
		else if(num == 0)
		{
			num=1;
		}
		while(num>0)
		{
			System.out.println("Inside while loop");
              num = num/10;
              cnt++;
	}
		System.out.println("The Number of Digits in the Given number " + temp + "is = " + cnt);

}
}
