import java.io.*;
import java.util.*;

public class Cipher {

    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println(c.encode("moopers!!! moop Moop moop DOOPA loop! azAZ`{} :)", 17));
	c.buildCorpusFreq("shakespeare.txt");
	System.out.println(Arrays.toString(c.getCF()));
    }

    private double[] CorpusFreqs;

    public Cipher() {
	CorpusFreqs = new double[26];
    }

    public double[] getCF() {
	return CorpusFreqs;
    }

    public String encode (String input, int shift) {
	shift = shift%26;
	input = input.toLowerCase();
	String output = "";
	for (int i=0;i<input.length();i++) {
	    int asc = (int) input.charAt(i);
	    if (96 < asc && 123 > asc) {
		asc+=shift;
		if (asc > 122)
		    asc = asc-26;
	    }
	    output+= (char)asc;
	}
	return output;
    }

    private void buildCorpusFreq(String filename) {
	int count = 0;
	int[] freqs = new int[26];
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    c=Character.toLowerCase(c);
		    if ('a' <= c && c <= 'z') {
			count+=1;
			freqs[c-'a']+=1;
		    }
		}
	    }
	}  catch (Exception e) {}
	for (int i=0;i<26;i++) {
	    CorpusFreqs[i]=(freqs[i]*1.0/count);
	}
    }
}