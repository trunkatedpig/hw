import java.util.*;
import java.io.*;

public class StringStuff {
    public String capitalize(String name) {
	int space = name.indexOf(" ");
	String temp = name.toUpperCase();
	String first = temp.substring(0,1);
	String last = temp.substring(space + 1, space + 2);
	String result = first + name.substring(1, space + 1) + last + name.substring(space + 2);
	return result;
    }

    public String bondify(String name) {
	name = capitalize(name);
	int space = name.indexOf(" ");
	String firstName = name.substring(0,space);
	String lastName = name.substring(space + 1);
	String result = lastName + ", " + firstName + " " + lastName;
	return result;
    }

    public boolean isVowel(String letter) {
	String vowels = "aeiouAEIOU";
	if (vowels.contains(letter))
	    return true;
	else
	    return false;
    }
    public boolean isDigraph(String seq) {
	String doublechar = "ch|Ch|th|Th|wh|Wh|sh|Sh";
	if (doublechar.contains(seq))
	    return true;
	else
	    return false;
    }
    
    public String piglatinify(String word) {
	String first = word.substring(0,1);
	String ftwo = word.substring(0,2);
	if (isVowel(first))
	    return word + "yay";
	else if (isDigraph(ftwo))
	    return word.substring(2) + ftwo + "ay";
	else
	    return word.substring(1) + first + "ay";
    }
    
}
