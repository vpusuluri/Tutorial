package General;

import java.util.ArrayList;

public class arrayList {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		al.add("10");
		al.add("20");
		al.add("30");
		System.out.println("Array size = " + al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println("The Array List elements= " + al.get(i));
		}
		

	}

}
