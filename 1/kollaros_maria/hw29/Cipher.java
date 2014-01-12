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
    }

    public String decode(String original){
	int wars = 0;
	String altered = encode(original, 0);
	buildText(altered);
	double luke = 0;
	for (int q = 0; q < 26; q++){
	    luke += (CorpusFreqs[q] - textFreqs[q])*(CorpusFreqs[q] - textFreqs[q]);
	}
	double skywalker = Math.sqrt(luke);

	for(int i = 1; i<26; i ++){
            String changed = encode(original, i);
	    buildText(changed);
            double sum = 0;
            for (int j = 0; j < 26; j++){
                sum += (CorpusFreqs[j] - textFreqs[j])*(CorpusFreqs[j] - textFreqs[j]);
            }
            double small = Math.sqrt(sum);
	    if (small < skywalker){
		skywalker = small;
		wars = i;
	    }
	}
	return encode(original,wars);
    }
	    
            
        
            

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
        c.buildCorpus("LesMis.txt");
	System.out.println(c.encode("hi my name is Maria and I hope this works",7));
	System.out.println(c.decode("op tf uhtl pz thyph huk p ovwl aopz dvyrz"));
	System.out.println(c.encode("I'm trying to think of a sentence to place that has common enough words and letters to be decoded easily and correctly", 18));
	System.out.println(c.decode("a'e ljqafy lg lzafc gx s kwflwfuw lg hdsuw lzsl zsk ugeegf wfgmyz ogjvk sfv dwllwjk lg tw vwugvwv wskadq sfv ugjjwuldq"));
	System.out.println(c.encode("That's what you get, when you let your heart win.",20));
	System.out.println(c.decode("nbun'm qbun sio ayn, qbyh sio fyn siol byuln qch."));
			   
			   
    }

}
