import java.util.*;
import java.io.*;
public class Decode {
    private double[] CorpusFreqs = new double[26];
    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		String lower = s.toLowerCase();
		for (int i=0;i<lower.length();i++) {
		    char c = lower.charAt(i);
		    if (c <= 'z' && c >= 'a'){
			CorpusFreqs[ c - 'a' ] = CorpusFreqs[ c - 'a' ] + 1;
		    }
		}
	    }
	} catch (Exception e) {System.out.println(e);}
	System.out.println(Arrays.toString(CorpusFreqs)); 
    }
    public static void  main(String[] args){
	Decode d = new Decode();
	d.buildCorpusFreq("pg2600.txt");
    }
}
