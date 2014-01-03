import java.io.*;
import java.util.*;

public class Encode {

    public String encode(String s, int offset) {

	String ans = "";
	s = s.toLowerCase();

	for (int i=0; i<s.length(); i++) {
	    int current = (int)s.charAt(i);

	    if (current != 95) {
		if ((current + offset) > 122) {
		    current = 97 + current + offset - 122;
		    ans = ans + (char)current;
		}
		else {
		    current = current + offset;
		    ans = ans + (char)current;
		}
	    }
	    else {
		ans = ans + ' ';
	    }

	}

	return ans;

    }



}