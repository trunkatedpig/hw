import java.io.*;
import java.util.*;

public class Rot {
    private double[] CorpusFreqs;
    public Rot(){
	CorpusFreqs = new double[26];
    }
    public String rotter(String s, int i){
	s=s.toLowerCase();
	String temp = "";
	for(int j=0;j<s.length();j++){
	    if ((s.charAt(j)<'a')||(s.charAt(j)>'z'))
		temp = temp + s.charAt(j);
	    else{
		if (s.charAt(j)+i<='z')
		    temp = temp + (char)(s.charAt(j)+i);
		else
		    temp = temp + (char)('a'+(i-('z'+1-s.charAt(j))));
	    }
	}
	return temp;
    }
    public String toString(){
	return Arrays.toString(CorpusFreqs);
    }
    public  void buildCorpusFreq(String filename){
	try {
	    Scanner sc = new Scanner (new File(filename));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if ((c>='a')&&(c<='z'))
			CorpusFreqs[c-'a'] = CorpusFreqs[c-'a'] + 1;
		}
	    }
	} catch (Exception e) {}
    }
}
