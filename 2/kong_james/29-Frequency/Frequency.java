import java.util.*;
import java.io.*;

public class Frequency{
    public static void main(String[] args){
	Frequency f = new Frequency();
	f.buildCorpusFreq("aliceinwonderland.txt");
	System.out.println("Frequency of the Letter A:" + f.CorpusFreqs[0]);
	System.out.println("Frequency of the Letter B:" + f.CorpusFreqs[1]);
	System.out.println("Frequency of the Letter C:" + f.CorpusFreqs[2]);
	

}

    private double[] CorpusFreqs = new double[26];
    private int total;
    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()){
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i ++){
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z'){
			total = total + 1;
			CorpusFreqs[c - 'a'] = CorpusFreqs[c - 'a'] + 1;
		    }
		}
	    }
	}
	catch (Exception e){}
	for (int i = 0; i < CorpusFreqs.length; i ++){
	    CorpusFreqs[i] = CorpusFreqs[i]/total;
	    }
    }
}
