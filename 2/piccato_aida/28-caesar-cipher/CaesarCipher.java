import java.io.*;
import java.util.*;

public class CaesarCipher {
    private String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String encode(String w, int offset) {
	String codedWord = "";
	String word = w.toLowerCase();
	for (int i = 0; i < word.length(); i++) {
	    char letter = word.charAt(i);
	    int index = alphabet.indexOf(letter);
	    if (alphabet.indexOf(letter) == -1) {
		codedWord = codedWord + letter;
	    }
	    else if ((index + offset) <= alphabet.length()) {
		codedWord = codedWord + alphabet.charAt(index+offset);
	    }
	    else {
		codedWord = codedWord + alphabet.charAt(offset-(alphabet.length()-index));
	    }
	}
	return codedWord;
    }
		
	    
	    


}
