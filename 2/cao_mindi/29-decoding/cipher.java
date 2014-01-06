import java.util.*;
import java.io.*;
import java.util.Arrays.*;

public class Cipher{
   
    public static void main(String[] args){
	Cipher c;
	c = new Cipher();
	c.buildCorpusFreq("arabianights.txt");
	System.out.println("[");
	for (int i = 0; i < 27; i ++){
	    System.out.println(c.CorpusFreqs[i] + ",");
    }
	System.out.println("]");
    }

    private double[] CorpusFreqs = new double[26];
    private double x =0;

    public void buildCorpusFreq(String filename){
	try{
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()){
		String s = sc.nextLine();
		s = s.toLowerCase();
		for(int i = 0; i <s.length(); i++){
		    char c = s.charAt(i);
		    if( c >= 97 && c <= 122){
			CorpusFreqs[c -97]= ( CorpusFreqs[c - 97] + 1);
		    }
		}
	    }
	}catch(Exception e) {}
	    
	    for (int i =0; i < CorpusFreqs.length; i ++){
		x = x + CorpusFreqs[i];
	    }
	    for (int i =0; i < CorpusFreqs.length; i ++){
		CorpusFreqs[i] = CorpusFreqs[i]/x;
	    }
	}
}
		    
