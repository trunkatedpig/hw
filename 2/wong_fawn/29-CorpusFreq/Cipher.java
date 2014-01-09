import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs = new double[26];
    private int letterCount = 0;

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
			letterCount ++;
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
            s = (char)c + ": " + CorpusFreqs[i]/letterCount;
            System.out.println(s);
        }
    }

    public String decoder(String s) {
	double[] tempArray;
	double[] distance = new double[26];
	int count;
	for (int i = 0; i < 26; i++) {
	    tempArray = new double[26];
	    count = 0;
	    double sum = 0.0;
	    String str = rotate(s, i);
	    for (int x=0;x<str.length();x++) {
		char c = str.charAt(x);
		if (Character.isLetter(c)){
		    int index = c - 'a';
		    //finds the corpusFreq of the rotated string
		    tempArray[index] = tempArray[index] + 1;
		    count = count + 1;
		}
	    }
	    //compare to the actual corpusFreq
	    for (int x=0; x<26; x++){
		double deltasq = Math.pow((CorpusFreqs[x]/letterCount) - (tempArray[x]/count),2);
		sum = sum + deltasq;
	    }
	    distance[i] = Math.pow(sum, 0.5);	    
	}
	return rotate(s, Collections.min(distance));
    }
}