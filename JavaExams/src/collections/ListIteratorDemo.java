package collections;
import java.util.*;
public class ListIteratorDemo {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		LinkedList ll = new LinkedList();
		ll.add("balakrishna");
		ll.add("chiru");
		ll.add("venky");
		ll.add("nag");
		System.out.println("The List Elements = " +ll);
		ListIterator ltr = ll.listIterator();
		while(ltr.hasNext())
		{
			String s = (String)ltr.next();
			if(s.contentEquals("venky"))
			{
				ltr.remove();
				
			}
			else if(s.equals("nag"))
			{
				ltr.add("chaitu");
			}
			else if(s.contentEquals("chiru"))
			{
				ltr.set("charan");
			}
				
		}
		System.out.println("The final linked list =" + ll);

	}

}
