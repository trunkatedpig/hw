import java.io.*;
import java.util.*;

public class Cipher{
    private double[] CorpusFreqs = new double[26];
    private double[] FreqFinal = new double[26];
    private int count = 0;

    private void buildCorpusFreq(String filename){
	try{
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()){
		String s = sc.nextLine().toLowerCase();
		for (int i = 0; i < s.length();i++){
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z'){
			int ind = c - 'a';
			CorpusFreqs[ind] = CorpusFreqs[ind] + 1;
			count++;
		    }
		}
	    }
	}
	catch(Exception e){}
    }

    public double[] getFreqs(){
        for (int ind = 0; ind < CorpusFreqs.length; ind++){
	    FreqFinal[ind] = CorpusFreqs[ind] / (double)(count);
	}
	return FreqFinal;
    }
    
    
    public static void main(String[] args){
	Cipher c = new Cipher();
	c.buildCorpusFreq("thePrince.txt");
	System.out.println(Arrays.toString(c.getFreqs()));
    }
}

    
    
