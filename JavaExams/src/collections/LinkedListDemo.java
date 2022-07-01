package collections;

import java.util.LinkedList;

public class LinkedListDemo 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		 @SuppressWarnings("rawtypes")
		LinkedList ll = new LinkedList();
	      ll.add("durga");
	      ll.add(30);
	      ll.add(null);
	      ll.add("durga");
	      System.out.println("The Linked List after adding  = " + ll);
	      ll.set(0,"software");
	      System.out.println("The Linked List after set = " + ll);
	      ll.add(0,"venky");
	      ll.addFirst("ccc");
	      
	      System.out.println("The Linked List = " + ll);

	}

}
