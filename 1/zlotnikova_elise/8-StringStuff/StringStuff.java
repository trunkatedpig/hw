import java.io.*;
import java.util.*;

public class StringStuff {

    public String capitalize(String name) { 
        int space = name.indexOf( ' ' );
	int length = name.length();
	String s1= name.substring(0,1);
	String s2 = name.substring(space+1,space+2);
        s1=s1.toUpperCase();
	s2=s2.toUpperCase();
	String result = s1 + name.substring(1,space+1) + s2 + name.substring(space+2,length);
	return result;
    } 
    
    public String bondify(String name) { 
	name = capitalize(name);
	int space = name.indexOf( ' ' );
	int length = name.length();;
	String s2 = name.substring(space+1);
	String result = s2 + ", " + name;
	return result;
    }

    public String PigLatinify(String word) {
	word = word.toLowerCase();
	int length = word.length();
	String vowels = "aeiou";
	String s1 = word.substring(0,1);
	String s2 = word.substring(1,length);
	String s3 = word.substring(0,2);
	String result = "";
	
	if (vowels.indexOf(s1) != -1) { 
	    result = word + "ay";
	}
	else {
	    if (s3.equals("ch") || s3.equals("sh")) {
		result = word.substring(2,length) + s3 + "ay";
	    }
	    else { 
		result = s2 + s1 + "ay";
	    }
	}
	return result; 
    }
}	 
   
