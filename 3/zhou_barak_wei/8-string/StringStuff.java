import java.io.*;
import java.util.*;

public class StringStuff {

	public static String capitalize(String name) {
		String newName = "";
		
		String[] names = name.split(" ");
		
		for (int x = 0; x <= names.length - 1; x = x + 1) {
			newName = newName + names[x].substring(0, 1).toUpperCase() + names[x].substring(1) + " ";
		}
		newName = newName.substring(0, newName.length() - 1); //get rid of last space for technicalities
		return newName;
	}
	
	public static String bondify (String name) {
		String newName = "";
		
		String[] names = name.split(" ");
		
		newName = newName + names[1] + ", " + names[0] + " " + names[1];
		
		return newName;
	}
	
	public static String PigLatinify (String word) {
		String newWord = "";
		String[] vowels = {"a", "e", "i", "o", "u"};
		String[] consonants = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
		if (word.length() < 2) {
			newWord = word;
		}
		else {
			if (Arrays.asList(vowels).contains(word.substring(0,1))) {
				newWord = newWord + word + "way";
				newWord = capitalize(newWord);
			}
			if (Arrays.asList(consonants).contains(word.substring(0, 1))) {
				newWord = newWord + word.substring(1) + word.substring(0, 1) + "ay";
				newWord = capitalize(newWord);
			}
		}
		return newWord;
	}
}