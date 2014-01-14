import java.util.*;
import java.io.*;

public class Caesar{
    public String decode;
    public String shakespeare;
    public int[] percentage = new int[26];
    public double[] charPercent = new double[26];

    public Caesar(){
	try {
	    Scanner sc = new Scanner (new File("shakespeare.txt"));
	    while (sc.hasNext()) {
		String s = sc.nextLine();
		s = s.toLowerCase();
		for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c>='a' && c<='z')
			percentage[c-97] = percentage[c-97]+1;
		    else{}
		}
	    }
	}catch (Exception e){}

	double total = 0;
        for(int x=0; x<percentage.length; x++){
	    total = total + (double)percentage[x];
	}

	for(int x=0; x<charPercent.length; x++){
	    charPercent[x] = (double)percentage[x]/total;
	}	
    }
    
    public String encode(String s, int n){
	n = n%26;
	s = s.toLowerCase();
	String str = "";
	for (int x=0; x<s.length();x++){
	    char c = s.charAt(x);
	    if (c >= 'a' && c <= 'z'){
		//if they're lowercase alphabets
		if (c+n > 122)
		    str = str + (char)(97+(c+n - 123));
		else
		    str = str + (char)(c+n);
	    }
	    else
		str = str + (char)c;
	}
	return str;
    }

    public double[] corpusFreqs(String s){
	int[] sPercent = new int[26];
	s = s.toLowerCase();
	for (int i=0;i<s.length();i++) {
		    char c = s.charAt(i);
		    if (c>='a' && c<='z')
			sPercent[c-97] = sPercent[c-97]+1;
		    else{}
	}
	double total = 0;
        for(int x=0; x<sPercent.length; x++){
	    total = total + (double)sPercent[x];
	}
	double[] sCharPercent = new double[26];
	for (int i=0; i<sCharPercent.length; i++){
	    sCharPercent[i] = (double)sPercent[i]/total;
	}
	return sCharPercent;
    }
    
    public double distanceFormula(double[] sCharPercent){
	double sum = 0;
	for (int i=0; i<26; i++){
	    sum = sum + (Math.pow((sCharPercent[i] - charPercent[i]), 2));
	}
	return (Math.pow(sum, 0.5));
    }
    
    public String decode(String s){
	double[] distances = new double[26];
	//one for each offset
	for (int i=0; i<26; i++){
	    distances[i] = distanceFormula(corpusFreqs(encode(s, i)));
	}
	double min = distances[0];
	int minindex = 0;
	for (int i=1; i<26; i++){
	    if (distances[i] < min){
		min = distances[i];
		minindex = i;
	    }
	}
	return encode(s, minindex);

    }
    
 
}
