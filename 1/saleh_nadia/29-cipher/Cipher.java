import java.io.*;
import java.util.*;

public class Cipher {

    private double [] CorpusFreqs = new double[26];
    private double total = 0;

    public void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if ((int)c>=97 && (int)c<=122) {
			CorpusFreqs[(int)c-(int)'a'] += 1;
			total += 1;
		    }
		}
	    }
	    System.out.println(CorpusFreqs[0]);
	    System.out.println(total);
	    for (int i=0;i<26;i++) {
		CorpusFreqs[i] = CorpusFreqs[i] / total;
	    }
	} catch (Exception e) {}
    }

    public static void main (String args[]){
	Cipher c = new Cipher();
	c.buildCorpusFreq("pg1661.txt");
    }

}
