import java.io.*;
import java.util.*;

public class Cipher2{

    private double[] corpusFreqs = new double[26];
    private int total = 0;

    public String encode(String words, int move){
	String answer = "";
	for (int i=0; i<words.length(); i++){
	    char a = words.toLowerCase().charAt(i);
	    if (a > 'z' || a < 'a') {
		answer = answer + a;
	    }
	    else if (a >= 'z'-move) {
		int w = a;
		int x = 'z';
		int y = x - w;
		int z = move-y;
		int value = w + z;
		a = (char)value;
		answer = answer + a;
	    }
	    else{
		int w = a;
		int value = w + move;
		a = (char)value;
		answer = answer + a;
	    }
	}
	return answer;
    }

    public void buildCorpusFreqs(String filename){
	try{
	    Scanner s = new Scanner (new File(filename));
	    while (s.hasNext()) {
		String st = s.nextLine().toLowerCase();
		for (int i=0; i<st.length();i++) {
		    char c = st.charAt(i);
		    int integer = 0;
		    if (c>='a' && c<='z'){
			total += 1;
			integer = (int)(c-'a');
			corpusFreqs[integer] += 1.0;
		    }
		}
	    }
	    s.close();
	    for (int i=0;i<26;i++){
		corpusFreqs[i] = (corpusFreqs[i]/total)*100.0;
	    }
	}
	catch(Exception e){}
    }

    public String toString(){
	return Arrays.toString(corpusFreqs);
    }

    public static void main(String[] args){
	Cipher2 c = new Cipher2();
	c.buildCorpusFreqs("Dubliners");
	System.out.println(c);
    }
}

		
