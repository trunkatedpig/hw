import java.io.*;
import java.util.*;

public class Cipher { 
    public double[] CorpusFreqs;
    
    public void buildCorpusFreqs(String filename) { 
	try { 
	    Scanner sc = new Scanner(new File(filename));
	    while (sc.hasNext()) {
		String l = sc.next();
		l = l.toLowerCase();
		for (int i=0;i<l.length();i++) { 
		    char c = l.charAt(i);
		    if (c >= 'a' && c <= 'z') { 
			int index = c-'a';
			CorpusFreqs[index] = CorpusFreqs[index]+1.0;
		    }
		}
	    }
	}
	catch (Exception e) {}
    }

}

