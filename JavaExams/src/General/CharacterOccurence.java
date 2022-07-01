package General;

public class CharacterOccurence {

	public static void main(String[] args) 
	{
		String str = "Java is Java again Java again";
		char c = 'g';
		int len = str.length();
		System.out.println("The lenght of the string = " + str.length());
		String str1 = str.replace("g","");
		int newlen = str1.length();
		System.out.println("The Modified String length  = " + newlen);
		//System.out.println("The Str1 = " + str1);
		int count = str.length() - str.replace("g","").length();
		int count1 = len -newlen;
		System.out.println("Number of Occurences = " + count1);
		System.out.println("The Number of ocurances of 'g' in " + str + " = " + count);

	
	int cnt=0;
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i) == 'J')
		{
			cnt++;
		}
	}
	System.out.println("Number of Occurences = " +  cnt);
	}
}
