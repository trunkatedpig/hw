import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs;

    private void buildCorpusFreq(String filename) {
	String s;
	CorpusFreqs = new double[26];
	try {
	    File f = new File(filename);
	    Scanner sc = new Scanner(f);
	    s = sc.useDelimiter("\\Z").next();
	} catch (FileNotFoundException e) {
	    System.out.println("Java won't let me compile if I don't do this");
	    s = ""; //Oh, Java compiler...
	}
	s.toLowerCase();
	for (int i=0;i<s.length();i++) {
	    char c = s.charAt(i);
	    if (c>='a'&&c<='z')
		CorpusFreqs[c-97]++;
	}
	System.out.println(Arrays.toString(CorpusFreqs));
	System.out.println();
    }

    public String encode(String s, int i) {
	String s1 = s.toLowerCase();
	char[] ca = s1.toCharArray();
        for(int k=0; k<ca.length; k++) {
	    int j = i%26;
	    if (i>0) {
		while(j>0) {
		    if (ca[k]==122)
			ca[k] = 'a';
		    else if (ca[k]>=97&&ca[k]<122)
			ca[k]++;
		    j--;
		}
	    }
	    else {
		while(j<0) {
		    if (ca[k]==97)
			ca[k] = 'z';
		    else if (ca[k]>=97&&ca[k]<122)
			ca[k]--;
		    j++;
		      }
	    }
	}
	return new String(ca);
    }

    public static void main(String[] args) {
	Cipher c = new Cipher();

	c.buildCorpusFreq("TaleOfTwoCities.txt");

	System.out.println("\"abc\" shifted by 2: " + c.encode("abc",2));
	System.out.println("\"xyz\" shifted by 3: " + c.encode("xyz",3));
	System.out.println("\"Testing Capitals and Symbols.\" shifted by 1: " + c.encode("Testing Capitals and Symbols.",1));
	System.out.println("\"backwards\" shifted by -1: " + c.encode("backwards",-1));
	System.out.println("\"over 26\" shifted by 33: " + c.encode("over 26", 33));
	System.out.println("\"under -26\" shifted by -33: " + c.encode("under -26", -33));
    }

}
