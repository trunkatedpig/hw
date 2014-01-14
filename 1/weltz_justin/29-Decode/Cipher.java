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
        //System.out.println(Arrays.toString(CorpusFreqs));
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
        //System.out.println(Arrays.toString(textFreqs));
    }
	public double distance(String original){
	    buildText(original);
	    double sum = 0.0;
	    for (int k = 0; k < 26; k++)
		sum +=(CorpusFreqs[k] - textFreqs[k])*(CorpusFreqs[k] - textFreqs[k]);
	    sum = Math.sqrt(sum);
	    return sum;
	}
    public String decode(String original){
	buildCorpus("pg2600.txt");
	String word = original;
	double min = distance(original); 
	for(int i = 0; i<26; i ++){
	    String s = encode(original, i);
	    double n = distance(s);
	    System.out.println(s + "     " + n);
	    if (n < min){
		min = n;
		word = s;
	    }
	}
	return word;
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
        //System.out.println(c.encode("hello",3));
        //c.buildCorpus("pg2600.txt");
	//c.buildText("khoor");
	System.out.println(c.encode("Hi name is justin", 7));
	System.out.println(c.encode("Hello World", 14));git 
	System.out.println(c.decode(c.encode("Hello World", 14)));
	System.out.println(c.decode(c.encode("Hi name is justin", 7)));
    }

}
