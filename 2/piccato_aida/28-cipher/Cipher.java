import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs;

    public String encode(String s, int offset) {
	String codedWord = "";
	String word = s.toLowerCase();
	for (int i = 0; i < word.length(); i++) {
	    char letter = word.charAt(i);
	    if (letter >= 'a' && letter <= 'z') {
		letter = (char)((letter - 'a' + offset)%26 + 'a');
	    }
	    codedWord = codedWord + letter;
	}
	return codedWord;
    }

    public void buildCorpusFreq(String filename) {
	CorpusFreqs = new double[26];
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine().toLowerCase();
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z') {
			CorpusFreqs[c-'a'] ++;
		    }
		}
	    }
	} catch (Exception e) {}
    }


    public String getFreq(char c) {
	String s = "" + c + ": " + CorpusFreqs[c - 'a']; 
        return s;
    }

}



	    
