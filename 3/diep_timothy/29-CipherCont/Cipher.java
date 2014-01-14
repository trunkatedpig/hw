import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs;
    private double totalWords = 0.0;

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
		    if (c >= 'a' && c <= 'z') {
			CorpusFreqs[c-'a']++;
			totalWords++;
		    }
		}
	    }
	    for (int i=0; i<26; i++) 
		CorpusFreqs[i] = CorpusFreqs[i]/totalWords;
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

    public String codeCracker(String code){
	code = code.toLowerCase();
	double[] Freqs = new double[26];
	double totalW = 0.0;
	for (int i=0;i<code.length();i++) {
	    char c = code.charAt(i);
	    if (c >= 'a' && c <= 'z') {
		Freqs[c-'a']++;
		totalW++;
	    }
	}
    for (int i=0; i<26; i++) 
	Freqs[i] = Freqs[i]/totalW;
    int minFre
    }


    public static void main(String args[]) {
	Cipher c = new Cipher();

	c.buildCorpusFreq("TheIliad.txt");
	System.out.println(Arrays.toString(c.getCorpusFreq()));
    }
}
