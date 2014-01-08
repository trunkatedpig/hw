import java.io.*;
import java.util.*;

public class Cipher {

	private double[] CorpusFreqs;
	private double tot;
	
	public void raiseCorpusFreqs(String filename) {
	  try {
        Scanner sc = new Scanner (new File(filename));
        while (sc.hasNext()) {
            String s = sc.nextLine();
            s = s.toLowerCase();
			for (int i=0;i<s.length();i++) {
              char c = s.charAt(i);             
			 if ((int)c >= 97 && (int) c <= 122) {
				CorpusFreqs[ (int) c  - (int) 'a' ]++;
				tot++;
			}
			
		}
        }
		System.out.println(CorpusFreqs[0]);
		System.out.println(tot);
		for (int i = 0; i < 26; i++) {
			CorpusFreqs[i] = CorpusFreqs[i] / tot;
		}
		
		} catch (Exception e) {}
		
	}
	

public static void main (String[] args) {
	Cipher swiggity = new Cipher();
	swiggity.raiseCorpusFreqs("pg44594.txt");
	}

}