package General;

public class StrReplace {

	public static void main(String[] args) 
	{
		String str = "This is my book";
		String modstr = str.replaceAll("\\s", "");
		System.out.println("The Modified String = " + modstr);

	}

}
