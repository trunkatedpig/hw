import java.io.*;
import java.util.*;

public class Cipher {
    private double[] CorpusFreqs;
    public void buildCorpusFreq(String filename){
	int[] temp  = new int[26];
	CorpusFreqs = new double[26];
	int total = 0;
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNextLine()){
		String s = sc.nextLine();
		for (int i=0; i<s.length();i++){
		    char c = s.charAt(i);
		    if (c>='a' && c<='z'){
			temp[c-97] = temp[c-97] + 1;
			total = total + 1;
		    }
		}
	    }
	    for (int i = 0; i<26; i++){
		CorpusFreqs[i] = temp[i]/(double)total;
	    }
	}
	catch (Exception e) {} 
    }
    public String getList(){
	String ret = "";
	for (int i = 0; i<CorpusFreqs.length; i++){
	    ret+=((char)(i+97) + " " +Double.toString(CorpusFreqs[i]) + "\n");
	}
	return ret;
    }
    public double[] getFreq(String s) {
	int[] temp = new int[26];
	int total = 0;
	for (int i=0; i<s.length();i++){
	    char c = s.charAt(i);
	    if (c>='a' && c<='z'){
		temp[c-97] = temp[c-97] + 1;
		total = total + 1;
	    }
	}
	double[] freq = new double[26];
	for (int i=0; i<26; i++){
	    freq[i] = temp[i]/(double)total;
	}
	return freq;
    }
    
    public double getDist(double[] freq){
	double dist = 0;
	for (int i = 0; i < freq.length; i++){
	    dist = dist + Math.pow((CorpusFreqs[i] - freq[i]),2);
	}
        return Math.sqrt(dist);
    }

    public String encode(String words, int move){
	String ret = "";
	for (int i = 0 ; i<words.length(); i++){
	    char ascii = words.toLowerCase().charAt(i);
	    if (ascii >'z' || ascii  <'a'){
		ret = ret + ascii;
	    }
	    else {
		ascii = (char) ((((int) ascii+move-97)%26)+97);
		ret = ret + ascii;
	    }
	}
	return ret;
    }
    public double[] encodedFreq(double[] d, int move){
	double[] ret = new double[d.length];
	for (int i = 0; i<d.length; i++){
	    ret[(move+i)%26] = d[i];
	}
	return ret;
    }

    public String cipherCracker(String s){
	double[] freq = getFreq(s);
	double[] allDist = new double[26];
	for (int i = 0; i<26; i++){
	    allDist[i] = getDist(encodedFreq(freq, i));
	}
	int leastDistIndex = 0;
	for (int i = 0; i <26; i++){
	    if (allDist[i] <  allDist[leastDistIndex]){
		leastDistIndex = i;
	    }
	}
	return encode(s, leastDistIndex);
    }
    
}
