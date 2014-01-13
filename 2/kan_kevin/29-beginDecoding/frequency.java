import java.util.*;
import java.io.*;

public class frequency{
    private double[] CorpusFreqs;
    private double letters;

    public void buildCF(String filename){
	CorpusFreqs = new double[26];
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		String lowercase = s.toLowerCase();
		for (int i = 0; i<lowercase.length(); i++) {
		    char c = s.charAt(i);
		    letters = letters + 1;
		    if (c>='a' && c<='z'){
			int index = c - 'a';
			CorpusFreqs[index] = CorpusFreqs[index] + 1;
		    }
		}
	    }
	}
	catch (Exception e){
	}
	for (int i = 0; i<CorpusFreqs.length; i++){
	    CorpusFreqs[i] = CorpusFreqs[i]/letters;
	}
    }


    public void getCF(){
	for (int i = 0; i<CorpusFreqs.length;i++){
	    System.out.println(CorpusFreqs[i]);
	}
    }
}
