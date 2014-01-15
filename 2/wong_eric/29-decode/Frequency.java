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
			CorpusFreqs[c-'a']++;
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

    public String encode(String original, int offset){
	String s = original.toLowerCase();
	String result = "";
	char c;

	for (int i=0;i<s.length();i++){
	    c = s.charAt(i);
	    if (c>='a' && c<='z') {
		c = (char)(((c-'a'+offset)%26)+'a');
	    }
	    result = result + c;
	}
	return result;
    }

    public double similar(String message) {
	double[] Freqs = new double[26];
	String s = message;
	s=s.toLowerCase();
	int count = 0;

	for (int i=0;i<s.length();i++) {
	    char c = s.charAt(i);

	    if (c >= 'a' && c<='z'){
		int val = c - 'a';
		Freqs[val]++;
		count++;
	    }
	}

	for (int i=0;i<26;i++) {
	    Freqs[i] = Freqs[i]/count;
	}

	double dist = 0.0;

	for (int i=0;i<26;i++) {
	    dist = dist + Math.pow((Freqs[i] - CorpusFreqs[i]), 2);
	}

	dist = Math.sqrt(dist);
	return dist;
    }

    public String decode(String message) {
	String result = "";
	double mindist = 100000.0;
	int offset = 0;

	for (int i=0;i<26;i++) {
	    String s = this.encode(message, i);

	    if (similar(s) < mindist) {
		mindist = similar(s);
		offset = i;
	    }
	}

	result = this.encode(message, offset);
	return result;

    }

    public static void main(String[] args) {

	Frequency f = new Frequency();
	f.buildCorpusFreq("pg2591.txt");
	String s = f.encode("This is a testing sentence to see if it works", 5);
	System.out.println(f.decode(s));

    }

}