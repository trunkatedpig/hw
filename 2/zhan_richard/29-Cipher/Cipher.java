import java.lang.Character;
import java.io.*;
import java.util.*;

public class Cipher{
    private double[] CorpusFreqs = new double[26];
    int n;
    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    try{
			c = Character.toLowerCase(c);
			n = c - 'a';
			if (c >= 'a' && c <='z')
			    CorpusFreqs[n]=CorpusFreqs[n]+1;
		    }catch (Exception e) {}


		}
	    }
	} catch (Exception e) {}
    }
    public Cipher(){
	buildCorpusFreq("WutheringHeights.txt");
    }
    public double[] getFreq(){
	return CorpusFreqs;
    }
}
	
	
