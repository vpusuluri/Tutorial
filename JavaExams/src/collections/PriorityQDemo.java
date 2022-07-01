package collections;
import java.util.*;
public class PriorityQDemo {

	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue q = new PriorityQueue();
		System.out.println("Queue peek =" +q.peek());
		//System.out.println("Queue Element =" +q.element());
		for(int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println("Queue List =" + q);
		System.out.println("Queue Poll =" + q.poll());
		System.out.println("Queue List Again =" + q);

	}

}
