import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name) {
	int space = name.indexOf(" ");
	String first = (name.substring (0,1)).toUpperCase() + name.substring(1,space);
	String last =( name.substring(space+1,space + 2)).toUpperCase() + name.substring(space+2);
	String result = first + " " + last;
	return result;
    }
    public String bondify (String name) {
	int space = name.indexOf(" ");
	String last = name.substring(space+1);
	String result = last + ", " + name;
	return result;
    }
    public String piglatinify (String word){
	String firstLetter = word.substring(0,1);
	String firstTwoLetters = word.substring(0,2);
	String result;
	if (firstTwoLetters.equalsIgnoreCase("ch") || firstTwoLetters.equalsIgnoreCase("sh")|| firstTwoLetters.equalsIgnoreCase("th") || firstTwoLetters.equalsIgnoreCase("ph")){
	    result = word.substring(2) + firstTwoLetters + "ay";
	}
	else if (firstLetter.equalsIgnoreCase("a") || firstLetter.equalsIgnoreCase("e") || firstLetter.equalsIgnoreCase("i") || firstLetter.equalsIgnoreCase("o") || firstLetter.equalsIgnoreCase("u")) {
	    result = word + "yay";
	}
	else {
	    result = word.substring(1) + firstLetter + "ay";
	}
	return result;
    }
}


	
