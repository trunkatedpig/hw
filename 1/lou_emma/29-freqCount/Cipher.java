import java.util.*;
import java.io.*;

public class Cipher {

	private double[] CorpusFreqs=new double[26];

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
		
	public void buildCorpusFreq(String filename){
		
		try {
	        Scanner sc = new Scanner (new File(filename));
	        while (sc.hasNext()) {
	            String s = sc.nextLine();
		        s=s.toLowerCase();
	            for (int i=0;i<s.length();i++) {
	              char c = s.charAt(i);
				  if (c >= 'a' && c <= 'z'){
					  int a = (int)(c-'a'); //converts char into int. suitable for array. So 'a' becomes 0, 'b' becomes 1, etc.
					  CorpusFreqs[a] = CorpusFreqs[a] + 1;
		            }
				}
	        } 
		} catch (Exception e) {}
		
		System.out.println (Arrays.toString(CorpusFreqs));
		
	}
}