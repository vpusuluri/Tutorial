package collections;
import java.util.*;
public class NavigableMapDemo {

	public static void main(String[] args) 
	{
		TreeMap<String,String>t = new TreeMap<String,String>();
		
		t.put("b","banana");
		t.put("c","cat");
		t.put("a","apple");
		t.put("d","dog");
		t.put("g","gun");
		System.out.println("The TreeMap List=" +t);
		System.out.println("The ceilingKey=" +t.ceilingKey("c"));
		System.out.println("The higher Key=" +t.higherKey("e"));
		System.out.println("The Floor key=" +t.floorKey("e"));
		System.out.println("The Lower Key=" +t.lowerKey("e"));
		System.out.println("The Poll First Entry=" +t.pollFirstEntry());
		System.out.println("The Poll Last Entry=" +t.pollLastEntry());
		System.out.println("The Decending Map List=" +t.descendingMap());
		System.out.println("The TreeMap List=" +t);
		//System.out.println("The TreeMap List=" +t);

	}

}
