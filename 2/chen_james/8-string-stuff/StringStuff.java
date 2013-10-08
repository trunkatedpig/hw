import java.io.*;
import java.util.*;

//really messy right now, gonna clean it up later.

public class StringStuff {

	public String capitalize(String name) {
		String x;
		x = name.toUpperCase();
		return x;	
	}
	
	public int getLocationFirstName (String name) { //gets the location of where first name ends
		int getFirstName = name.indexOf(" ");
		return getFirstName;
	}
	
	public String getFirstName (String name) { //returns actual first name as string
		
		String firstName = name.substring(0,getLocationFirstName(name));
		return firstName;
	}
	
	public int getLength (String name) { //measures the length
		int getLength = name.length();
		return getLength;
	
	}
	
	public String getLastName (String name) { //returns actual last name as String
		String lastName = name.substring(getLocationFirstName(name) + 1,getLength(name));
		return lastName;
	
	}
	
	public String bondify(String name) {
		return getLastName(name) + ", " + getFirstName(name) + " " + getLastName(name);
	}
	
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


}