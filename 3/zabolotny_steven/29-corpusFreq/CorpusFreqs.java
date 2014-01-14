import java.io.*;
import java.util.*;

public class CorpusFreqs {

    private double[] CorpusFreqs;

    private void buildCorpusFreq(String filename) {
	try {
	    CorpusFreqs = new double[26];
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String l = sc.nextLine();
		String s = l.toLowerCase();
		for (int i=0;i < s.length();i++) {
		    char c = s.charAt(i);
		    if (c > 96 && c < 123) 
			CorpusFreqs[c - 97] = CorpusFreqs[c - 97] + 1;
		}
	    }
	} catch (Exception e) {}
    }

    public double[] Freqs(String filename) {
	buildCorpusFreq(filename);
	return CorpusFreqs;
    }

}
		    