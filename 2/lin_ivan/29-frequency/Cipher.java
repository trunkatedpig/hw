import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs = new double[26];

    public String encode(String s, int rot) {
        String lower = s.toLowerCase();
        String coded = "";
        char c;
        rot = rot%26;
        for (int i=0; i<lower.length(); i++) {
            c = lower.charAt(i);
            if (c >= 97 && c <= 122) {
                c = (char)(c + rot);
                if (c > 122) {
                    c = (char)(c - 26);
                }
                else if (c < 97) {
                    c = (char)(c + 26);
                }
            }
            coded = coded + c;
        }
        return coded;
    }

    public void buildCorpusFreq(String filename) {
        try {
            Scanner sc =  new Scanner (new File(filename));
            while (sc.hasNext()) {
                String s = sc.nextLine();
                s = s.toLowerCase();
                for (int i=0; i<s.length(); i++) {
                    char c = s.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        CorpusFreqs[c-'a'] = CorpusFreqs[c-'a']+1;
                    }
                }
            }
        } catch (Exception e) {}
    }

    public double getFreq(char c) {
        return CorpusFreqs[c-'a'];
    }

}