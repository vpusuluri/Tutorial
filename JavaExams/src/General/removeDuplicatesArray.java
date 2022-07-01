package General;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class removeDuplicatesArray {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		 int a[] = {2,4,2,5,5,6,5,4};
		HashSet<Integer>  lhs = new HashSet<Integer>();
		 int len = a.length;
		 System.out.println("The Array Length = " + len);
		 for(int i=0;i<len;i++)
		 {
			 lhs.add(a[i]);
		 }
		 System.out.println("The Array List Elements = " + lhs);
		 
	}
		
     }
