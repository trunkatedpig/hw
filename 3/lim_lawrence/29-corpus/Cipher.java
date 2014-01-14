import java.util.*;
import java.io.*;

public class Cipher {
    double[] CorpusFreqs;
    
    public boolean isLetter(char c) {
	return ((c>='a' && c<='z') || (c>='A' && c<='Z'));
    }
    public String caesarShift(String s, int n) {
	int offset = n%26;
	String r = "";
	char c;
	for (int i=0; i<s.length(); i++) {
	    c = s.charAt(i);
	    if (isLetter(c)) {
		if (isLetter((char)(c+offset)))
		    r+=(char)(c+offset);
		else
		    r+=(char)(c+offset-26);
	    } else {
		r+=c;
	    }
	}
	return r;
    }

    public void buildCorpusFreq(String filename){
        try {
	    Scanner sc = new Scanner(new File(filename));
	    CorpusFreqs = new double[26];
	    while(sc.hasNext()){
                String s = sc.nextLine();
                s = s.toLowerCase();
                for(int i=0; i<s.length(); i++){
		    char c = s.charAt(i);
		    if (isLetter(c)){
                        CorpusFreqs[c-'a']++;
		    }
                }
	    }
        } catch (Exception e) {
	    System.out.println(e);
	}
	int sum = 0;
	for(int i=0; i<CorpusFreqs.length; i++) {
	    sum+=CorpusFreqs[i];
	}
	for(int i=0; i<CorpusFreqs.length; i++) {
	    CorpusFreqs[i]=CorpusFreqs[i]/sum;
	}
	
	System.out.println(Arrays.toString(CorpusFreqs));
    }
}
