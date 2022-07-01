package collections;
import java.util.*;
public class NavigableSetDemo 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer>t = new TreeSet<Integer>();
		t.add(1000);
		t.add(2000);
		t.add(3000);
		t.add(4000);
		t.add(5000);
		System.out.println("The Navigableset = " + t);
		System.out.println("The Cieling value = " + t.ceiling(2000));
		System.out.println("The higher value = " + t.higher(2000));
		System.out.println("The Floor value = " + t.floor(3000));
		System.out.println("The Lower value = " + t.lower(3000));
		System.out.println("The Poll First value = " + t.pollFirst());
		System.out.println("The Poll Last value = " + t.pollLast());
		System.out.println("The Descending Set = " + t.descendingSet());
		System.out.println("The Navigableset = " + t);
		//System.out.println("The Navigableset = " + t);
		

	}

}
