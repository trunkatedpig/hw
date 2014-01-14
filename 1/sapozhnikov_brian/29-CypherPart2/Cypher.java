import java.io.*;
import java.util.*;

public class Cypher {
    private double[] CorpusFreqs = new double[26];
    
    public String encode(String s, int offset){
	s = s.toLowerCase();
	String ans = "";
	offset = offset%26;
	for(int i = 0; i<s.length(); i++){
	    char c = s.charAt(i);
	    if (c>'z' || c<'a')
		ans = ans + c;
	    else{
		if (c+offset > 'z')
		    c = (char)(c - 26);
		ans = ans + (char)(c+offset);
	    }
	}
	return ans;
    }

    public void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while(sc.hasNext()){
		String s = sc.nextLine();
		s = s.toLowerCase();
		for(int i = 0; i<s.length(); i++){
		    char c = s.charAt(i);
		    if (c>='a' && c<='z'){
			CorpusFreqs[c-'a'] = CorpusFreqs[c-'a'] + 1;
		    }
		}
	    }
	} catch (Exception e){}
	//System.out.println(Arrays.toString(CorpusFreqs));
    }
    
}
