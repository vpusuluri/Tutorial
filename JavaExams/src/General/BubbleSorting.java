package General;

public class BubbleSorting
{
  public static void main(String[] args)
  {
     int a[] = {50,20,80,10};
     int temp;
     for(int i=0;i<a.length;i++)
     {
         for(int j=i+1;j<a.length;j++)
         {
           if(a[i]>a[j])
           {
              temp=a[i];
              a[i]=a[j];
              a[j]=temp;
           }
        }
    }
     for(int i=0;i<a.length;i++)
     {
         System.out.println("The bubble sort results = " + a[i]);
     }
}
}