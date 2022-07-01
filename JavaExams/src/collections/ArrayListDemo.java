package collections;

import java.util.*;


public class ArrayListDemo 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println("The array list elements" +al);
		al.remove(2);
		System.out.println("The array list elements after deletion" +al);
		al.add(2,"m");
		al.add("N");
		System.out.println("The array list elements after modify" +al);
		

	}

}
