import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs = new double[26];
    private int numLetters = 0;

    public void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c>='a' && c<= 'z'){
			CorpusFreqs[(int)(c-'a')]++;
			numLetters++;
		    }
		}
	    }
	    for (int i=0;i<26;i++) {
		CorpusFreqs[i] = CorpusFreqs[i] / numLetters;
	    }
	    for (int i=0;i<26;i++){
		System.out.println((char)(i+(int)('a'))+": "+CorpusFreqs[i]);
	    }
	    
	} catch (Exception e) {}
    }	     


    public static void main(String[] args){
	Cipher c = new Cipher();
	c.buildCorpusFreq("book.txt");

    }

}
