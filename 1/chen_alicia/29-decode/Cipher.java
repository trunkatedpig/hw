import java.util.*;
import java.io.*;
import java.util.Arrays.*;

public class Cipher {

    public static void main (String[] args){
	Cipher c = new Cipher();
	c.buildCorpusFreq("aTaleOfTwoCities.txt");

        for (int i = 0; i < 26; i ++){
            System.out.println((char)('a'+i) + ": " + c.CorpusFreqs[i] + ",");
	}
    }

    private double[] CorpusFreqs = new double[26];
    private double total = 0;


    public void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s =  s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z'){
			CorpusFreqs[c-'a'] = (CorpusFreqs[c-'a'] +1);
		    }
		}
	    }
	} catch (Exception e) {}
	for  (int i = 0;i < CorpusFreqs.length;i++){
	    total = total + CorpusFreqs[i];
	}
	for (int i=0; i < CorpusFreqs.length; i++){
	    CorpusFreqs[i] = CorpusFreqs[i]/total;
	}
    }
}
            
           
