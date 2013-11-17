import java.io.*;
import java.util.*;

public class StringStuff{
    public String capitalize (String name) {
	int space;
	String first, last, f, l;
	space = name.indexOf(" ");
	f = name.substring(0,1);
	first = f.toUpperCase() + name.substring(1,space);
	l = name.substring(space + 1, space + 2);
	last = l.toUpperCase() + name.substring(space + 2);
	return first + " " + last;
    }
    public String bondify(String name){
	int space;
	String first, last, f, l;
	name = name.toLowerCase();
	space = name.indexOf(" ");
	f = name.substring(0,1);
	first = f.toUpperCase() + name.substring(1,space);
	l = name.substring(space + 1, space + 2);
	last = l.toUpperCase() + name.substring(space + 2);
	return last + ", " + first + " " + last;
    }

    public String pigLatinify(String word){
	String latinified, two, f, l, s, st, vowels, diptychs;
	f = word.substring(0,1);
	l = word.substring(word.length() - 1);
	s = word.substring(1);
	st = word.substring(2);
	two = word.substring(0,2);
	vowels = "aeiouAEIOU";
	diptychs = "ch|rh|sh|Ch|Rh|Sh";
	if (vowels.contains(f)){
	    latinified = word + "yay";
	}
	else {
	    if (diptychs.contains(two)){
		latinified = st + two + "ay";
	    }
	    else {
		latinified = s + f + "ay";
	    }
	}
	return latinified;
    }
}
