package General;

public class GreaterValue {

	public static void main(String[] args) 
	{
		int[] a = {1,3,6,4,8,5};
        
		int temp = a[0];

		for(int i=0;i<a.length;i++) {
		    
		    if(temp<a[i]) {
		        
		        temp = a[i];                
		    }
		    
		}
		System.out.println("The greatest value in the array is "+temp);


	}

}
