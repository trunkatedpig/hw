import java.util.*;
import java.io.*;

public class Frequincy{
    private double[] CorpusFreqs=new double[26];
    
    public void buildCorpusFreq(String fname){
	int total=0;
	try {
	    Scanner sc = new Scanner (new File(fname));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c>='a' && c<='z'){
			CoprusFreqs[c-97]=CorpusFreqs[c-97]+1;
			total=total+1;
		    }
		}
		for (int j=0;j<CorpusFreqs;j++){
		    CorpusFreqs[j]=CorpusFreqs[j]/total;
		}
	    }
	} catch (Exception e) {}
    }

    public static void main(String[] args){
	Frequincy g=new Frequincy
    }
}
