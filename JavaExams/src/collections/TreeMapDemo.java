package collections;
import java.util.*;

/* Demo program for Default natural sorting order */
public class TreeMapDemo 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		@SuppressWarnings("rawtypes")
		TreeMap m = new TreeMap();
		m.put(100, "ZZZ");
		m.put(103, "YYY");
		m.put(101,"XXX");
		m.put(104,106);
		//m.put("FFFF", "XXX");
		//m.put(null, "XXX");
		System.out.println("The TreeMap list =" + m);

	}

}
