import java.io.*;
import java.util.*;

public class Encode{
    
    public String encode(String s, int n){
        s  = s.toLowerCase();
	String ans = "";
	n = n % 26;
	for (i = 0; i < s.length(); i ++) {
	    char c = s.charAt(i);
	    // if it's not a letter, leave it alone and add as it is
	    if (c > 'z' || c < 'a') {
		ans = ans + c;
	    }
	    else {
		// it's a letter, so we add n and then add it
		if (c + n > 'z') {
		    c = (char)(c - 26);
		}
		ans = ans + (char)(c + n);
	    }
	}
	return ans;
    }
    
}

