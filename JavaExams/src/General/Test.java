package General;

public class Test
{

	public static void main(String[] args)
	{
		String s = "^%$#^^&7vijay123456&^**((";
				s= s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("The result =" + s);
	}

	

}
