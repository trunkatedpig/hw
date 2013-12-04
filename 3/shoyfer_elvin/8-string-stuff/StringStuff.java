import java.io.*;
import java.util.*;

public class StringStuff {
	// default constructor

	public String capitalize(String name) {
		String firstLetter = name.substring(0,1);
		String capFirstLetter = firstLetter.toUpperCase();
		int space = name.indexOf(" ");
		String firstLetterLastName = name.substring(space + 1, space + 2);
		String capFirstLetterLastName = firstLetterLastName.toUpperCase();
		String finalString = capFirstLetter + name.substring(1, space) + " " + capFirstLetterLastName + name.substring(space + 2);
		return finalString; 
	}

	public String bondify(String name) {
		name = capitalize(name);
		int space = name.indexOf(" ");
		String firstName = name.substring(0, space);
		String lastName = name.substring(space + 1);
		return lastName + ", " + firstName + " " + lastName;
	}

	private boolean isVowel(String l) {
		l = l.toUpperCase(); // Vowel will always be checked as an uppercase
		return (l.equals("A") || l.equals("E") || l.equals("I") || l.equals("O") || l.equals("U"));
	}

	public String pigLatinify(String word) {
		// if first letter is vowel, add "yay" to the end
		// if first letter is consonant, add (first letter + "ay") to the end
		String firstLetter = word.substring(0,1);
		String restOfWord = word.substring(1);
		if (isVowel(firstLetter)) {
			return word + "yay";
		} else {
			String addition = firstLetter + "ay";
			return restOfWord + addition;
		}
	}
}