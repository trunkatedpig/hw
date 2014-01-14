import java.util.*;

public class Cipher{
    
    private double[] CorpusFreqs;


    public static void main(String[] args){
	this(sherlock1.txt);
	System.out.println(rotate("hello",3));
	System.out.println(rotate("the quick brown fox",12));
	System.out.println(rotate("the qiuck borwn fx",12));
    }

    public Cipher (String filename){
	buildCorpusFreq(filename);
    }

    private void buildCorpusFreq(String filename){
	int tot = 0;
	CorpusFreqs = new double[26];
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for (int i=0;i<s.length();i++) {
		    char c = Character.toLowerCase(s.charAt(i));
		    if (c>='a' && c<='z'){
			tot += 1;
			CorpusFreqs[c-97] += 1;
		    }
		}
	    }
	}catch (Exception e) {}
	for (int i=0;i<26;i++){
	    CorpusFreqs[i] /= tot;
	}
    }

    public char rotate(char c, int shift){
	c = Character.toLowerCase(c);
	c = (char)((c + shift - 97)%26 + 97);
	return c;
    }

    public String rotate(String s, int shift){
	String result = "";
	for (int i = 0; i < s.length(); i ++){
	    char c = Character.toLowerCase(s.charAt(i));
	    if (c > 96 && c < 96+26){
		result = result + rotate(c,shift);
	    }
	    else {
		result = result + c;
	    }
	}
	return result;
    }

    public String decode(String s){
	int tot = 0;
	int shift = 0;
	String test = s;
	private double[] freqs = new double[26];
	for (int i=0; i<26; i++){
	    rotate(test,1);
	    
	    for (int i=0; i<s.length(); i++){
		char c = Character.toLowerCase(s.charAt(i));
		if (c >= 'a' && c <= 'z'){
		    freqs[c-97]++;
		    tot++;
		}
	    }
		
}