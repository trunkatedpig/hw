import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize(String name) {
	String firstname, lastname;
	int posspace;
	posspace = name.indexOf(" ");
	firstname = name.substring(0,1).toUpperCase();
	firstname = firstname + name.substring(1,posspace);
	lastname = name.substring(posspace+1, posspace+2).toUpperCase();
	lastname = lastname + name.substring(posspace+2);
	return firstname + " " + lastname;
    }
    
    public String bondify(String name) {
	String capname, last;
	int Pspace;
	capname = capitalize(name);
	Pspace = capname.indexOf(" ");
	last = capname.substring(Pspace+1);
	return last + ", " + capname;
    }
    
     public String PigLatinify(String word) {
	word = word.toLowerCase();
	String result, s1, s2, s3, s4;
	s1 = word.substring(0,1);
	s2  = word.substring(1);
	s3 = word.substring(0,2);
	s4 = word.substring(2);
	if (s1.equals("a") || s1.equals("e") || s1.equals("i") || s1.equals("o") || s1.equals("u")) {
	    result =  word + "ay";
	}
	if (s3.equals("ch") || s3.equals("th") || s3.equals("sh")) {
	    result = s4 + s3 + "ay";
	}
	else {
	    result = s2 + s1 + "ay";
	}
	return result;
    }
    
}
