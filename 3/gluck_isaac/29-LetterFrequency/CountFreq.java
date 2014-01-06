import java.util.*;
import java.io.*;

public class CountFreq{
	private double[] corpusFreqs = new double[26];
	private double numLetters = 0;

	public void buildCorpusFreqs(String filename){
		double[] letterFreq = new double[26];
		try {
        	Scanner scan = new Scanner (new File(filename));
        	while (scan.hasNext()) {
        	    String s = scan.nextLine().toLowerCase();

        	    System.out.println(s);
        	    System.out.println("" + scan.hasNext());
        	    
        	    for (int i=0;i<s.length();i++) {
					char c = s.charAt(i);
					System.out.println(""+c);
					if (c>='a' || c<='z'){
						numLetters += 1.0;
						letterFreq[c-'a'] += 1.0;
					}
        	    }
        	}
        	scan.close();
        	for (int i=0;i<26;i++){
        		corpusFreqs[i] = letterFreq[i]/numLetters;
        	}
		}catch(Exception e){}
	}

	public String toString(){
		String result = "";
		for(int i=0;i<26;i++){
			result +=corpusFreqs[i] + ", ";
		}
		return result;
	}

	public static void main(String[] args){
		CountFreq c = new CountFreq();
		c.buildCorpusFreqs(args[0]);
		System.out.println(c);
	}
}
