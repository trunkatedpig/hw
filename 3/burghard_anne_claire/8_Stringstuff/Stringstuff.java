import java.io.*;
import java.util.*;

public class Stringstuff {
    
    public String capitalize (String name) {
	int space;
	int lastinitial;
	int x;
	String fi;
	String li;
	String first;
	String last;
	String capsname;
	space = name.indexOf(" ");
	lastinitial = space + 1;
	x = lastinitial + 1;
	fi = name.substring(0,1);
	li = name.substring(lastinitial,x);
	fi = fi.toUpperCase();
	li = li.toUpperCase();
	first = name.substring(1,space);
	last = name.substring(x);
	capsname = fi + first + " " + li + last;
	return capsname;
    }	
		
    public String bondify (String name) {
	String first;
	String last;
	String bondname;
	int space;
	int lastinitial;
	space = name.indexOf(" ");
	lastinitial = space + 1;
	first = name.substring (0,space);
	last =  name.substring (lastinitial);
	bondname = last + ", " + first + " " + last;
	return bondname;
    }

    public String piglatinify (String word) {
	String firstletter;
	String lastletter;
	String ending;
	String wordroot;
	String endword;
	String vowels = "aeiou";
	int length;
	length = word.length();
	firstletter = word.substring(0,1);
	lastletter = word.substring(length-1);
	if (vowels.contains(firstletter)) {
	    wordroot = word;
	    if (vowels.contains(lastletter)) {
		    ending = "yay";
		}
	    else {
		    ending = "ay";
		}
	}
	else {
	    wordroot = word.substring(1);
	    ending = firstletter + "ay";
	}
	endword = wordroot + ending;
	return endword;
    }
}
	    




		 

	    
		 

		    
	


