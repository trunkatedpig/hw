import java.util.*;
import java.io.*;

//the other half of Cipher is in hw28

public class Cipher {
	private double[] CorpusFreqs;
	
	private void buildCorpusFreq(String filename) {
		CorpusFreqs = new double[26];
		try {
        Scanner sc = new Scanner (new File("shakespeare.txt"));
        while (sc.hasNext()) {
            String s = sc.nextLine().toLowerCase();
            for (int i=0;i<s.length();i++) {
              char c = s.charAt(i);
			  if (c >= 97 && c <= 122) CorpusFreqs[c-97]++;
            }
        }
		}catch (Exception e) {}
	}

	public static void main(String[] args) {
		
	}
}