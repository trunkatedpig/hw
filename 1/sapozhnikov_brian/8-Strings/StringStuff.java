import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name){
        int space = name.indexOf(" ");
	int length = name.length();
	String s1 = name.substring(0,1);
	String s2 = name.substring(space + 1,space + 2);
	String result;
	s1 = s1.toUpperCase();
	s2 = s2.toUpperCase();
	result = s1 + name.substring(1,space + 1) + s2 + name.substring(space + 2,length);
	return result;
    }

    public String bondify(String name){
	int space = name.indexOf(" ");
	String result;
	String last = name.substring(space + 1);
	result = last + ", " + name;
	return result;
    }
    
    public String pigLatinify (String word) {
	String vowels = "aeiouAEIOU";
	String s = word.substring(0,1);
	String s1 = word.substring(0,2);
	String result;

	if (s1.equalsIgnoreCase("th")||s1.equalsIgnoreCase("ch")||s1.equalsIgnoreCase("sh")){
	    result = word.substring(2) + s1 + "ay";
	}
	else if ( vowels.contains(s)){
	    result = word + "yay";
	}
	else {
	    result = word.substring(1) + s + "ay";
	}
	return result;	
    }
}
