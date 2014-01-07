import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs = new double [26];

    private void buildCorpusFreq (String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		String low = s.toLowerCase();
		for (int i=0;i<low.length();i++) {
		    char c = low.charAt(i);
		    if (c <= 'z' && c >= 'a') {
			CorpusFreqs [c - 'a'] = CorpusFreqs [c - 'a'] + 1;
		    }
		}
	    }
	}
	catch (Exception e) {}
	System.out.println (Arrays.toString(CorpusFreqs));
    }
	
    public static void main (String[] args) {
	Cipher c = new Cipher();
	c.buildCorpusFreq("Shakesphere.txt");
    }
    
}
