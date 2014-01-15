import java.util.*;
import java.io.*;

public class Cipher{
	private double[] corpusFreqs = new double[26];
	private int total = 0;

	public String encode(String s, int offset){
		s = s.toLowerCase();
		String result = "";

		for (int i=0;i<s.length();i++){
			char toEncode = s.charAt(i);
			if (toEncode >= 97 && toEncode <= 122){
				if (toEncode + offset <= 122)
					result += (char)(toEncode + offset);
				else{
					while (offset > 43){
						offset -= 26;
					}
					result += (char)(toEncode + offset - 26);
				}
			}
			else
				result += (char)toEncode;
		}
		return result;
	}

	public void buildCorpusFreqs(String filename){
		try {
        	Scanner scan = new Scanner (new File(filename));
        	while (scan.hasNext()) {
        	    String s = scan.nextLine().toLowerCase();
        	    for (int i=0;i<s.length();i++) {
					char c = s.charAt(i);
					int tmp = 0;
					if (c>='a' && c<='z'){
						total += 1;
						tmp = (int)(c-'a');
						corpusFreqs[tmp] += 1.0;
					}
        	    }
        	}
        	scan.close();
        	for (int i=0;i<26;i++){
        		corpusFreqs[i] = (corpusFreqs[i]/total)*100.0;
        	}
		}catch(Exception e){}
	}

	public String toString(){
		return Arrays.toString(corpusFreqs);
	}

	public static void main(String[] args){
		Cipher c = new Cipher();
		c.buildCorpusFreqs(args[0]);
		System.out.println(c);
	}
}
