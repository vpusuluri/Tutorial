package collections;
// demo program for customized sorting
import java.util.*;
public class PriorityQDemo1 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		PriorityQueue q = new PriorityQueue(15,new MyComparatorQ());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
		System.out.println("The Priority Q list = " + q);

	}

}

class MyComparatorQ implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = (String)obj1;
		String s2 = obj2.toString();
		return s2.compareTo(s1);
	}
}
