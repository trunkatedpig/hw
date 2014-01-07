import java.io.*;
import java.util.*;

public class Frequency {

    private double[] CorpusFreqs;

    private void buildCorpusFreq(String filename) {

	CorpusFreqs = new double[26];
	int letters = 0;

	try {

            Scanner sc = new Scanner (new File(filename));

            while (sc.hasNext()) {
        	String s = sc.nextLine();
		s = s.toLowerCase();
            
            	for (int i=0;i<s.length();i++) {
              	    char c = s.charAt(i);
		    letters = letters + 1;
		    
		    if (c>='a' && c<='z') {
			CorpusFreqs[c-'a'] = CorpusFreqs[c-'a'] + 1;
		    }

		}
              	    
            }

        } catch (Exception e) {}

	for (int i=0;i<CorpusFreqs.length;i++) {
	    CorpusFreqs[i] = CorpusFreqs[i]/letters;
	}

    }

    public void getFreq() {
	
	for (int i=0;i<CorpusFreqs.length;i++) {
	    System.out.println(CorpusFreqs[i]);
	}

    }

    public static void main(String[] args) {

	Frequency f = new Frequency();
	f.buildCorpusFreq("pg2591.txt");
	f.getFreq();

    }

}