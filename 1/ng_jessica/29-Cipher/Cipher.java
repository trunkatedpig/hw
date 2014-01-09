import java.io.*;
import java.util.*;

public class Cipher {

    private double[] CorpusFreqs = new double[26];
    
    public String caesar (String i, int z) {
	
	if (z > 26) {
	    return "Sorry, invalid entry";
	}
		
	i = i.toLowerCase();
	
	String k = "";
	
	for ( int n = 0; n < i.length(); n ++ ) {
	    char a = i.charAt (n); 
	    int x = (int) a; 
	    x = x + z; 
	    if (x > 122) {
		x = x - 122;
		x = x + 96;
	    }
	    k = k + Character.toString((char)x); 
	}

	return k;

    }

    public String decode (String i, int z) {

	if (z > 26) {
	    return "Sorry, invalid entry";
	}
		
	String k = "";
	
	for ( int n = 0; n < i.length(); n ++ ) {
	    char a = i.charAt (n); 
	    int x = (int) a;
	    x = x - z; 
	    if (x < 97) {
		x = x - 97;
		x = x + 123;
	    }
	    k = k + Character.toString((char)x); 
	}

	return k;

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
