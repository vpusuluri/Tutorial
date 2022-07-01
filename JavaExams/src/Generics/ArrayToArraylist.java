package Generics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArraylist {

	public static void main (String[] args)
    {
        String[] geeks = {"Rahul", "Utkarsh",
                          "Shubham", "Neelam"};
 
        List<String> al =
            new ArrayList<String>(Arrays.asList(geeks));
        System.out.println(al);
 
        // Adding some more values to the List.
        al.add("Shashank");
        al.add("Nishant");
 
        System.out.println("\nArrayList After adding two" +
                           " more Geeks: ");
        System.out.println(al);
    }
}
