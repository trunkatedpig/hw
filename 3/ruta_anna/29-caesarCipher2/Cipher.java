import java.io.*;
import java.util.*;

public class Cipher {

	public double[] CorpusFreqs;
	public double Total;

	public Cipher(){
		buildCorpusFreqs("Shakespeare.txt");
	}

    public String caesarEncode(String word, int n) {
		word = word.toLowerCase();
		String result = "";
		for (int i = 0; i<word.length(); i++){
			int index = (int) word.charAt(i);
			if (index >= 97 && index <= 122){
				char newC = '-';
				int newChar = index + n;
				if (newChar <= 122){
					newC = (char)(newChar);
				} else {
					index = (newChar - 122) + 96;
					newC = (char)(index);
				}
				result = result + newC;
			}
			else
				result = result + word.charAt(i);
		}
		return result;
	}

	public String caesarEncode2 (String word, int n) {
		word = word.toLowerCase();
		String result = "";
		for (int i = 0; i<word.length(); i++){
			int index = (int) word.charAt(i) - 97;
			if (index >= 0 && index <= 25){
				int newChar = ((index+n)%26) + 97;
				char newC = (char) (newChar);
				result = result + newC;
				}
			else
				result = result + word.charAt(i);
		}
		return result;
	}

	public String rot13 (String word) {
		return caesarEncode2(word, 13);
	}

	private void buildCorpusFreqs(String filename) {
		CorpusFreqs = new double[26];
		try {
			Scanner sc = new Scanner (new File(filename));
		    while (sc.hasNext()) {
		    	String s = sc.nextLine();
		    	s = s.toLowerCase();
		        for (int i=0; i<s.length(); i++) {
		        	int c = (int) s.charAt(i) - 97;
		            if (c >= 0 && c <= 25){
						CorpusFreqs[c] = CorpusFreqs[c] + 1.0;
						Total = Total + 1.0;
					}
		       	}
			}
			sc.close();
			for (int j=0; j<CorpusFreqs.length; j++) {
				CorpusFreqs [j] = (CorpusFreqs[j] / Total) * 100.0;
			}
        } catch (Exception e) {}
	}

	public String toString(){
		return Arrays.toString(CorpusFreqs);
	}

}