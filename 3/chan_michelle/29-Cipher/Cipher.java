import java.io.*;
import java.util.*;


public class Cipher {
    private double [] CorpusFreqs = new double[26];

    private void buildCorpusFreqs(String filename){
	for (int i=0;i<26;i++){
	    CorpusFreqs[i]=0;
	}
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
	        s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char x = s.charAt(i);
		    if (x >= 'a' && x <= 'z'){
			CorpusFreqs[(int)x - (int)'a'] += 1;
		    }
		}
	    }
		
	    
	} catch (Exception e) {}
	System.out.println(Arrays.toString(CorpusFreqs));
    }

    public static void main(String[] args){
	Cipher c = new Cipher();
	System.out.println("a is: " + (int)('a'));
        System.out.println("a is: " + (int)('z'));
	c.buildCorpusFreqs("pp.txt");
    }
}
