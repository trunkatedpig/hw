import java.io.*;
import java.util.*;

public class encode {
    
    public String encode (String s, int j) {
	String lower = s.toLowerCase();
	String result = "";
        char c = 'a';
	int place = 0;
	for (int i=0;i<lower.length();i++) {
	    c = lower.charAt(i);
	    if (c == ' ') {
		result = result + c;
	    } else {
		place = (int) c;
		if (place + j > 122) {
		    place = 96 + (j - (122 - place));
		    result = result + (char) place;
		} else {
		    place = place + j;
		    result = result + (char) place;
		}
	    }
	}
	return result;
    }
}
