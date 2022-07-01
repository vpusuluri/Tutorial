package collections;
import java.util.*;

// Write a program to insert String objects into the Treeset where sorting order
// is Reverse of Alphabetical order
public class TreeSetDemo2 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings({ "unchecked", "rawtypes" })
		TreeSet t = new TreeSet(new MyComparator());
		//TreeSet t = new TreeSet();
		t.add("Roja");
		t.add("shobhaRani");
		t.add("RajaKumari");
		t.add("GangaBhavani");
		t.add("Ramulamma");
		System.out.println("The List is = " + t);

	}

}

@SuppressWarnings("rawtypes")
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1 = obj1.toString();
		String s2 = (String)obj2;
		return -s1.compareTo(s2);
	}
}


