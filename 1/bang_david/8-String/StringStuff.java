import java.io.*;
import java.util.*;

public class StringStuff {
    public String capitalize (String name) {
	String s, s1;
	int n = name.indexOf (" ");
	s = name.substring(0, 1).toUpperCase ();
	s1 = name.substring(n+ 1 , n + 2 ).toUpperCase ();
	return s + name.substring (1, n + 1) + s1 + name.substring (n + 2);
	    }

    public String bondify (String name) {
	String s = capitalize (name);
	int n2 = name.indexOf (" ");
	String s2 = s.substring (n2 + 1);
	return s2 + ", " + s;
	    }

    public String PigLatinify (String word) {
	String s = word.substring (0,1).toUpperCase ();
	String s1 = word.substring (0,2).toUpperCase ();

	if (s1.equals ("TH") || s1.equals ("CH") || s1.equals ("SH")) {
	    return word.substring (2) + "ay" + word.substring (0,2);
	}
	else if (s.equals ("A") || s.equals ("E") || s.equals ("I") || s.equals ("O") || s.equals ("U")) {
	    return word + "yay";
	}
	else {
	    return word.substring (1) + "ay" + word.substring (0,1);
							       }
	}
}

	    
