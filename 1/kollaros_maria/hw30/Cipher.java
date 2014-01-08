import java.io.*;
import java.util.*;

public class Cipher {

    public double[] CorpusFreqs;
    public double[] textFreqs;

    public void buildCorpus(String filename){
        CorpusFreqs = new double[26];
        int totalChars=0;
        String s;
        try {
         Scanner sc = new Scanner (new File(filename));
         while (sc.hasNext()) {
                // do something to the line if you ened to
                s = sc.nextLine();
                s=s.toLowerCase();
                for (int i=0;i<s.length();i++) {
                 char c = s.charAt(i);
                 if (c >= 'a' && c<='z') {
                        CorpusFreqs[c-'a']++;
                        totalChars++;
                 }
                }
         }
        } catch (Exception e) {}


        for (int i=0;i<26;i++) {
         CorpusFreqs[i] = CorpusFreqs[i] / totalChars;
        }
        System.out.println(Arrays.toString(CorpusFreqs));
    }

    public void buildText(String s){
	textFreqs = new double[26];
	int totalText = 0;
	String p = s.toLowerCase();
	for(int i = 0; i < p.length(); i++){
	    char c = p.charAt(i);
	    if( c >= 'a' && c <= 'z'){
		textFreqs[c - 'a']++;
		totalText++;
	    }
	}
	for (int i=0;i<26;i++) {
	    textFreqs[i] = textFreqs[i] / totalText;
        }
        System.out.println(Arrays.toString(textFreqs));
    }

    public String decode(String original){
	for(int i = 0; i<26; i ++){
	    encode(original, i);
	    int sum = 0;
	    for (int j = 0; j < 26; j++){
		sum +=(CorpusFreqs[i] - textFreqs[i])*(CorpusFreqs[i] - textFreqs[i]);
	    }
	    small = Math.sqrt(sum);
	    
	
	    

    public String encode(String original, int offset) {
        String s = original.toLowerCase();
        String result="";
        char c;

        for (int i=0;i<s.length();i++) {
         c = s.charAt(i);
         if (c>='a' && c<='z') {
                c = (char) (((c-'a'+offset)%26)+'a');
         }
         result = result+c;
        }
        return result;
    }
        

    

    public static void main(String[] args) {

        Cipher c = new Cipher();
        System.out.println(c.encode("hello",3));
        c.buildCorpus("Cipher.java");
	c.buildText("khoor");
    }

}