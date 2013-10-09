import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name){
	String first = name.substring(0,1);
	String second = name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2);
	return first.toUpperCase()+name.substring(1,name.indexOf(" "))+" "+second.toUpperCase()+name.substring(name.indexOf(" ")+2);
    }
    public String bondify(String name){
	String theName = capitalize(name);
	String second = theName.substring(theName.indexOf(" ")+1);
	return second + ", " + theName;
    }

    public String pigLatinify(String word){
	String first = word.substring(0,1);
	String last = word.substring(word.length());
	if ("aeiou".contains(first)){
	    return word+"yay";}
	else return word.substring(1)+first+"ay";
	    
	
    }

}