package collections;



import java.util.*;
public class HashMapDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		HashMap m =  new HashMap();
		//m.size();
		System.out.println("The initial capacity = " + m.size());
		m.put("Chiranjeevi", 700);
		m.put("Balaiah", 800);
		m.put("Venkatesh", 200);
		m.put("Nagarjuna", 500);
		System.out.println("The Hashmap list = " + m);
		System.out.println("Set key =" + m.put("Chiranjeevi", 1000));
		Set s = m.keySet();
		System.out.println("The KeySet values=" + s);
		Collection c = m.values();
		System.out.println("The set of values=" +c);
		Set s1 = m.entrySet();
		System.out.println("The entry Set list=" + s1);
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			@SuppressWarnings("rawtypes")
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println("Map Entry get Key=" + m1.getKey() + "--" + m1.getValue());
			if(m1.getKey().equals("Nagarjuna"))
			{
				m1.setValue(10000);
			}
			
			
		}
		System.out.println("The hashmap list=" + m);
		
	}

}
