package collections;
import java.util.*;
class TreeSetDemo3 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		TreeSet t = new TreeSet(new MyComparator1()); //jvm internally calls compareTo() which is 
		// meant for customized sorting order(descending order)
		//TreeSet t = new TreeSet(); //jvm internally calls compare() which is meant for
		// default natural sorting order(ascending order)
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		System.out.println("The sorting order =" + t);

	}
}	
	@SuppressWarnings("rawtypes")
	class MyComparator1 implements Comparator
	{
		public int compare(Object obj1,Object obj2)
		{
			Integer i1 = (Integer)obj1;
			Integer i2= (Integer)obj2;
			if(i1<i2)
				return +1;
			else if(i1>i2)
				return -1;
			else
				return 0;
		}
	}


