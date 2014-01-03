import java.io.*;
import java.util.*;

public class cipher {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String encode(String x, int offset) {
	String outter = "";
	String inner = x.toLowerCase();
	for (int i = 0; i < inner.length(); i++) {
	    char letter = inner.charAt(i);
	    int index = alphabet.indexOf(letter);
	    if (alphabet.indexOf(letter) == -1) {
		outter = outter + letter;
	    }
	    else if ((index + offset) <= alphabet.length()) {
		outter = outter + alphabet.charAt(index+offset);
	    }
	    else {
		outter = outter + alphabet.charAt(offset-(alphabet.length()-index));
	    }
	}
	return outter;
    }
}
