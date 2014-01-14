import java.lang.Character;
import java.io.*;
import java.util.*;

public class Cipher{
    private Encrypt e = new Encrypt();
    private double[] CorpusFreqs = new double[26];
    int n;
    private void buildCorpusFreq(String filename){
	double total=0;
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    try{
			c = Character.toLowerCase(c);
			n = c - 'a';
			if (c >= 'a' && c <='z'){
			    CorpusFreqs[n]=CorpusFreqs[n]+1;
			    total++;
			}
		    }catch (Exception e) {}


		}
	    }
	} catch (Exception e) {}
	for (int i=0; i < 26;i++)
	    CorpusFreqs[i]=CorpusFreqs[i]/total;
    }
    public Cipher(){
	buildCorpusFreq("WutheringHeights.txt");
    }
    public double[] getFreq(){
	return CorpusFreqs;
    }
    public String decode(String s){
	double current;
	double closest=0;
	int rot=0;
	double[] letterbag;
	for (int i=0; i<26;i++){
	    letterbag = freq(e.encode(s,i));
	    current = 0;
	    for (int j=0;j<26;j++)
		current = current + Math.pow(CorpusFreqs[j]-letterbag[j],2);
	    current = Math.sqrt(current);
	    if (i == 0)
		closest = current;
	    else{
		if (current < closest){
		    closest = current;
		    rot = i;
		}
	    }
	}
	return e.encode(s,rot);

    }
    public double[] freq(String s){
	double[] letterbag = new double[26];	
	double total=0;
	for (int i=0;i<s.length();i++) {
	    char c = s.charAt(i);
	    try{
		c = Character.toLowerCase(c);
		n = c - 'a';
		if (c >= 'a' && c <='z'){
		    letterbag[n]=letterbag[n]+1;
		    total++;
		}
	    }catch (Exception e) {}
	}
	for (int i=0; i < 26;i++)
	    letterbag[i]=letterbag[i]/total;
	return letterbag;
    }				     
}
	
	
