import java.io.*;
import java.util.*;

public class StringStuff{
	public String Capitalize(String name){
		int space = name.indexOf(" ") +1;
		String first = name.substring(1,space);
		String last = name.substring(space+1);
		String capitalized = name.substring(0,1).toUpperCase() + first + name.substring(space, space+1).toUpperCase() + last;
		return capitalized;
	}

	public String Bondify(String name){
		int space = name.indexOf(" ") +1;
		String last = name.substring(space);
		String finalname = last+", "+name;
		return finalname;	
	}
//Currently does not work, I don't know why!!!
	public String PigLatinify(String word){
		//This only works for one word, with no spaces or hyphenations.
		String firstLetter, restOfWord, output, lower, x;
		lower = word.toLowerCase();
		firstLetter = lower.substring(0,1);
		x= firstLetter;
		if (x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u"))
			output = word + "way";
		else{
			restOfWord = lower.substring(1);
			output = restOfWord + firstLetter + "ay";
		}
		return output;
	}
}
