package collections;
import java.util.*;
public class IteratorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		System.out.println("The list items = " +al);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Integer n = (Integer)itr.next();
			if(n%2 == 0)
				System.out.println("The filtered List Items = " + n);
			else
				itr.remove();
		}
		System.out.println("The Array list elements = " + al);

	}

}
