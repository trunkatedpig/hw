import java.io.*;
import java.util.*;

public class Cipher {
    public static void main (String args[]){
        Cipher c = new Cipher();

        System.out.println(c.encode("hello",3));
        System.out.println(c.encode("abcxyz",3));
	c.buildCorpusFreq("AllShakespeare.txt");
	System.out.println(c.getFreq('e'));
    }


    private double[] CorpusFreqs;

    public String encode(String word, int e){
        String lword = word.toLowerCase();
        String nword = "";

        for (int i = 0; i < lword.length(); i++){
            char letter = lword.charAt(i);
            if (Character.isLetter(letter)){
                letter = (char)((letter + e - 'a')% 26 +'a');
            }
            nword = nword + letter;

        }
        return nword;
    }
    private void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		// do something to the line if you ened to
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    // do something with each character
		    if (Character.isLetter(c)){
			CorpusFreqs[c - 'a'] = CorpusFreqs[c - 'a'] + 1;
		    }
		}
	    }
	} catch (Exception e) {}
    }


    public String getFreq(char c){
	int i = c - 'a';
	String s = c + "appears" + CorpusFreqs[i] + " times.";
	return s;
    }
}
