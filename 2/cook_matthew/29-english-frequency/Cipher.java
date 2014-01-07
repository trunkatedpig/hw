import java.util.*;
import java.io.*;
public class Cipher {
    private double[] corpusFreqs;
    public void buildCorpusFreq(String filename) { 
	corpusFreqs = new double[26];
	double sum=0;
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s= s.toLowerCase();
		// do something to the line if you ened to
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if ( c >='a' && c<='z') {
			
			corpusFreqs[c-'a']= corpusFreqs[c-'a']+1;
			sum=sum+1;
			// do something with each character
		    }
		}
	    }
	} catch (Exception e) {
	    System.out.println("Theres a problem here");
	}
	for (int q=0; q<corpusFreqs.length; q++) {
	    corpusFreqs[q] = corpusFreqs[q] / sum;
	}
	
    }
    public String toString(){
	return Arrays.toString(corpusFreqs);
    }
    public static void main (String args[]) { 
	Cipher c= new Cipher();
	c.buildCorpusFreq("metamorphosis.txt");
	System.out.println(c);
    }
}
