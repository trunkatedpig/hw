import java.util.*;
import java.io.*;
public class Cipher {
    private double[] corpusFreqs;
    public void buildCorpusFreq(String filename) { 
	corpusFreqs = new double[26];
	double sum=0;
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s= s.toLowerCase();
		// do something to the line if you ened to
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if ( c >='a' && c<='z') {
			
			corpusFreqs[c-'a']= corpusFreqs[c-'a']+1;
			sum=sum+1;
			// do something with each character
		    }
		}
	    }
	} catch (Exception e) {
	    System.out.println("Theres a problem here");
	}
	for (int q=0; q<corpusFreqs.length; q++) {
	    corpusFreqs[q] = corpusFreqs[q] / sum;
	}
	
    }
    
    public String decode(String s) {
      	double sum = 0;
	String ret="";
	String retu="";
	double start=0;
	for(int z=0; z<corpusFreqs.length; z++) {
	    double[] freq= new double[26];
	    ret=encode(s,z);
	    sum=0;
	    for (int q= 0; q<ret.length()-1; q++) {
		if (ret.charAt(q) >= 'a' && ret.charAt(q) <= 'z'){
		    freq[ret.charAt(q)-'a']+= 1;
		}
	    }
	    for (int r=0; r< freq.length; r++) {
		sum= sum + (corpusFreqs[r] + freq[r])* (corpusFreqs[r] + freq[r]);
	    }
	    double root  =Math.sqrt(sum);
	    if ( root > start) {
		start= root; 
		retu=ret;
	    }
	    System.out.println(ret + ":" + sum);
	}
	return retu;
	    
    }
    public String encode(String s, int n) {
	String test = s.toLowerCase();
	String ret= "";
	for (int q=0; q<test.length(); q++) {
	    if (test.charAt(q)>=97 && test.charAt(q)<=(122-n)) {
		ret = ret + (char)(test.charAt(q) +n);
	    }
	    else if (test.charAt(q)> (122-n) && test.charAt(q) <=122){
		ret=ret + (char) (97+ (n- (122-(test.charAt(q)-1))));
	    }
	    else {
		ret= ret + test.substring(q,q+1);
	    }
	}
	return ret;
    }

    public String toString(){
	return Arrays.toString(corpusFreqs);
    }
    public static void main (String args[]) { 
	Cipher c= new Cipher();
	c.buildCorpusFreq("metamorphosis.txt");
	System.out.println(c);
	System.out.println(c.decode(args[0]));
    }
}
