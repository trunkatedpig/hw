import java.io.*;
import java.util.*;

public class Cypher {
    public String encode(String s, int offset){
	s = s.toLowerCase();
	String ans = "";
	offset = offset%26;
	for(int i = 0; i<s.length(); i++){
	    char c = s.charAt(i);
	    if (c>'z' || c<'a')
		ans = ans + c;
	    else{
		if (c+offset > 'z')
		    c = (char)(c - 26);
		ans = ans + (char)(c+offset);
	    }
	}
	return ans;
    }
}
