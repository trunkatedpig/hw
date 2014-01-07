import java.util.*;
import java.io.*;

public class Cipher {

    private double[] CorpusFreqs = new double[26];
    private int total;

    public String encode(String orig, int offset) {
        String result="";
        char c;
        String s = orig.toLowerCase();
        for (int i=0;i<s.length();i++) {
            c=s.charAt(i);
            if (c>='a' && c<='z') {
                c = (char) ( ( (c-'a'+offset)%26 ) +'a');
            }
            result = result + c;
        }
            return result;
    }

    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		String p = s.toLowerCase();
		for (int i=0;i<p.length();i++) {
		    char c = p.charAt(i);
		    int y = 0;
		    if(c>= 'a' && c<='z'){
			total = total + 1;
			y = (int)(c - 'a');
			CorpusFreqs[y] = CorpusFreqs[y] + 1;
		    }
		}
	    }
	    for(int i = 0; i<CorpusFreqs.length; i++){
		CorpusFreqs[i] = CorpusFreqs[i] / total;
	    }
	}
	    catch (Exception e) {}
    }

    public String toString(){
	return Arrays.toString(CorpusFreqs);
    }

    public int Len(){
	return CorpusFreqs.length;
    }
	
	

    public static void main(String[] args){
        Cipher c = new Cipher();
        System.out.println(c.encode("hello",3));
	c.buildCorpusFreq("LesMis.txt");
	System.out.println(c);
	System.out.println(c.Len());
	

    }

}

