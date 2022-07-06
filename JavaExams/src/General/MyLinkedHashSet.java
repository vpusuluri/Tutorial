package General;


import java.util.LinkedHashSet;
	public class MyLinkedHashSet
	{
	public static void main(String args[])
	{
	    int arr[] = {1,2,2,2,3,4,4,5,6,6,7,7,7,7};
	    LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
	    lhs.add(1);
	    lhs.add(2);
	    lhs.add(2);
	    lhs.add(2);
	    lhs.add(2);
	    lhs.add(3);
	    lhs.add(4);
	    lhs.add(4);
	    lhs.add(5);
	    lhs.add(6);
	    lhs.add(6);
	    lhs.add(7);
	    lhs.add(7);
	    lhs.add(7);
	    lhs.add(7);
	    System.out.println("The List elements = " + lhs);
		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println("The List elements = " +
		 * lhs); }
		 */
	    
	}
	}

