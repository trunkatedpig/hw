import java.io.*;
import java.util.*;

public class StringStuff {
    
    public String capitalize(String name) {
	if (name.indexOf(" ") == -1 ) {
		return "Invalid input.";}
	else {
	    int space = name.indexOf(" ");

	    String fnamefletter, lnamefletter;
	    fnamefletter = name.substring(0,1);
	    lnamefletter = name.substring(space+1,space+2);

	    return fnamefletter.toUpperCase() + name.substring(1,space+1)
		+ lnamefletter.toUpperCase() + name.substring(space+2);
	}
    }

    public String bondify(String name) {
       	if (name.indexOf(" ") == -1) {
		return "Invalid input.";}
	else {
	    int space = name.indexOf(" ");

	    String lastname;
	    lastname = name.substring(space+1);
	    
	    return lastname + ", " + name;
	}
    }

    public String PigLatinify(String s) {
	String firstletter = s.substring(0,1);
	String f2letters,f3letters;

	if (s.length() > 1) {f2letters = s.substring (0,2);}
	else {f2letters = "";}

	if (s.length() > 2) {f3letters = s.substring (0,3);}
	else {f3letters = "";}

	String returnstring;
	String restofword;

	if (f3letters.equals("str") || f3letters.equals("scr")) {
	    //triple letter consonant
	    restofword = s.substring(3);
	    returnstring = restofword+f3letters+"ay";
	}

	else {
	    if (f2letters.equals("ch") || f2letters.equals("th") || f2letters.equals("sh") 
		|| f2letters.equals("wh") || f2letters.equals("sp") || f2letters.equals("sl")
		|| f2letters.equals("sc") || f2letters.equals("sm") || f2letters.equals("st") 
		|| f2letters.equals("sk") || f2letters.equals("sn") || f2letters.equals("sq") 
		|| f2letters.equals("sw") || f2letters.equals("tw") || f2letters.equals("br") 
		|| f2letters.equals("tr") || f2letters.equals("gr") || f2letters.equals("fr") 
		|| f2letters.equals("dr") || f2letters.equals("cr") || f2letters.equals("pr") 
		|| f2letters.equals("wr") || f2letters.equals("cl") || f2letters.equals("bl") 
		|| f2letters.equals("fl") || f2letters.equals("pl")) {
		//double letter consonant
		restofword = s.substring(2);
		returnstring = restofword+f2letters+"ay";
	    }
	    else { 
		//first letter is vowel
		if (firstletter.equals("a") || firstletter.equals("e") || firstletter.equals("i") || 
		    firstletter.equals("o") || firstletter.equals("u") || firstletter.equals("y")) {
		    returnstring = s+"ay";
		}
		else {
		    //single letter consonant
		    restofword = s.substring(1);
		    returnstring = restofword+firstletter+"ay";
		}
	    }
	}
	return returnstring;	
    }
}
