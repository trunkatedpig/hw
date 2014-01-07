import java.io.*;
import java.util.*;

public class Cipher{
    private double[] CorpusFreqs;

    private void buildCorpusFreq(String filename){
	CorpusFreqs = new double[26];
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s=s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c<='z'){
			int val = c - 'a';
			CorpusFreqs[val]=CorpusFreqs[val] + 1;
		    }
		}
	    }
	} 
	catch (Exception e) {}
    }

    public String toString(){
	return Arrays.toString(CorpusFreqs);
    }
   
    public static void main (String args[]){
        Cipher c = new Cipher();
	c.buildCorpusFreq("Dracula.txt");
	System.out.println(c);
    }

}
