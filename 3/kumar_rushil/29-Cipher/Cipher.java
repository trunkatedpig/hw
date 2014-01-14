import java.util.*;
import java.io.*;

public class Cipher{
    
    private double[] CorpusFreqs = new double[26];
    private int total;
    public void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()){
		String s = sc.nextLine();
		s.toLowerCase();
		for(int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);
		    if('a' <= c && c <= 'z'){
			total = total + 1;
			CorpusFreqs[c - 'a'] = CorpusFreqs[c - 'a'] + 1.0;
		    }
		}
	    }
	}
	catch(Exception e){}
	System.out.println(Arrays.toString(CorpusFreqs));
	for (int k = 0; k < CorpusFreqs.length; k ++){
	    CorpusFreqs[k] = CorpusFreqs[k]/(double)total;
	}
	System.out.println(Arrays.toString(CorpusFreqs));
    }

    public static void main(String[] args){
	Cipher c = new Cipher();
	c.buildCorpusFreq("hello.txt");
	c.buildCorpusFreq("TheMysteriousAffairAtStyles.txt");
    }	    	
}
