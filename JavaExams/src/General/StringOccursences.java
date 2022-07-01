package General;

public class StringOccursences 
{

	public static void main(String[] args) 
	{
		
		String str = "String Java And Java String Methods Java";
        String strToFind = "Java";
        int len = str.length();
        System.out.println("Lenght of String = " +len);
        int count = 0, Index = 0;
         //int index = str.indexOf(strToFind, Index);
         //System.out.println("The Result here = " + index);
		
		  while ((Index = str.indexOf(strToFind, Index)) != -1 ) 
		  {
		  
			  System.out.println("Java found at index: " + Index); 
			  count = count +1; 
			  Index++;
			  System.out.println("Count = " + count + "Index =" + Index);
		  
		  }
		 
		/*
		 * if(index >= 0) { count=count+1; index = Index+1; }
		 */
         
        System.out.println("So the total occurrences are: " + count);
         
    }

	

}
