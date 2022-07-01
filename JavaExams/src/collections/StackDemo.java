package collections;
import java.util.*;
public class StackDemo 
{

	public static void main(String[] args) 
	
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println("The stack list" + s);
		System.out.println("Search for element A" + s.search("A"));
		System.out.println("Search for element Z" + s.search("Z"));
		

	}

}
