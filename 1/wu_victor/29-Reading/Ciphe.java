import java.util.*;
import java.io.*;

public class Ciphe {
    private double[] CorpusFreqs;

    public void buildCorpusFreq (String filename) {
	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for(int i = 0; i<s.length(); i++) {
		    char c = s.charAt(i);
		    CorpusFreqs[c-'a'] = CorpusFreqs[c-'a'] + 1;
		}
	    }
	} catch (Exception e) {}
    }


}
