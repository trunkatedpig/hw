import java.util.*;
import java.io.*;

public class StringStuff {
    private String vowels = "aeiou";
    
    public String capitalize(String name) {
	int space = name.indexOf(" ");
	int end = name.length();
	String firstName = name.substring(0,1).toUpperCase() + name.substring(1,space);
	String lastName = name.substring(space + 1,space + 2).toUpperCase() + name.substring(space + 2, end);
	return firstName + " " + lastName;
    }

    public String bondify(String name) {
	String n = capitalize(name);
	int space = n.indexOf(" ");
	int end = n.length();
	String firstName = n.substring(0,space);
	String lastName = n.substring(space + 1, end);
	return "The name is " +  lastName + ", " + firstName + " " + lastName;

    }

    public String pigLatinify (String word) {
	String firstLetter = word.substring(0,1);
	if (vowels.contains(firstLetter)) {
		return word + "yay";
	    }
	else {
	    return word.substring(1) + firstLetter + "yay";
	}
}
}

