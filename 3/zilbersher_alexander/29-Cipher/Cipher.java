import java.io.*;
import java.util.*;


public class Cipher {

    public String encode(String s, int i) {
	String l = s.toLowerCase(); 
	char[] c = s.toCharArray();
	for (int j = 0;j < c.length;j++) {
	    if (!((int)c[j]>=97) || !((int)c[j]<=122)) {
	    } else if ((int)c[j] + i > 122) {
		c[j] = (char)((((int)c[j] + i)-122)+97);
	    } else {   
		c[j] = (char)((int)c[j] + i);
	    }
	}
	return new String(c);
    }

    public String encodeZam(String original, int offset) {
        String s = original.toLowerCase(); 
        String result="";
        char c;
        for (int i=0;i<s.length();i++) {
            c = s.charAt(i); //for if charAt(i) is not a letter
            if (c>='a' && c<='z') { //if charAt(i) is a letter...
                c = (char)(((c-'a'+offset)%26)+'a'); //c = itself eg: 100
		// - a (97) + the difference (offset), %26 in case the difference is
		// really big, + a (97) so that it's back in the number ranges
            }
            result = result+c;
        }
        return result;
    }

    public void freq(String filename){
        double[] freqCount = new double[26]; //for each letter in alphabet
        int totalChars=0;
        try {
            Scanner sc = new Scanner (new File(filename));
            while (sc.hasNext()) { //while there's a next line
                String s = sc.nextLine(); //s is the next line
                s = s.toLowerCase(); //convert to lower case
                for (int i=0;i<s.length();i++) { //for each letter in s
                    char c = s.charAt(i); //c = that letter
                    if (c>='a' && c<='z'){ //if it's a letter and not punctuation or spacing
                        freqCount[c-'a']++; //add one to that letter in freqCount
                        totalChars++; //total count goes up so that total percentage can be calculated. 
                    }
                }
            }
        } catch (Exception e) {} //so that program runs smoothly
        for (int i=0;i<26;i++) {
            freqCount[i] = freqCount[i]/totalChars; //converts to %s
        }
        System.out.println(Arrays.toString(freqCount));
    }
}