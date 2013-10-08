
public class StringStuff
{
	public static String capitalize(String name)
	{
		return name.substring(0,1).toUpperCase() + name.split(" ")[0].substring(1) + " " + name.split(" ")[1].substring(0,1).toUpperCase() + name.split(" ")[1].substring(1);
	}
	
	public static String bondify(String name)
	{
		return name.split(" ")[1] + ", " + name;
	}
	
	public static String pigLatinify(String word)
	{
		if(isVowel(word.charAt(0)))
		{
			return word + "yay";
		}
		else
		{
			return word.substring(1) + word.charAt(0) + "ay";
		}		
		
	}

	public static boolean isVowel(char a)
	{
		return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y';
	}

	public static void main(String[] args)
	{
		System.out.println(capitalize("bames jond"));
		System.out.println(bondify(capitalize("bames jond")));
		System.out.println(pigLatinify("apple"));
		System.out.println(pigLatinify("banana"));
		
	}	

	
}
