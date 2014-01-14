import java.io.*;
import java.util.*;

public class Cipher{
    private double[] CorpusFreqs;
    private int count;

    private void buildCorpusFreq(String filename){
	CorpusFreqs = new double[26];
	count = 0;
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s=s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c<='z'){
		 	int val = c - 'a';
		 	CorpusFreqs[val]++;
			count++;
		    }
		}
	    }
	} 
	catch (Exception e) {}
	for (int i=0;i<26;i++) {
	    CorpusFreqs[i] = CorpusFreqs[i]/count;
	}
    }

    public String rot(String s, int n){
	String ans = "";
	int place = 0;
	for (int i = 0; i < s.length(); i ++){
	    place = s.charAt(i);
	    if ((place >= 'A') && (place <= 'Z')){
		place = place + n;
		if (place > 'Z'){
		    place = place - 26;
		}
		if (place < 'A'){
		    place = place + 26;
		}
	    }
	    else if ((place >= 'a') && (place <= 'z')){
		place = place + n;
		if (place > 'z'){
		    place = place - 26;
		}
		if (place < 'a'){
		    place = place + 26;
		}
	    }
	    ans = ans + String.valueOf((char)place);
	}
	return ans;
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

    public String decode (String message) {
	String result = "";
	double mindist = 100000.0;
	int offset = 0;
	for (int i=0;i<26;i++) {
	    String s = this.rot(message, i);
	    if (similar(s) < mindist) {
		mindist = similar(s);
		offset = i;
	    }
	}
	result = this.rot(message, offset);
	return result;
    }

    public String toString(){
	return Arrays.toString(CorpusFreqs);
    }
   
    public static void main (String args[]){
        Cipher c = new Cipher();
	c.buildCorpusFreq("Dracula.txt");
	String s = c.rot("Shawn jon bong thongs like king kong", 5);
	System.out.println(c.decode(s));

    }

}
