import java.io.*;
import java.util.*;


public class Cipher {
    public String encode (String string, int offset) {
        String preencoded = string.toLowerCase();
        if (offset == 26 || offset ==0) {
            return preencoded;
        }
        String encoded = "";
        for (int i = 0; i < preencoded.length  () ; i ++) {
            char a = preencoded.charAt (i);
            if ( a + offset > 'z') {
                a = (char)( a + offset -  26);
            }
            else if (a + offset < 'a') {
                a = (char) ( a +  offset +  26);
            }
            else {
                a =(char) (a + offset);
            }
            encoded = encoded +  a ;
        }
        return encoded;
    }

    private double[] CorpusFreqs = new double [26];
  

    private void buildCorpusFreq(String filename) {
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		String a = s.toLowerCase();

		for (int i=0;i<a.length();i++) {
		    char c = a.charAt(i);
		    if (c >= 97 && c <= 122){
			CorpusFreqs [c - 97] = CorpusFreqs [c - 97] + 1;
		    }
		}
	    }
	} catch (Exception e) {}
	
    }
    
    public double getCorpusFreqs (int i) {
	return CorpusFreqs[i];
    }

    public static void main(String[] args) {
	Cipher c = new Cipher();
	c.buildCorpusFreq ("TheLittleMaidofIsrael");
	for (int i = 0; i < 26; i ++) {
	    System.out.println ( (char) (i+97) + "---" + c.getCorpusFreqs (i));
	}

	System.out.println(c.encode("hello",3));
	System.out.println(c.encode("abcxyz",3));
    }
}
