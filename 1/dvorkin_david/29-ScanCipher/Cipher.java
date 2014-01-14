import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs = new double[26];

	public void buildCorpusFreq(String filename){
	    try {
		Scanner sc = new Scanner (new File(filename));
		while (sc.hasNext()) {
		    String s = sc.nextLine().toLowerCase();
		    // do something to the line if you ened to
		    for (int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z'){
			int x=(int)c;
                        //System.out.println(x);
			CorpusFreqs[x-97]++;
			}
			// do something with each character
		    }
		}
	    } catch (Exception e) {
		e.printStackTrace();
}
	}

public double[] getCorpusFreq(){
    return CorpusFreqs;
}
}
