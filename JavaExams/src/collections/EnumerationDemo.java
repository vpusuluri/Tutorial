package collections;
import java.util.*;
public class EnumerationDemo {

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		for(int i=0;i<=10;i++)
				{
			         v.addElement(i);
			        
				}
		 System.out.println("The Elements =" + v);
		 Enumeration e = v.elements();
		 while(e.hasMoreElements())
		 {
			 Integer I = (Integer)e.nextElement();
			 if(I%2 == 0)
				 System.out.println("The Results = " + I);
		 }
		 System.out.println("List of The Elements =" + v);
		 
		

	}

}
