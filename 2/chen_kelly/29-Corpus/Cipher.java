import java.io.*;
import java.util.*;

public class Cipher{
    private double[] CorpusFreqs = new double[26];

    public String encode(String original, int offset){
        String s = original.toLowerCase();
        String result = "";
        char c;

        for (int i=0;i<s.length();i++){
            c = s.charAt(i);
            if (c>='a' && c<='z') {
                // rotate the character
                c = (char)(((c-'a'+offset)%26)+'a');
            }
            result = result + c;
        }
        return result;
    }

    public void buildCorpusFreqs(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
	        s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if(c >= 'a' && c<= 'z'){
			int index = c - 'a';
			CorpusFreqs[index]++;
		    }
		}
	    } 
	}catch (Exception e) {
	}
    
    }

    public void printFreqs(){
	for(int i = 0; i < 26; i++){
	    String s;
	    int letter = i + 'a';
	    s = (char)letter + ": " + CorpusFreqs[i];
	    System.out.println(s);
	}
    }


    public static void main(String[] args){
        Cipher c = new Cipher();
        System.out.println(c.encode("hello",3));
	c.buildCorpusFreqs("Hamlet.txt");
	c.printFreqs();

    }
}
