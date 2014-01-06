import java.io.*; 
import java.util.*; 

public class Caesar {

    public String caesar (String i, int z) {
	
	if (z > 26) {
		return "Sorry, invalid entry";
	    }
		
	i = i.toLowerCase();
	
	String k = "";
	
	for ( int n = 0; n < i.length(); n ++ ) {
	    char a = i.charAt (n); 
	    int x = (int) a; 
	    x = x + z; 
	    if (x > 122) {
		x = x - 122;
		x = x + 96;
	    }
	    k = k + Character.toString((char)x); 
	}

	return k;

    }

    public String decode (String i, int z) {

	if (z > 26) {
		return "Sorry, invalid entry";
	    }
		
	String k = "";
	
	for ( int n = 0; n < i.length(); n ++ ) {
	    char a = i.charAt (n); 
	    int x = (int) a;
	    x = x - z; 
	    if (x < 97) {
		x = x - 97;
		x = x + 123;
	    }
	    k = k + Character.toString((char)x); 
	}

	return k;

    }
}
