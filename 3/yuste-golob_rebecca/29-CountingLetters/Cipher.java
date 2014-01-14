import java.io.*;
import java.util.*;

public class Cipher{
    private  double[] CorpusFreqs;

    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		System.out.println(s.length());
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    System.out.println(c);
		    CorpusFreqs[c - 'a'] = CorpusFreqs[c - 'a'] + 1;
		    System.out.println(CorpusFreqs[c - 'a']);
		}
	    }
	} 
	catch (Exception e) {}
    }

    public String toString(){
        return Arrays.toString(CorpusFreqs);
    }
    

    public static void main(String[] args){
	Cipher c = new Cipher();
	c.buildCorpusFreq("shakespeare");
	System.out.println(c);
    }
}

/*Keeps returning null. I think it has something to do with reading the book in, because when I started playing around with it, I found that it only scanned the first line of the book*/
