import java.io.*;
import java.util.*;

public class English {

    private double[] CorpusFreqs = new double[26];

    public static void main(String[] args){
	English e  = new English();
	e.buildCorpusFreq("odyssey.txt");
	System.out.println(Arrays.toString(e.CorpusFreqs));
    }

    private void buildCorpusFreq(String filename){
	int t = 0;
	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0; i<s.length(); i++) {
		    char c = s.charAt(i);
		    if (c >= 'a' && c <= 'z') {
		        CorpusFreqs[c-'a']=CorpusFreqs[c-'a']+1;
			t+=1;
		    }
		}
	    }
                } catch (Exception e) {
                System.out.println(e);
                }
         for (int i=0; i<CorpusFreqs.length; i++) {
                 CorpusFreqs[i] = CorpusFreqs[i]/t;
	 }
    }

    //its not working for some reason :/

}
