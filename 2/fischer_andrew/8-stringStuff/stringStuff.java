//Andrew Fischer

import java.io.*;
import java.util.*;

public class stringStuff {
    String firstCap;
    String lastCap;
    String afterFirst;
    String afterLast;

    public String capatalize(String name){
	int len = name.length();
	int space = name.indexOf(" ");
	firstCap = name.substring(0,1);
	lastCap = name.substring(space + 1, space + 2);
	afterFirst = name.substring(1, space);
	afterLast = name.substring((space + 2), len);
	
	return firstCap.toUpperCase() + afterFirst + " " + lastCap.toUpperCase() + afterLast;
    }
    
    public String bondify(String name){
	int space = name.indexOf(" ");
	int len = name.length();
	int lastInit = space + 1;
	String firstName = name.substring(0, space);
	String lastName = name.substring(lastInit, len);

	return lastName + ", " + firstName + " " + lastName + ".";
	
    }

    public String pigLatinify(String name){
	String firstLet = name.substring(0,1);
	int len = name.length();
	String wordEnd = name.substring(1,len);
	String word2End = name.substring(2,len);
	String first2 = name.substring(0,2);
	String vows = "a e i o u";
	String result;
	
	if(firstLet == "a"){
	    result = name + "yay";
	}
	if(firstLet == "e"){
	    result = name + "yay";
	}
	if(firstLet == "i"){
	    result = name + "yay";
	}
	if(firstLet == "o"){
	    result = name + "yay";
	}
	if(firstLet == "u"){
	    result = name + "yay";
	}
	else if(first2 == "ch"){
	    result = word2End + "chay";
	}
	else if(first2 == "th"){
	    result = word2End + "thay";
	}
	else if(first2 == "sh"){
	    result = word2End + "shay";
	}
	else{
	    result = wordEnd + firstLet + "ay";
	}
	
	return result;
	
    }
}

//String capitalize(String name) – this will accept a String representing a name (assume names are sent in all lower case, two names, first and last, with one space in between). The method will return a new String representing the name capitalized. So capitalize(“mike zamansky”) will return the String “Mike Zamansky”.



//String bondify(String name) – this will accept a String specifying a name (using the same assumptions as in the previous question) and will return a String in the form “last, first last” as James Bond might do. So, bondify(“James Bond”) would return “Bond, James Bond” and bondify(“Mike Zamansky”) would return “Zamansky, Mike Zamansky.”
