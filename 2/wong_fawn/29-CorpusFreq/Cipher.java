import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs = new double[26];

    public String rotate(String str, int r){
        str = str.toLowerCase();
        String retStr = "";

        for(int i = 0; i < str.length(); i++) {       
            if ((str.charAt(i) < 'a') || (str.charAt(i) > 'z')){
                retStr += str.charAt(i);
            }
            else {
                if (str.charAt(i) + r <='z')
                    retStr += (char)(str.charAt(i)+r);
                else
                    retStr += (char)('a'+(r - ('z' + 1 - str.charAt(i))));
            }
        }
        return retStr;
    }

    public void buildCorpusFreq(String filename) {
        try {
            Scanner sc = new Scanner (new File(filename));
            while (sc.hasNext()) {
                String s = sc.nextLine().toLowerCase();
                for (int i=0;i<s.length();i++) {
                    char c = s.charAt(i);
                    if (Character.isLetter(c)){
                        int index = c - 'a';
                        CorpusFreqs[index] = CorpusFreqs[index] + 1;
                    }
                }
            }
        } catch (Exception e) {
        }
    }

    public void printCorpusFreqs() {
        for (int i = 0; i < 26; i++) {
            String s;
            int c = i + 'a';
            s = (char)c + ": " + CorpusFreqs[i];
            System.out.println(s);
        }
    }
}