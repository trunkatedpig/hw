import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs;

    public String encode(String s,int n) {
	String shifted = "";
	s.toLowerCase();
	char c = 97;
	char temp = 97;
	for (int i = 0;i<s.length();i++) {
	    temp = s.charAt(i);
	    if (96<temp && 123>temp) {
                temp = (char)(temp + n);
                if (temp >= 123) {
                    temp = (char)(temp - 26);
                }
            }
            c = temp;
            shifted = shifted + c;
        }
        return shifted;
    }

    public void buildCorpusFreq(String filename) {
	int total = 0;
	CorpusFreqs = new double[26];
	try {
        Scanner sc = new Scanner (new File(filename));
        while (sc.hasNext()) {
            String s = sc.nextLine();
	    s.toLowerCase();
            for (int i=0;i<s.length();i++) {
              char c = s.charAt(i);
	      if (c>=97 && c<=123) {
		  CorpusFreqs[c-97] = CorpusFreqs[c-97] + 1;
		  total = total + 1;
	      }
	    }
	}
	} catch (Exception e) {}
	for (int i = 0;i<26;i++){
	    CorpusFreqs[i] = CorpusFreqs[i]/total;
	}
	System.out.println(Arrays.toString(CorpusFreqs));
    }

    public static void main(String[] args) {
	Cipher c = new Cipher();
	System.out.println(c.encode("hello",3));
	c.buildCorpusFreq("Shakespeare.txt");
    }
}
