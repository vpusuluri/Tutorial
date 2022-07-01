package collections;
import java.util.*;
// Demo program for Customized sorting 
public class TreeMapDemo1 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
	   @SuppressWarnings("rawtypes")
	TreeMap t = new TreeMap(new MyComparator7());
	   t.put("XXX", 10);
	   t.put("AAA", 20);
	   t.put("ZZZ", 30);
	   t.put("LLL", 40);
	   System.out.println("The TreeMap list =" + t);

	}

}

class MyComparator7 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1= obj1.toString();
		String s2= obj2.toString();
		return s2.compareTo(s1);
	}
}
