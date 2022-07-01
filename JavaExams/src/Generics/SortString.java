package Generics;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) throws Exception {

		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };

		// Display input un-sorted list.
		System.out.println("-------Input List-------");
		   
		// Call to sort the input list.
		Arrays.sort(inputList);
		for(int i=0;i<inputList.length;i++)
		{
			System.out.println("The sorted list =" + inputList[i]);
		}

	

}


