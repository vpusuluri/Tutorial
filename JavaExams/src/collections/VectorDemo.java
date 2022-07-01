package collections;
import java.util.*;
public class VectorDemo 
{

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		Vector v = new Vector();
		System.out.println("Capacity=" + v.capacity());
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		System.out.println("Capacity After Adding elements =" + v.capacity());
		v.addElement("A");
		System.out.println("Capacity After Adding A element =" + v.capacity());
		System.out.println("Vector Elements=" + v);

	}

}
