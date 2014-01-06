import java.io.*;
import java.util.*;

public class Cipher { 
    public String encode(String s, int offset) { 
	s = s.toLowerCase();
	String result = "";
	offset = offset%26;
	for (int i=0;i<s.length();i++) { 
	    char c = s.charAt(i);
	    if (c>'z' || c<'a') {
		result = result + c;
	    }
	    else { 
		if (c + offset > 'z') { 
		    c = (char)(c-26);
		}
		result = result + (char)(c+offset);
	    }
	}
	return result;
    }
}

    
