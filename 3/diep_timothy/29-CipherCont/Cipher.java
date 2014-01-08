import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs;

    public Cipher() {
	CorpusFreqs = new double[26];
    }

    private void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z')
			CorpusFreqs[c-'a']++;
		}
	    }
	} catch (Exception e) {}
    }
    

    public double[] getCorpusFreq() {
	return CorpusFreqs;
    }

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

    public static void main(String args[]) {
	Cipher c = new Cipher();

	c.buildCorpusFreq("TheIliad.txt");
	System.out.println(Arrays.toString(c.getCorpusFreq()));
    }
}
