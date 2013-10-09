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
}
	    
