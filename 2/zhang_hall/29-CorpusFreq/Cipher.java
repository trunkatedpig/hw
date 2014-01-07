import java.io.*;
import java.util.*;
import java.util.Arrays;

public class Cipher {

    private static double[] CorpusFreqs;

    private static void buildCorpusFreq(String filename){
	CorpusFreqs = new double[26];
	    try {
		Scanner sc = new Scanner (new File(filename));
		while (sc.hasNext()) {
		    String s = sc.nextLine();
		    s.toLowerCase();
		    for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c >= 97 && c <= 123){
			    int p = (int)(c-97);
			    CorpusFreqs[p]++;
			}
		    }
		}
	    }
	    catch (Exception e) {}
    }

    public static void main (String [] args){
	Cipher c = new Cipher();
 
	buildCorpusFreq("How to Become an Engineer.txt");
	System.out.println(Arrays.toString(CorpusFreqs));
    }
}
