import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs = new double[26];

    private void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine().toLowerCase();
		for (int i = 0; i < s.length(); i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z') {
			CorpusFreqs[c - 'a'] = CorpusFreqs[c - 'a'] + 1;
		    }
		}
	    }
	} catch (Exception e) {}
    }

    public String getFreq(char c) {
	int i = c - 'a';
	String s = c + " appears " + CorpusFreqs[i] + " times.";
	return s;
    }

    public static void main(String[] args) {
	Cipher c = new Cipher();

	c.buildCorpusFreq("WizOz.txt");
	System.out.println(c.getFreq('w'));
	System.out.println(c.getFreq('a'));
	System.out.println(c.getFreq('x'));
    }
}