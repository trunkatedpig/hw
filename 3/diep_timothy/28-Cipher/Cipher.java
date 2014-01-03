import java.io.*;
import java.util.*;

public class Cipher {

    public String encode(String s, int diff) {
	char c;
	String result = "";
	s = s.toLowerCase();
	for (int i=0; i<s.length(); i++) {
	    c = s.charAt(i);
	    if (c >= 'a' && c <= 'z') {
		if (c+diff > 'z') {
		    c = (char) (c + diff - 26);
		} else
		    c = (char) (c + diff);
	    }
	    result = result + Character.toString(c);
	}
	return result;
    }
}
