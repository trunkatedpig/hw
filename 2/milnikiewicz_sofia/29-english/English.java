import java.io.*;
import java.util.*;

public class English {

    private double[] CorpusFreqs = new double[26];
    private double[] CorpusTally = new double[26];
    private int t;

    public static void main(String[] args){
	English e  = new English();
	e.buildCorpusFreq("bible.txt");
	System.out.println(Arrays.toString(e.CorpusFreqs));
    }

    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for (int i=0; i<s.length();i++) {
		    char c = s.charAt(i);
		    if (Character.isLetter(c)) {
			int n = c - 'a';
			CorpusTally[n]++;
			t++;
		    }
		}
	    }
                } catch (Exception e) {
                
                }
         for (int i=0; i<CorpusFreqs.length; i++) {
                 CorpusFreqs[i] = CorpusTally[i]/t;
	 }
    }

}
