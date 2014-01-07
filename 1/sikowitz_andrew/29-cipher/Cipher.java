import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs;

    public Cipher() {
	CorpusFreqs = new double[26];
	buildCorpusFreq("Anna_Karenina.txt");
    }

    public String encode(String str, int offset) {
        String ans = "";
	String s = str.toLowerCase();

	if (offset < 0)
	    offset = offset + 26;

	for (int i=0; i<s.length(); i++) {
	    ans += rotate(s.charAt(i), offset);
	}

	return ans;
    }
    
    public char rotate(char c, int offset) {
	if (c >= 97 && c <= 122)
	    c = (char) ((int)c + offset);
        if (c > 122)
	    c = (char) ((int)c - 26);
	
	return c;
    }

    private void buildCorpusFreq(String filename) {
	try {
	    Scanner scan = new Scanner(new File(filename));
	    int total = 0;

	    while (scan.hasNext()) {
		String s = scan.nextLine();
		s = s.toLowerCase();
	    
		for (int i=0; i<s.length(); i++) {
		    char c = s.charAt(i);
		    total++;
		    if (c >= 97 && c <= 122)
			CorpusFreqs[c-97]++;
		}
	    }

	    for (int i=0; i<CorpusFreqs.length; i++)
		CorpusFreqs[i] = CorpusFreqs[i] / total;

	} catch (Exception e) {}
    }


    public double[] getCorpusFreqs() {
	return CorpusFreqs;
    }

    public void printCorpusFreqs() {
	for (int i=0; i<CorpusFreqs.length; i++)
	    System.out.println((char) (i+97) + ": " + CorpusFreqs[i]);
    }

    public double[] getFrequency(String s) {
	double[] freq = new double[26];
	int total = 0;

	for (int i=0; i<s.length(); i++) {
	    char c = s.charAt(i);
	    total++;
	    if (c >= 97 && c <= 122)
	        freq[c-97]++;
	}

	for (int i=0; i<freq.length; i++)
	    freq[i] = freq[i] / total;

	return freq;
    }
	
    public double getDifference(String rotated) { //Assumes encoded is lowercase
	double[] freq = getFrequency(rotated);
	double diff = 0;

	for (int i=0; i<freq.length; i++)
	    diff += Math.abs(freq[i] - CorpusFreqs[i]);

	return diff;
    }

    public int decode(String encoded) {
	double min = getDifference(encoded);
	int ans = 0;
	double nextDiff;

	for (int i=1; i<26; i++) {
	    nextDiff = getDifference(encode(encoded, i));
	    if (min > nextDiff) {
	        min = nextDiff;
		ans = i;
	    }
	}

	return ans;
    }
	    

    public static void main(String[] args) {
	Cipher c = new Cipher();
	c.printCorpusFreqs();
	String x = c.encode("I really like to eat pizza", 10);
	System.out.println(c.decode(x));
	System.out.println(c.encode(x, c.decode(x)));
    }
		
}
