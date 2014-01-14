import java.io.*;
import java.util.*;

public class Cipher {

    public String encode(String s, int rot) {
	String lower = s.toLowerCase();
	String coded = "";
	char c;
	rot = rot%26; // in case bigger than 26
	for (int i=0; i<lower.length(); i++) {
	    c = lower.charAt(i);
	    if (c >= 97 && c <= 122) { // checks if it's a letter
		c = (char)(c + rot);
		if (c > 122) {
		    c = (char)(c - 26);
		}
		else if (c < 97) {
		    c = (char)(c + 26);
		}
	    }
	    coded = coded + c;
	}
	return coded;
    }
}
