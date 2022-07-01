package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToArray 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(32);
		al.add(67);
		al.add(98);
		al.add(100);
		
		System.out.println("The ArrayList elements= " + al);
		Integer arr[] = new Integer[al.size()];
		arr = al.toArray(arr);
		System.out.println("Array elements = " + Arrays.toString(arr));

	}

}
