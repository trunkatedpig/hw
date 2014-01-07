import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs;

    public String encode(String original, int offset) {
	String s = original.toLowerCase();
	String result="";
	char c;

	for (int i=0;i<s.length();i++) {
	    c = s.charAt(i);
	    if (c>='a' && c<='z') {
		c = (char)  (((c-'a'+offset)%26)+'a');
	    }
	    result = result+c;
	}
	return result;
    }
	
    public void buildCorpusFreq(String filename) {
	CorpusFreqs = new double[26];
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if ((c >= 'a') && (c <= 'z')) 
			CorpusFreqs[c-97] = CorpusFreqs[c-97] + 1.0;
		}
	    }
	}
	catch (Exception e) {}
    }

    public static void main(String[] args) {

	Cipher c = new Cipher();
	c.buildCorpusFreq("thewinningofthewest.txt");
	System.out.println(Arrays.toString(c.CorpusFreqs));
    }

}
