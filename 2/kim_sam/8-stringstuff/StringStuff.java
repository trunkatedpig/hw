import java.io.*;
import java.util.*;

public class StringStuff {
    
    public String capitalize(String name){
	int sp = name.indexOf(" ");
	int length = name.length();
        String capFirst = name.substring(0, 1);
	String restFirst = name.substring(1, sp);
	String capLast = name.substring(sp + 1, sp + 2);
	String restLast = name.substring(sp + 2, length);
	return capFirst.toUpperCase() + restFirst + " " + capLast.toUpperCase() + restLast;
    }

    public String bondify(String name){
	int sp = name.indexOf(" ");
	int length = name.length();
	String first = name.substring(0, sp);
	String last = name.substring(sp + 1, length);
	return last + "," + " " + first + " " + last;
    }
    
    public String pigLatinify(String word){
	int length = word.length();
	if ((word.substring(0,1).equals("a")) 
	    ||
	    (word.substring(0,1).equals("e"))
	    ||
	    (word.substring(0,1).equals("i"))
       	    ||
	    (word.substring(0,1).equals("o"))
	    ||
	    (word.substring(0,1).equals("u"))) {
	    return word + "ay"; }
	else if ((word.substring(0,2).equals("ch"))
		 ||
		 (word.substring(0,2).equals("th"))
		 ||
		 (word.substring(0,2).equals("sh"))) {
	    return word.substring(2,length) + word.substring(0,2) + "ay"; }
	else return word.substring(1,length) + word.substring(0,1) + "ay";
    }
}