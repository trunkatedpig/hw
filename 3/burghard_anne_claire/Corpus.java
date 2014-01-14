import java.util.*;
import java.io.*;

public class Corpus{

    private double[] CorpusFreqs;
    private int total = 0;

    private void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(Dubliners));
	    while (sc.hasNext()) {
		for (int i=0;i<sc.length;i++) {
		    char c = sc.charAt(i);
		    if (c >= 'a' && c <= 'z') {
			CorpusFreqs[c-'a'] += (c*1.0);
			total++;
		    }
		}
	    } 
	}
	catch (Exception e) {}
	for (int i=0; i<CorpusFreqs.length; i++) {
	    CorpusFreqs[i] = CorpusFreqs[i] / total;
	}
    }

    public String string() {
	CorpusFreqs.toString();
    }
}
